
public class User {
	private String name;
	private String password;
	private String email;
	private double balance;
	
	User(String n,String p,String e)
	{
		name = n;
		password = p;
		email = e;
		balance = 0;
	}
	UserConsole get_form()
	{
		return new UserConsole(this);
	}
	boolean compare_name(String n) {
		return name.equals(n);
	}
	
	boolean compare_email(String e)
	{
		return email.equals(e);
	}
	boolean compare_password(String p)
	{
		return password.equals(p);
	}
	
	String get_name()
	{
		return name;
	}
	String get_password()
	{
		return password;
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
