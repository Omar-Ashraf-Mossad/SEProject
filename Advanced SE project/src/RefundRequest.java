
public class RefundRequest {
	String username,transID,SP;
    float amount;

    public RefundRequest(String username,float amount, String transID, String SP) {
        this.username = username;
        this.amount = amount;
        this.transID = transID;
        this.SP = SP;
    }
    public void print() {
        System.out.println(username + " " + amount + " " + transID + " " + SP);
    }
}
