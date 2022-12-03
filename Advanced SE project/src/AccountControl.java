
public class AccountControl implements Isign{
	
	UsersList list = new UsersList();
	
	
	public String sign_up(String name,String email,String password)
	{
		if(list.check_name(name)) {
			return "This user name is already taken";
		}
		if(list.check_email(email))
		{
			return "This email is already used";
		}
		
		User u = new User(name,password,email);
		list.add_user(u);
		return null;
		
	}
	public boolean log_in(String email,String password)
	{
		if(list.check_exist(email, password))
		{
			User u = list.get_user(email);
			UserConsole c = u.get_form();
			c.start();
			
			return true;
		}
		return false;
	}
}
