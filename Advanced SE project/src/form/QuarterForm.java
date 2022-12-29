package form;

public class QuarterForm extends Form{
	public void createComp() {
		
		
		name = "Quarter Receipt for 4 months";
		
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your LandLineNumber:>";
		boolean hasoptions = false;
		
		
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
		
		list1.add(c);
		
		
		
		
	}
}
