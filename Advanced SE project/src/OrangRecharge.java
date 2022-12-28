import java.util.Map;

public class OrangRecharge extends ServiceProvider{
	String name = "OrangeRecharge";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Added ";
		
		message += amount;
		
		message += "EGP to we number"+ m.get("Number") + "Thanks for using our service";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new OrangeRechargeForm();
	}
}
