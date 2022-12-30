package AdvancedSE.Phase2.serviceprovider;
import java.util.Map;

import AdvancedSE.Phase2.form.EtisalatRechargeForm;
import AdvancedSE.Phase2.form.Form;

public class EtisalatRecharge extends ServiceProvider {
	String name = "Etisalat Mobile Recharge Service";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Number "+ m.get("Number")+ "Recieved ";
		
		message += amount;
		
		message += "EGP";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new EtisalatRechargeForm();
	}

}
