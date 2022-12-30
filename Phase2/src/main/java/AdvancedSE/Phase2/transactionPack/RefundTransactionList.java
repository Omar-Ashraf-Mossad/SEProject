package AdvancedSE.Phase2.transactionPack;

import java.util.ArrayList;

public class RefundTransactionList {
	
	private static RefundTransactionList instance;
	private ArrayList<Transaction> list = new ArrayList<Transaction>();
	
	private RefundTransactionList()
	{
		
	}
	
	public static RefundTransactionList getInstance()
	{
		if(instance == null) {instance = new RefundTransactionList();}
		
		
		return instance;
	}
	
	public void addtransaction(Transaction t) {	
		list.add(t);
		
	}
	
	 public ArrayList<String> print() {
	    	ArrayList<String> l = new ArrayList<String>();
	        int counter = 1;
	        for(Transaction i :list){
	        	String Message = counter + "-" + "  "+i.print();
	        	l.add(Message);
	            counter++;
	        }
	        return l;
	    }
	 
	 public boolean CheckEmpty(){
	        return list.isEmpty();
	    }
}
