package operationcontrol;
import discountPack.OverallDiscounts;
import form.Form;
import paymentpac.PaymentControl;
import serviceprovider.ServiceProvider;
import services.ServiceControl;
import transactionPack.*;
import userPack.UserDataAccess;

public class OperationControl {
	
	
	public String getSP(String username,String email,boolean isnew,UserDataAccess access)
	{
		
		
		ServiceControl control = new ServiceControl();
		
		
		ServiceProvider p = control.choose_SP();
		
		if(p==null)
			return null;
		
		Form f = p.create_form();
		
		boolean result2 = f.start();
		
		if(!result2)
			return "Payment Cancelled";		
		
		PaymentControl pay1 = new PaymentControl();
		
		double discount = p.getDiscount();
		
		float d = 0;
		
		
		if(isnew) {
			OverallDiscounts dis = OverallDiscounts.getInstance();
			 d = dis.getPercent();
		}
			 
		String result;
		result = pay1.excute(p.get_deliverystate(), discount,d, username, f.get_amount(), p.get_name());
		
		
		if(result == "you dont have enough money in your wallet")
			return result +"\n --------------\n+Payment Cancelled" ;
		
		TransactionList list = TransactionList.getInstance();
		double total = f.get_amount();
		total = total-(d*total)/100-(discount*total)/100;
		Transaction t = new Transaction(email,p.get_name(),0,total);
		int id = list.addtransaction(t);
		
		String message = p.handle(f.get_data(), f.amount);
		
		access.changestate();
		return result+"\n--------------------\n Your Receipt ID is:"+id+"\n--------------------------------\n"+message;
		
		
	}
}
