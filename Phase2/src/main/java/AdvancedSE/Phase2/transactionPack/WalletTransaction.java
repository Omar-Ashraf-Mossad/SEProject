package AdvancedSE.Phase2.transactionPack;

public class WalletTransaction {
	
	
	private String username;
	private String email;
	private int card;
	private double amount;
	
	
	public WalletTransaction (String e,String u,int i,double a){
    	email = e;
    	card = i;
    	username = u;
    	amount =a ;
    }
	
	
	 public String print() {
	        return "Username: " +username + "  email: " + email + " CreditCard: " + card + " Added Value: " + amount;
	   }
	
}
