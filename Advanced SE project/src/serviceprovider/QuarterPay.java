package serviceprovider;
import java.util.Map;

import form.Form;
import form.QuarterForm;

public class QuarterPay extends ServiceProvider {
	
	String name = "Quarter Pay ";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="؛Recharged  ";
		
		message += amount;
		
		message += "EGP to LandLine "+ m.get("Number")+" For the next 4 months";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new QuarterForm();
	}


}
