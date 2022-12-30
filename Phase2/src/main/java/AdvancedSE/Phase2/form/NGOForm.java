package AdvancedSE.Phase2.form;

public class NGOForm extends Form{
	public void createComp() {
		
		
		name = "Donate to a non profitable organization";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter Organization name:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
		
	}

}
