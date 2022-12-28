import java.util.Map;

public abstract class ServiceProvider {
	
	private double discount = 0;
	
	abstract String get_name();
	abstract String handle(Map<String,String> m,double amount);
	abstract Form create_form();
	
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
