package AdvancedSE.Phase2.form;

public class SchoolDonationForm extends Form {
	public void createComp() {
		
		name = "Donate to a School";
		
		String mapkey = "name";
		String type = "S";
		String Message = "Enter School name:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
		
	}

}
