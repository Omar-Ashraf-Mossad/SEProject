public class Pay_wallet implements Payment{
	public String pay(String name,double amount,String sp) {
		String s_wallet=name;
		double wallet;
		
		
		UsersList user = UsersList.getInstance();
		User us;
		
		us= user.get_userbyname(name);
		
		wallet= us.get_balance();
		double k_wallet=amount;
		if(wallet<amount)
		{
			return "you dont have enough money in your wallet";
			
			
		}
		double tmp=wallet-amount;
		String ss_wallet=sp;
		us.addbalance(tmp);
		return "Congrats! "+s_wallet+" ,you have paid for the service: "+ss_wallet+"that costed: "+amount+" via wallet";
	}

}
