import java.util.ArrayList;

public class ListofRefunds {
	
	private static ArrayList<RefundRequest> RefundList = new ArrayList<RefundRequest>();
    //singleton
    private static ListofRefunds instance = null;

    ListofRefunds(){

    }

    public static ListofRefunds getInstance() {
        if (instance == null)
            instance = new ListofRefunds();

        return instance;
    }

    public  void addRefund(RefundRequest refund) {
        RefundList.add(refund);
    }
    public  void removeRefund(RefundRequest refund) {
        RefundList.remove(refund);
    }
    public static ArrayList<RefundRequest> getList() {
        return RefundList;
    }
    public  void print() {
        for(RefundRequest i :RefundList){
            i.print();
        }
    }
}
