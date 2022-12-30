package AdvancedSE.Phase2.refundPack;


import AdvancedSE.Phase2.transactionPack.RefundTransactionList;
import AdvancedSE.Phase2.transactionPack.Transaction;
import AdvancedSE.Phase2.transactionPack.TransactionList;
import AdvancedSE.Phase2.userPack.UsersList;

public class RefundsManagment {


	private  TransactionList TransListInstance = TransactionList.getInstance();
	
	private static RefundsManagment instance;
	
	private RefundsManagment()
	{
		
	}
	
	public static RefundsManagment getInstance()
	{
		if(instance == null) {instance = new RefundsManagment();}
		
		
		return instance;
	}
	
    public void returnBalance(int indexOfRefund){//function that sends the refund amount to the correct user and picks the user by Email
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        UsersList UserListInstance = UsersList.getInstance();
        
        String EmailOfRefund = RefundListInstance.getEmailAtIndex(indexOfRefund);//gets the email of the picked user
        double RefundAmount = RefundListInstance.getRefundAmount(indexOfRefund) +  UserListInstance.get_user(EmailOfRefund).get_balance();//gets the refund amount of the refund
        UserListInstance.get_user(EmailOfRefund).addbalance(RefundAmount);//adds the refund amount back to user as balance
    }
    public  ListofRefunds getRefundsList(){
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        return RefundListInstance;
    }
    public void giveRefund(int indexOfRefund){ // both methods remove the refund request after handling
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        RefundTransactionList list = RefundTransactionList.getInstance();
        
        this.returnBalance(indexOfRefund);
        
        Transaction t = TransListInstance.getbyid( RefundListInstance.get_id(indexOfRefund));
        t.setAccepted(true);
        t.setResponded(true);
        
        list.addtransaction(t);
        TransListInstance.removetransaction(t);
        
        RefundListInstance.removeRefund(indexOfRefund);
    }
    public void removeRefund(int indexOfRefund){
    	
    	 ListofRefunds RefundListInstance = ListofRefunds.getInstance();
    	  Transaction t = TransListInstance.getbyid( RefundListInstance.get_id(indexOfRefund));
          t.setAccepted(false);
          t.setResponded(true);
       
        RefundListInstance.removeRefund(indexOfRefund);
    }
    public boolean EmptyList(){
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        return RefundListInstance.CheckEmpty();
    }

}
