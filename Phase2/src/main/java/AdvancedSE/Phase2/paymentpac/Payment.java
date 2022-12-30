package AdvancedSE.Phase2.paymentpac;

import AdvancedSE.Phase2.Response;

public interface Payment {
	public Response<String> pay(String name,double amout,String sp);
}
