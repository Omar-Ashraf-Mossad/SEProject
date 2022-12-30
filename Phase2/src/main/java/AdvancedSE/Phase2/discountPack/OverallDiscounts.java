package AdvancedSE.Phase2.discountPack;

public class OverallDiscounts {
	private float Percent;
    private static OverallDiscounts instance = null;
    DiscountManagment DM = new DiscountManagment();
    private OverallDiscounts(){

    }
    public static OverallDiscounts getInstance()
    {
        if (instance == null)
            instance = new OverallDiscounts();

        return instance;
    }
    public float getPercent() {
        return Percent;
    }

    public void setPercent(float percent) {
        Percent = percent;
    }
}
