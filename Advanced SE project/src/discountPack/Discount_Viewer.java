package discountPack;

import java.util.ArrayList;


public class Discount_Viewer {
	
	
	public String get_discuont()
	{
		
	     OverallDiscounts ov = OverallDiscounts.getInstance();
		SystemServices s1 = SystemServices.getInstance();
	     ArrayList<String> l1 = s1.get_providers();
	     Discuonts_form f = new Discuonts_form();
	     
	    String name =  f.start(l1);
	     
	     if(name == null)
	    	 return null;
	     
	     
	     else if (name == "overall")
	    	 return "Overall Discuont: "+ ov.getPercent();
	     
	     return name+": "+s1.get_SP(name).getDiscount();
	     
	     
	     
	}
}
