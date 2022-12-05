import java.util.Map;

public class NGOS_Donations implements ServiceProvider{
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
