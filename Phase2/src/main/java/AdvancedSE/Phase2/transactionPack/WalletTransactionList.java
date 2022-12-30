package AdvancedSE.Phase2.transactionPack;

import java.util.ArrayList;


public class WalletTransactionList {
	
	private static WalletTransactionList instance;
	private ArrayList<WalletTransaction> list = new ArrayList<WalletTransaction>();
	private int id=0;
	
	private WalletTransactionList()
	{
		
	}
	
	public static WalletTransactionList getInstance()
	{
		if(instance == null) {instance = new WalletTransactionList();}
		
		
		return instance;
	}
	
	 public ArrayList<String> print() {
	    	ArrayList<String> l = new ArrayList<String>();
	        int counter = 1;
	        for(WalletTransaction i :list){
	        	String Message = counter + "-" + "  "+i.print();
	        	l.add(Message);
	            counter++;
	        }
	        return l;
	    }
	
	public int addtransaction(WalletTransaction t) {	
		list.add(t);
		return id;
	}
	 public boolean CheckEmpty(){
	        return list.isEmpty();
	    }
}
