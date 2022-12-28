package discountPack;

public class DiscountManagment {
	
	public void SetOverAll(float Percent){
        OverallDiscounts ov = OverallDiscounts.getInstance();
        ov.setPercent(Percent);
    }
	
    public void specificdiscount(float Percent){
        if(Percent > 0 && Percent < 100){
            ServiceControl SC = new ServiceControl();
            ServiceProvider s1 = SC.choose_SP();
            s1.setDiscount(Percent);
        }
        else{
            System.out.println("invalid Discount percent.");
        }

    }
    

}
