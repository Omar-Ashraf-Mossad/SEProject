package AdvancedSE.Phase2.userPack;



public class UserDataAccess {
	
	public User user;
	
	
	public int getcard()
	{
		return user.getCard();
	}
	public void addcard(int c)
	{
		user.setCard(c);
	}
	public UserDataAccess(User u)
	{
		user = u;
	}
	
	public void changestate() {
		user.changeNewState();
	}
	public boolean isnew()
	{
		return user.isNew();
	}
	public void add_to_wallet(double amo)
	{
		double tmp;
		double amount=amo;
		tmp=user.get_balance();
		tmp=tmp+amount;
		user.addbalance(tmp);
	}
	
	
	public String getname() {
		return user.get_name();
	}
	public String getmail() {
		return user.get_email();
	}
	
	double getbalance()
	{
		return user.get_balance();
	}
	
}
