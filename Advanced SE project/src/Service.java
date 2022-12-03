import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Service {

	private Services type;
	private float discount;
	private boolean cash_on_delivery = false;
	private ArrayList<ServiceProvider> list = new ArrayList<ServiceProvider>();
	private static  Map<Services,Service> servicerecord = new HashMap<Services,Service>(); 
	
	
	//Create a new service object and choose its type
	Service(Services t)
	{
		type = t;
		discount = 0;
	}
	
//return the service type
	Services get_type() {
		return type;
	}
//Makes sure only one instance of  each type is created
	public static Service getInstance(Services type) {
		if (!servicerecord.containsKey(type)) {
		servicerecord.put(type, new Service(type));
		}
		return servicerecord.get(type);
	}
// return discount amount for the specific service	
	float get_discout()
	{
		return discount;
	}
	void set_discount(float d) {
		discount = d;
	}
	
//Add a new service provider for this service
	void add_SP(ServiceProvider p)
	{
		list.add(p);
	}
//get a service provider using its name
	ServiceProvider get_SP(String name)
	{
		ServiceProvider p = null;
		for(int i = 0;i<list.size();i++)
		{
			 p = list.get(i);
			if(p.get_name().equals(name))
				break;
		}
		return p;
		
	}
	
//Get all service providers names for this service
	ArrayList<String> get_providers(){
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i =0;i<list.size();i++)
		{
			ServiceProvider p = list.get(i);
			l.add(p.get_name());
		}
		return l;
	}
	
}
