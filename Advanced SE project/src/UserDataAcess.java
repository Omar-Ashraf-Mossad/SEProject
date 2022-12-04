
public class UserDataAcess {
	private User user;
	
	
	UserDataAcess(User u){
		
		user = u;
	}
	
	String getname()
	{
		return user.get_name();
	}
	
	double getbalance() {
		return user.get_balance();
	}
}
