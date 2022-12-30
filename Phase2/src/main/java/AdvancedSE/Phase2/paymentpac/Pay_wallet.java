package AdvancedSE.Phase2.paymentpac;

import AdvancedSE.Phase2.Response;
import AdvancedSE.Phase2.userPack.User;
import AdvancedSE.Phase2.userPack.UsersList;

public class Pay_wallet implements Payment{
	public Response<String> pay(String name,double amount,String sp) {
		String s_wallet=name;
		double wallet;
		
		
		UsersList user = UsersList.getInstance();
		User us;
		
		us= user.get_userbyname(name);
		
		wallet= us.get_balance();
		double k_wallet=amount;
		
		Response<String> r = new  Response<String>();
		if(wallet<amount)
		{
			r.setStatus(false);
			r.setMessage("you dont have enough money in your wallet");
			r.object = "PaymentFailed";
			return r;
		}
		double tmp=wallet-amount;
		String ss_wallet=sp;
		us.addbalance(tmp);
		
		r.setStatus(true);
		r.setMessage("Congrats! "+s_wallet+" ,you have paid for the service: "+ss_wallet+"that costed: "+amount+" via wallet");
		
		return r;
	}

}
