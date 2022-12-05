
public class UserDataAccess {
	
	private User user;
	UserDataAccess(User u)
	{
		user = u;
	}
	void add_to_wallet(double amo)
	{
		double tmp;
		double amount=amo;
		tmp=user.get_balance();
		tmp=tmp+amount;
		user.addbalance(tmp);
	}
	
	String getname() {
		return user.get_name();
	}
	String getmail() {
		return user.get_email();
	}
	
	double getbalance()
	{
		return user.get_balance();
	}
	
}
