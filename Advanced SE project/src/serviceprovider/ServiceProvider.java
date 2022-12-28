package serviceprovider;
import java.util.Map;

import form.Form;

public abstract class ServiceProvider {
	
	private double discount = 0;
	private boolean cash_on_delivery = false;

	
	public abstract String get_name();
	public abstract String handle(Map<String,String> m,double amount);
	public abstract Form create_form();
	
	void enablecash() {
		cash_on_delivery = true;
	}
	public boolean get_deliverystate()
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
