
public class RefundRequestControl {
	
	public boolean RequestARefund(int transID,String Email){
        TransactionList TransListInstance = TransactionList.getInstance();
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        if(TransListInstance.check_exist(transID,Email)){
        	Transaction t = TransListInstance.getbyid(transID);
            RefundRequest refund = new RefundRequest(t.getemail(),t.getAmount(),t.getId(),t.getSP());
            RefundListInstance.addRefund(refund);
            return true;
        }
        else{
           return false;
        }

    }
}
