import java.util.ArrayList;

public class ServiceControl {
	
	
	ServiceProvider choose_SP()
	{
		
		//create new system services
				SystemServices s1 = SystemServices.getInstance();
				
				//get list of enums of services type
				ArrayList<String> l1 = s1.get_services();
				
				//let user choose the service
				SearchForm f = new SearchForm ();
				String name = f.start(l1, "Choose the Service you want");
				
				
				if(name == null)
					return null;
				//get instance of the object with the chosen enum
				Service s = s1.get_service(name);
				//get list of service providers names
				
				
				ArrayList<String> l2 = s.get_providers();
				
				
				String message2 = s.get_type()+":\n-----------------\nChoose the service provider you want:";
				
				
				name = f.start(l2, message2);
				
				
				if(name == null)
					return null;
				
				ServiceProvider p = s.get_SP(name);
				
				return p;
	}
}
