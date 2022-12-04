public class Pay_wallet implements Payment{
	public boolean pay(String name,double amount,String sp) {
		String s_wallet=name;
		double wallet;
		UsersList user = UsersList.getInstance();
		User us;
		us= user.get_userbyname(s_wallet);
		wallet= us.get_balance();
		double k_wallet=amount;
		if(wallet<amount)
		{
			System.out.println("you dont have enough money in your wallet");
			return false;
			
		}
		double tmp=wallet-amount;
		String ss_wallet=sp;
		us.addbalance(tmp);
		System.out.println("Congrats! "+s_wallet+" ,you have paid for the service: "+ss_wallet+"that costed: "+amount+" via wallet");
		return true;
	}

}
