package transactionPack;

import java.util.ArrayList;



public class TransactionList {
		
	private static TransactionList instance;
	private ArrayList<Transaction> list = new ArrayList<Transaction>();
	private int id=0;
	
	private TransactionList()
	{
		
	}
	
	public static TransactionList getInstance()
	{
		if(instance == null) {instance = new TransactionList();}
		
		
		return instance;
	}
	
	public boolean check_exist(int id,String e) {
		
		
		for(int i =0;i<list.size();i++)
		{
			Transaction t = list.get(i);
			
			if(t.getemail().equals(e) && t.getId() == id)
				return true;
		}
		return false;
	}
	
	public Transaction getbyid(int id)
	{
		for(int i =0;i<list.size();i++)
		{
			Transaction t = list.get(i);
			
			if(t.getId() == id)
				return t;
		}
		return null;
	}
	
	public int addtransaction(Transaction t) {
		id++;
		t.setId(id);
		
		list.add(t);
		return id;
	}
	
	
}
