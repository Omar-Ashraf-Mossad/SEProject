package AdvancedSE.Phase2.MonitoringClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import AdvancedSE.Phase2.transactionPack.Transaction;
import AdvancedSE.Phase2.transactionPack.TransactionList;
import AdvancedSE.Phase2.userPack.UserDataAccess;

public class Currently_logined {

	
	private Map<Long,UserDataAccess> list = new HashMap<Long,UserDataAccess>();
	private static Currently_logined instance;
	
	
	
	private Currently_logined()
	{
		
	}
	
	public static Currently_logined getInstance()
	{
		if(instance == null) {instance = new Currently_logined();}
		
		
		return instance;
	}
	public boolean add(Long key,UserDataAccess u)
	{
		for(long k: list.keySet())
		{
			UserDataAccess e = list.get(k);
			
			if(e.getmail().equals(u.getmail()))
				return false;
		}
		list.put(key, u);
		return true;
	}
	
	public UserDataAccess get(long k)
	{
		if(list.get(k) != null)
			return list.get(k);	
		else	
			return null;
	}
	
	public boolean remove(long k)
	{
		if(list.get(k) != null)
			{list.remove(k); return true; }
		else	
			return false;
	}
	
	
}
