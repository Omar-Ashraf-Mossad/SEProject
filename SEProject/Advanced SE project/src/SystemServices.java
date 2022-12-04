import java.util.ArrayList;

public class SystemServices {
	private ArrayList<Service> list = new ArrayList<Service>();
	
	private static SystemServices mainobject;
	//initialize the lists
	private SystemServices() {
		
		
		Service s = new Service(Services.MobileRecharge);
		s.add_SP(new WeRecharge());
		
		Service s2 = new Service(Services.LandLine);
		Service s3 = new Service(Services.InternetPayment);
		Service s4 = new Service(Services.Donations);
		
		
		list.add(s4);    list.add(s3);     list.add(s2);      list.add(s);
		
	}
	//Make one instance 
	public static SystemServices getInstance () {
		if (mainobject == null) { mainobject = new SystemServices(); }
		return mainobject;
	}
	
	//get list of services Types in a string
	ArrayList<String> get_services()
	{
		
		//List of enum
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i =0;i<list.size();i++)
		{

			Service s = list.get(i);
			l.add(s.get_type().toString());
			
		}
		return l;
	}
	
	//Get a specific Service using its enum
	Service get_service(String  e)
	{
		Service s = null ;
		for(int i =0;i<list.size();i++)
		{

			 s = list.get(i);
			if(s.get_type().toString()==e)
				break;
			
		}
		return s;
	}
	
	
}
