package AdvancedSE.Phase2.serviceprovider;
import java.util.Map;

import AdvancedSE.Phase2.form.Form;
import AdvancedSE.Phase2.form.OrangeRechargeForm;

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
