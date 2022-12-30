package AdvancedSE.Phase2.userPack;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	

	private String name;
	
	private int card = -1;
	private String password;
	

	private String email;
	
	
	private double balance;
	
	
	private boolean isnew = true;
	
	
	
	public User(String n,String p,String e)
	{
	    
		name = n;
	    
		password = p;
		email = e;
		balance = 0;
	}
	
	public boolean compare_name(String n) {
		return name.equals(n);
	}
	
	public boolean compare_email(String e)
	{
		return email.equals(e);
	}
	public boolean compare_password(String p)
	{
		return password.equals(p);
	}
	@JsonProperty("name")
	public String get_name()
	{
	
	    
		return name;
	}
	@JsonProperty("password")
	public String get_password()
	{
		return password;
	}
	@JsonProperty("email")
	public String get_email()
	{
		return email;
	}
	public void addbalance(double b)
	{
		balance = b;
	}
	
	@JsonProperty("balance")
	public double get_balance()
	{
		return balance;
	}
	
	@JsonProperty("is new")
	public boolean isNew () {
		return isnew;
	}
	void changeNewState()
	{
		isnew = false;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}
	
	
}
