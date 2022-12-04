
public class UserDataAccess {
	
	private User user;
	UserDataAccess(User u)
	{
		user = u;
	}
	
	
	String getname() {
		return user.get_name();
	}
	
	double getbalance()
	{
		return user.get_balance();
	}
	
}
