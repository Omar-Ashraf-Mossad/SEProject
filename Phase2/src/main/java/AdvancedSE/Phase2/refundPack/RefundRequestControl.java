package AdvancedSE.Phase2.refundPack;

import AdvancedSE.Phase2.transactionPack.*;

public class RefundRequestControl {
	
	public String RequestARefund(int transID,String Email){
        TransactionList TransListInstance = TransactionList.getInstance();
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        
        
        if(TransListInstance.check_exist(transID,Email)){
        	Transaction t = TransListInstance.getbyid(transID);
        	if(!t.isSent())
            {
        		RefundRequest refund = new RefundRequest(t.getemail(),t.getAmount(),t.getId(),t.getSP());
        		RefundListInstance.addRefund(refund);
        		t.setSent(true);
        		return "Refund request was added.";
            }
        	else {
        		
        		if(!t.isResponded())
        		{
        			return "The refund request to this transacation is being processed";
        		}
        		else
        		{
        			if(t.isAccepted())
        			{
        				return "The refund request has already been accepted";
        			}
        			else
        			{
        				return "The refund request has been denied";
        			}
        			
        		}
        		
        	}
        }
       
           return "Transaction wasn't found .";
       

    }
}
