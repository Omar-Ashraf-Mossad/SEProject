
public class OperationControl {
	
	
	public String getSP(String username,String email,boolean isnew,UserDataAccess access)
	{
		
		
		ServiceControl control = new ServiceControl();
		
		
		ServiceProvider p = control.choose_SP();
		
		if(p==null)
			return null;
		
		Form f = p.create_form();
		
		boolean result = f.start();
		
		if(!result)
			return "Payment Cancelled";
		
		
		Service s = control.getService();
		
		
		PaymentControl pay1 = new PaymentControl();
		
		double discount = s.get_discout();
		
		float d = 0;
		
		
		if(isnew) {
			OverallDiscounts dis = OverallDiscounts.getInstance();
			 d = dis.getPercent();
		}
			 
		
		result = pay1.excute(s.get_deliverystate(), discount,d, username, f.get_amount(), s.get_type().toString(), p.get_name());
		
		
		if(!result)
			return "Payment Cancelled";
		
		TransactionList list = TransactionList.getInstance();
		double total = f.get_amount();
		total = total-(d*total)/100-(discount*total)/100;
		Transaction t = new Transaction(email,p.get_name(),0,total);
		int id = list.addtransaction(t);
		
		String message = p.handle(f.get_data(), f.amount);
		
		access.changestate();
		return "\nYour Receipt ID is:"+id+"\n--------------------------------\n"+message;
		
		
	}
}
