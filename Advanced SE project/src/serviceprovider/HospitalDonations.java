package serviceprovider;
import java.util.Map;

import form.Form;
import form.HospitalDonationForm;

public class HospitalDonations extends ServiceProvider {
	String name = "HospitalDonations ";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="؛Transfered  ";
		
		message += amount;
		
		message += "EGP to Hospital"+ m.get("name")+" Thanks for your support!";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new HospitalDonationForm();
	}
}
