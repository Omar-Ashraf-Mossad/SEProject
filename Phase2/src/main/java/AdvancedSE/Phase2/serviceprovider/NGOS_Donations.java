package AdvancedSE.Phase2.serviceprovider;
import java.util.Map;

import AdvancedSE.Phase2.form.Form;
import AdvancedSE.Phase2.form.NGOForm;

public class NGOS_Donations extends ServiceProvider{
	String name = "NGOS Donations ";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="؛Transfered  ";
		
		message += amount;
		
		message += "EGP to Non profitable organization"+ m.get("name")+" Thanks for your support!";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new NGOForm();
	}
}
