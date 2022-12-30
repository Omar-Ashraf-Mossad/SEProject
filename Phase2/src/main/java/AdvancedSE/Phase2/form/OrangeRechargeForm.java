package AdvancedSE.Phase2.form;

public class OrangeRechargeForm extends Form{
	public void createComp() {
		
		
		name = "Orange Mobile Recharge Service";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your orange number :>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
		
	}
}
