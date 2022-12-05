
public class DiscountManagment {
	public void SetOverAll(float Percent){
        OverallDiscounts ov = OverallDiscounts.getInstance();
        ov.setPercent(Percent);
    }
    public void specificdiscount(float Percent){
        if(Percent > 0 && Percent < 100){
            ServiceControl SC = new ServiceControl();
            Service s1 = SC.ChooseService();
            s1.set_discount(Percent/100);
        }
        else{
            System.out.println("invalid Discount percent.");
        }

    }

}
