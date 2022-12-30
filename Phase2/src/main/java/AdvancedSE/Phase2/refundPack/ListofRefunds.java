package AdvancedSE.Phase2.refundPack;

import java.util.ArrayList;

public class ListofRefunds {

    private static ListofRefunds mainObj;

    public ArrayList<RefundRequest> RefundList = new ArrayList<RefundRequest>();
    //singleton
    private static ListofRefunds instance = null;

    public ListofRefunds(){

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
    public ArrayList<String> print() {
    	ArrayList<String> l = new ArrayList<String>();
        int counter = 1;
        for(RefundRequest i :RefundList){
        	String Message = counter + "-" + "  "+i.print();
        	l.add(Message);
            counter++;
        }
        return l;
    }
    public String getEmailAtIndex(int index){
        return RefundList.get(index).getEmail();
    }
   
    public int get_id(int index){
        return RefundList.get(index).transID;
    }
    public double getRefundAmount(int index){
        return RefundList.get(index).getAmount();
    }
    public boolean CheckEmpty(){
        return RefundList.isEmpty();
    }
}
