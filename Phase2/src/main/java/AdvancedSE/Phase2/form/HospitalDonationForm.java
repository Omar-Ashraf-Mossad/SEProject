package AdvancedSE.Phase2.form;

public class HospitalDonationForm extends Form{
	public void createComp() {
		name = "Donate to a Hospital";
		
		String mapkey = "name";
		String type = "S";
		String Message = "Enter Hospital name:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
		
	}

}
