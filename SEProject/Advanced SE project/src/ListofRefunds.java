import java.util.ArrayList;

public class ListofRefunds {

    private static ListofRefunds mainObj;

    public ArrayList<RefundRequest> RefundList = new ArrayList<RefundRequest>();
    //singleton
    private static ListofRefunds instance = null;

    ListofRefunds(){

    }

    public static ListofRefunds getInstance() {
        if (instance == null)
            instance = new ListofRefunds();

        return instance;
    }

    public void addRefund(RefundRequest refund) {
        RefundList.add(refund);
    }
    public void removeRefund(int index) {
        RefundList.remove(index);
    }
    public ArrayList<RefundRequest> getList() {
        return RefundList;
    }
    private int counter = 1;
    public void print() {
        int counter = 1;
        for(RefundRequest i :RefundList){
            System.out.println(counter + ": ");
            i.print();
            counter++;
        }
    }
    public String getEmailAtIndex(int index){
        return RefundList.get(index).getEmail();
    }
    public double getRefundAmount(int index){
        return RefundList.get(index).getAmount();
    }
    public boolean CheckEmpty(){
        return RefundList.isEmpty();
    }
}
