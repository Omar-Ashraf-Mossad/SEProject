package AdvancedSE.Phase2.discountPack;

import AdvancedSE.Phase2.serviceprovider.ServiceProvider;
import AdvancedSE.Phase2.services.SystemServices;

public class DiscountManagment {
	
	public void SetOverAll(float Percent){
        OverallDiscounts ov = OverallDiscounts.getInstance();
        ov.setPercent(Percent);
    }
	
    public String specificdiscount(float Percent,String name){
    	
        if(Percent > 0 && Percent < 100){
			SystemServices s1 = SystemServices.getInstance();
			
			
            ServiceProvider p = s1.get_SP(name);
            
            if(p == null)
            	return "No Service provider was found with that name .check all the services names";
            
            p.setDiscount(Percent);
            return "Discount Added Successfully";
        }
       
        return "invalid Discount percent.";
        

    }
    

}
