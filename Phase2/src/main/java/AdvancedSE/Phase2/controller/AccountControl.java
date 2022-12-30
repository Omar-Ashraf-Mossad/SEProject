package AdvancedSE.Phase2.controller;

import AdvancedSE.Phase2.userPack.User;
import AdvancedSE.Phase2.userPack.UserDataAccess;
import AdvancedSE.Phase2.userPack.UsersList;
import AdvancedSE.Phase2.Response;
import AdvancedSE.Phase2.MonitoringClasses.Currently_logined;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/Users")
public class AccountControl {
	
	UsersList list = UsersList.getInstance();
	
	@PostMapping(value = "/signup")
	public String sign_up(@RequestParam("name") String name,@RequestParam("email")String email,@RequestParam("password")String password)
	{
		
	
		if(list.check_name(name)) {
			return "This user name is already taken";
		}
		if(list.check_email(email) || email.equals("admin"))
		{
			return "This email is already used";
		}
		
		User u = new User(name,password,email);
		list.add_user(u);
		return "registeration completed";
		
	}
	
	@GetMapping("/login/{e}/{p}")
	public Response<User> log_in(@PathVariable("e")  String email,@PathVariable("p") String password)
	{
		
		Response<User> r = new Response<User>();
		User u = null;
		if(list.check_exist(email, password))
		{
			Currently_logined c = Currently_logined.getInstance();
			
			u = list.get_user(email);
			
			UserDataAccess a = new UserDataAccess(u);
			long key = System.currentTimeMillis();
			
			if(!c.add(key, a))
			{
				r.setStatus(false);
				r.setMessage("You are already logged in the system");
				r.object = null;
				return r;
			}
		
			r.setStatus(true);
			r.setMessage("Successfly Logined! Use this key to access other operations "+ key);	
			r.object = u;
			
		}
		else
		{
			r.setStatus(false);
			r.setMessage("Failed to log in wrong input");
			r.object = null;
		}
		return r;
		
	}
}
