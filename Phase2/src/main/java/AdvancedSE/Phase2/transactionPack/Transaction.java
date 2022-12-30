package AdvancedSE.Phase2.transactionPack;

public class Transaction {
	private String email,SP;
	private int id;
    private double amount;
    private boolean sent = false;
    private boolean responded =false;
    private boolean accepted = false;
    
    public Transaction (String e,String sp,int i,double a){
    	email = e;
    	id = i;
    	SP = sp;
    	amount =a ;
    }
    
    public String print() {
        return "email: " +email + "  amount: " + amount + " Id: " + id + " SP: " + SP;
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
	public boolean isSent() {
		return sent;
	}
	public void setSent(boolean sent) {
		this.sent = sent;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public boolean isResponded() {
		return responded;
	}
	public void setResponded(boolean responded) {
		this.responded = responded;
	}
}
