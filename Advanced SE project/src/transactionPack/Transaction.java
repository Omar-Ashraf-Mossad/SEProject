package transactionPack;

public class Transaction {
	private String email,SP;
	private int id;
    private double amount;
    
    Transaction (String e,String sp,int i,double a){
    	email = e;
    	id = i;
    	SP = sp;
    	amount =a ;
    }
	public String getSP() {
		return SP;
	}
	public void setSP(String sP) {
		SP = sP;
	}
	public String getemail() {
		return email;
	}
	public void setUseremail(String e) {
		this.email = e;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
