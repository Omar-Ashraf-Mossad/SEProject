
public class RefundsManagment {



    public void returnBalance(int indexOfRefund){//function that sends the refund amount to the correct user and picks the user by Email
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        UsersList UserListInstance = UsersList.getInstance();
        String EmailOfRefund = RefundListInstance.getEmailAtIndex(indexOfRefund);//gets the email of the picked user
        double RefundAmount = RefundListInstance.getRefundAmount(indexOfRefund);//gets the refund amount of the refund
        UserListInstance.get_user(EmailOfRefund).addbalance(RefundAmount);//adds the refund amount back to user as balance
    }
    public  ListofRefunds getRefundsList(){
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        return RefundListInstance;
    }
    public void giveRefund(int indexOfRefund){ // both methods remove the refund request after handling
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        this.returnBalance(indexOfRefund);
        RefundListInstance.removeRefund(indexOfRefund);
    }
    public void removeRefund(int indexOfRefund){
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        RefundListInstance.removeRefund(indexOfRefund);
    }
    public boolean EmptyList(){
        ListofRefunds RefundListInstance = ListofRefunds.getInstance();
        return RefundListInstance.CheckEmpty();
    }

}
