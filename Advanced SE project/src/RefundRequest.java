public class RefundRequest {
    String Email,transID,SP;
    double amount;

    public RefundRequest(String Email,double amount, String transID, String SP) {
        this.Email = Email;
        this.amount = amount;
        this.transID = transID;
        this.SP = SP;
    }

    public void print() {
        System.out.println(Email + " " + amount + " " + transID + " " + SP);
    }

    public double getAmount() {
        return amount;
    }

    public String getEmail() {
        return Email;
    }
}
