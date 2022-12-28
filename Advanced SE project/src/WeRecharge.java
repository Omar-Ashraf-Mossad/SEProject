import java.util.Map;
public class WeRecharge  extends ServiceProvider{
	
	String name = "WeRechargeService";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Transfered ";
		
		message += amount;
		
		message += "EGP to we number"+ m.get("Number");
		
		return message;
	}

	@Override
	public Form create_form() {
		return new WeRechargeForm();
	}

}
