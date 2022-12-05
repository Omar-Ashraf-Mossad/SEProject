import java.util.Map;

public class EtisalatInternet implements ServiceProvider {
	String name = "Etistalat internet recharge";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Added ";
		
		message += m.get("subscription");
		
		message += "GB to Etisalat number"+ m.get("Number");
		
		return message;
	}

	@Override
	public Form create_form() {
		return new EtisalatInternetForm();
	}

}
