package AdvancedSE.Phase2.form;

public class VodafoneRechargeForm extends Form {
	
	public void createComp() {
		
		name = "Vodafone Recharge Service :     Welcome!";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your Vodafone number:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
		
		
	}
}
