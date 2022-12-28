package refundPack;

public class RefundRequest {
    String Email,SP;
    int transID;
    double amount;

    public RefundRequest(String Email,double amount, int transID, String SP) {
        this.Email = Email;
        this.amount = amount;
        this.transID = transID;
        this.SP = SP;
    }

    public String print() {
        return "email: " +Email + "  amount: " + amount + " Id: " + transID + " SP: " + SP;
    }

    public double getAmount() {
        return amount;
    }

    public String getEmail() {
        return Email;
    }
}
