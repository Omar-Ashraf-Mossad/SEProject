package form;

public class MonthlyForm extends Form{
	public void createComp() {
		
		
		name = "Monthly Receipt for LandLine Add money to be used to pay your bill for the next month";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your LandLineNumber:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
	}
}
