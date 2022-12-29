package operationcontrol;
import discountPack.OverallDiscounts;
import form.Form;
import form.FormReader;
import paymentpac.PaymentControl;
import serviceprovider.ServiceProvider;
import services.ServiceControl;
import transactionPack.*;
import userPack.UserDataAccess;

public class OperationControl {
	
	
	public String getSP(String username,String email,boolean isnew,UserDataAccess access,String searchword)
	{
		
		
		ServiceControl control = new ServiceControl();
		
		
		ServiceProvider p = control.search_SP(searchword);
		
		if(p==null)
			return null;
		
		Form f = p.create_form();
		f.start();
		FormReader read = new FormReader();
		
		boolean result2 = read.start(f);
		
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
		result = pay1.excute(p.get_deliverystate(), discount,d, username, read.get_amount(), p.get_name());
		
		
		if(result == "you dont have enough money in your wallet")
			return result +"\n --------------\n+Payment Cancelled" ;
		
		TransactionList list = TransactionList.getInstance();
		double total = read.get_amount();
		total = total-(d*total)/100-(discount*total)/100;
		Transaction t = new Transaction(email,p.get_name(),0,total);
		int id = list.addtransaction(t);
		
		String message = p.handle(read.get_data(), read.get_amount());
		
		access.changestate();
		return result+"\n--------------------\n Your Receipt ID is:"+id+"\n--------------------------------\n"+message;
		
		
	}
}
