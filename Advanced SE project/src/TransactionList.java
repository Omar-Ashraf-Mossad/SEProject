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
	
	boolean check_exist(int id,String name) {
		
		
		for(int i =0;i<list.size();i++)
		{
			Transaction t = list.get(i);
			
			if(t.getUsername().equals(name) && t.getId() == id)
				return true;
		}
		return false;
	}
	
	Transaction getbyid(int id)
	{
		for(int i =0;i<list.size();i++)
		{
			Transaction t = list.get(i);
			
			if(t.getId() == id)
				return t;
		}
		return null;
	}
	
	int addtransaction(Transaction t) {
		id++;
		t.setId(id);
		
		list.add(t);
		return id;
	}
	
	
}
