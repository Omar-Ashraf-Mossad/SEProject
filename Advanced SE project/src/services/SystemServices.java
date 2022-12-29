package services;
import java.util.ArrayList;

import serviceprovider.EtisalatInternet;
import serviceprovider.*;
public class SystemServices {
	private ArrayList<ServiceProvider> list = new ArrayList<ServiceProvider>();
	
	private static SystemServices mainobject;
	//initialize the lists
	private SystemServices() {
		
		
		
		add_SP(new WeRecharge());
		add_SP(new OrangRecharge());
		add_SP(new VodafoneRecharge());
		add_SP(new EtisalatRecharge());

		
	
		add_SP(new QuarterPay());
		add_SP(new MonthlyPay());
		

		add_SP(new WeInternetRecharge());
		add_SP(new VodafoneInternet());
		add_SP(new EtisalatInternet());
		add_SP(new OrangeInternet());
		
		
		add_SP(new SchoolDonation());
		add_SP(new NGOS_Donations());
		add_SP(new HospitalDonations());
		
		

		
	}
	//Make one instance 
	public static SystemServices getInstance () {
		if (mainobject == null) { mainobject = new SystemServices(); }
		return mainobject;
	}
	//Add a new service provider for this service
		void add_SP(ServiceProvider p)
		{
			list.add(p);
		}
	//get a service provider using its name
		public ServiceProvider get_SP(String name)
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
	//get list of services Types in a string
	
	
	//Get a specific Service using its enum
	public ArrayList<String> get_providers(){
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i =0;i<list.size();i++)
		{
			ServiceProvider p = list.get(i);
			l.add(p.get_name());
		}
		return l;
	}
	
	public ArrayList<String> get_providers(String name){
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i =0;i<list.size();i++)
		{
			ServiceProvider p = list.get(i);
			if(p.get_name().toUpperCase().contains(name.toUpperCase()))
				l.add(p.get_name());
		}
		return l;
	}
	
	
	
}
