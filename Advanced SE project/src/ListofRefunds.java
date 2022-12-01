import java.util.ArrayList;

public class ListofRefunds {
	public static ArrayList<RefundRequest> RefundList = new ArrayList<RefundRequest>();
    //singleton
    private static ListofRefunds instance = null;

    ListofRefunds(){

    }

    public static ListofRefunds getInstance() {
        if (instance == null)
            instance = new ListofRefunds();

        return instance;
    }

    public static void addRefund(RefundRequest refund) {
        RefundList.add(refund);
    }
}
