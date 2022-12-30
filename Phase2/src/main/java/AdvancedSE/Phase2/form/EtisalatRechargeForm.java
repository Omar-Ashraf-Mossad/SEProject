package AdvancedSE.Phase2.form;
import java.util.Scanner;

public class EtisalatRechargeForm extends Form{
	
	
	public void createComp() {

		name = "Etisalat Recharge Service";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your phone number:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
	}
}
