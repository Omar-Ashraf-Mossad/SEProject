
public class Transaction {
	private String username,SP;
	private int id;
    private float amount;
    
    Transaction (String name,String sp,int i,float a){
    	username = name;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
