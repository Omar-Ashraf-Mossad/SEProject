
public class OperationControl {
	
<<<<<<< HEAD
	
	public String getSP(String username)
	{
		ServiceControl control = new ServiceControl();
		
		
		ServiceProvider p = control.choose_SP();
		
		if(p==null)
			return null;
		
		Form f = p.create_form();
		
		boolean result = f.start();
		
		if(!result)
			return null;
		
		
		Service s = control.getService();
		
		
		PaymentControl pay1 = new PaymentControl();
		
		double discount = s.get_discout();
		
		
		result = pay1.excute(s.get_deliverystate(), discount, username, f.get_amount(), s.get_type().toString(), p.get_name());
		
		
		if(!result)
			return "Payment Cancelled";
		
		TransactionList list = TransactionList.getInstance();
		
		Transaction t = new Transaction(username,p.get_name(),0,f.get_amount());
		int id = list.addtransaction(t);
		
		String message = p.handle(f.get_data(), f.amount);
		
		return "\nYour Receipt ID is:"+id+"\n--------------------------------\n"+message;
		
		
	}
=======
>>>>>>> parent of dfd8469 (Added Service Search)
}
