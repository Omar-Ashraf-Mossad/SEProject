import java.util.ArrayList;

public class ServiceControl {
	
	

	ServiceProvider choose_SP()
	{
		
		//create new system services
				SystemServices s1 = SystemServices.getInstance();
				String name;
				
				
				SearchForm f = new SearchForm();
				ArrayList<String> l2 = s1.get_providers();
				
				
				String message2 = ":\n-----------------\nChoose the service provider you want:";
				
				
				name = f.start(l2, message2);
				
				
				if(name == null)
					return null;
				
				ServiceProvider p = s1.get_SP(name);
				
				return p;
	}
	
	
}
