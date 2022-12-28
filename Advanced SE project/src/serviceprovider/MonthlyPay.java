package serviceprovider;
import java.util.Map;

import form.Form;
import form.MonthlyForm;

public class MonthlyPay extends ServiceProvider {
	String name = "MonthlyRecipt ";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="؛Recharged  ";
		
		message += amount;
		
		message += "EGP to LandLine"+ m.get("Number")+"For the next  month";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new MonthlyForm();
	}
}
