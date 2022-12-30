package AdvancedSE.Phase2.serviceprovider;
import java.util.Map;

import AdvancedSE.Phase2.form.Form;
import AdvancedSE.Phase2.form.WeInternetForm;

public class WeInternetRecharge extends ServiceProvider {
	
	String name = "WeInternet";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Added ";
		
		message += m.get("subscription");
		
		message += "GB to we number"+ m.get("Number");
		
		return message;
	}

	@Override
	public Form create_form() {
		return new WeInternetForm();
	}

}
