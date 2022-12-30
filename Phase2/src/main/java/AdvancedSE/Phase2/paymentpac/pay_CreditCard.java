package AdvancedSE.Phase2.paymentpac;

import AdvancedSE.Phase2.Response;

public class pay_CreditCard implements Payment {
	
	private int  card;
	public pay_CreditCard(int c)
	{
		card = c;
	}
	public Response<String> pay(String name,double amount,String sp) {
		String s_credit=name;
		double k_credit=amount;
		String ss_credit=sp;
		 Response<String> r = new  Response<String>();
		 r.setStatus(true);
		 
		 r.setMessage("Congrats! "+s_credit+" ,you have paid for the service: "+ss_credit+"that costed: "+k_credit+" via credit card"+card);
		 return r;
	}

}