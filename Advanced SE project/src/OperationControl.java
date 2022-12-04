
public class OperationControl {
	
	
	public void getSP(String username)
	{
		ServiceControl control = new ServiceControl();
		
		
		ServiceProvider p = control.choose_SP();
		
		if(p==null)
			return;
		
		Form f = p.create_form();
		
		boolean result = f.start();
		
		if(!result)
			return;
		
		//call payment function
		//if true
		//add transaction details to the list
		
		
		//return service provider handle
		
	}
}
