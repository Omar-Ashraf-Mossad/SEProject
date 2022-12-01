
public class User {
	private String name;
	private String password;
	private String email;
	private double balance;
	
	User(String n,String p,String e)
	{
		name = n;
		password = p;
		email = p;
		balance = 0;
	}
	
	boolean compare_name(String n) {
		return name.equals(n);
	}
	
	boolean compare_email(String e)
	{
		return email.equals(e);
	}

	
	String get_name()
	{
		return name;
	}
	
	String get_email()
	{
		return email;
	}
	double get_balance()
	{
		return balance;
	}
	
}
