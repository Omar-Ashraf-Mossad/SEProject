package AdvancedSE.Phase2.paymentpac;

import AdvancedSE.Phase2.Response;

public class Pay_on_delivery implements Payment {
	public Response<String> pay(String name,double amount,String sp) {
		
		
		Response<String> r = new  Response<String>();
		r.setStatus(true);
		r.setMessage("Congrats! "+name+" ,you have paid for the service: "+sp+"that costed: "+amount+" on delivery");
		return r;
	}

}
