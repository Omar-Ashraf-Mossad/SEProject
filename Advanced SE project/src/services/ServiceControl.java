package services;
import java.util.ArrayList;

import serviceprovider.ServiceProvider;

public class ServiceControl {
	
	public ServiceProvider search_SP(String name)
	{
		
		//create new system services
				SystemServices s1 = SystemServices.getInstance();
				
				
				ArrayList<String> l2;
				SearchForm f = new SearchForm();
				
				
				if(name.toUpperCase().equals( "ALL"))
				{
					 l2 = s1.get_providers();
					 
				}
					
				else
					l2 = s1.get_providers(name);
				
				
				String message2 = ":\n-----------------\nChoose the service provider you want:";
				
				
				name = f.start(l2, message2);
				
				
				if(name == null)
					return null;
				
				ServiceProvider p = s1.get_SP(name);
				
				return p;
	}
	
	
	
	
	
}
