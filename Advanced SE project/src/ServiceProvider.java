import java.util.Map;

public abstract class ServiceProvider {
	
	private double discount = 0;
	private boolean cash_on_delivery = false;

	
	abstract String get_name();
	abstract String handle(Map<String,String> m,double amount);
	abstract Form create_form();
	
	void enablecash() {
		cash_on_delivery = true;
	}
	boolean get_deliverystate()
	{
		return cash_on_delivery;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
