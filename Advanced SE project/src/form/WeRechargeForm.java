package form;




public class WeRechargeForm extends Form {

	
	
	public void createComp() {
		
		this.name = "We Mobile Recharge Service";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your phone number:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		this.list1.add(c);
		
	
		
		
	}

	

}
