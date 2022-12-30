package AdvancedSE.Phase2.controller;


import AdvancedSE.Phase2.userPack.User;
import AdvancedSE.Phase2.userPack.UsersList;
import AdvancedSE.Phase2.Response;
import AdvancedSE.Phase2.discountPack.DiscountManagment;
import AdvancedSE.Phase2.refundPack.ListofRefunds;
import AdvancedSE.Phase2.refundPack.RefundRequest;
import AdvancedSE.Phase2.refundPack.RefundsManagment;
import AdvancedSE.Phase2.services.SystemServices;
import AdvancedSE.Phase2.transactionPack.RefundTransactionList;
import AdvancedSE.Phase2.transactionPack.TransactionList;
import AdvancedSE.Phase2.transactionPack.WalletTransactionList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/Admin")
public class Admin_controller {
	
	
	@GetMapping("/getservices")
	public ArrayList<String> get_services()
	{
		SystemServices s1 = SystemServices.getInstance();
		
	     ArrayList<String> l1 = s1.get_providers();
	     return l1;
	}
	
	
	@PostMapping("/adddiscount/{percentage}/{Servicename}")
	public String add_discount(@PathVariable("percentage") float percentage,@PathVariable("Servicename") String name)
	{
		String Message;
		DiscountManagment DM = new DiscountManagment();
		if(name.toUpperCase().equals("OVERALL"))		
			{DM.SetOverAll(percentage); Message = "Overall discount was added successfully";}
		else
			 Message = DM.specificdiscount(percentage,name);
		
		return Message;
		
	}
	@GetMapping("/getRefunds")
	public Response<ArrayList<String>> get_request()
	{
		Response<ArrayList<String>> r = new Response<ArrayList<String>>();
		RefundsManagment managment = RefundsManagment.getInstance();
		
		if(managment.EmptyList()){
			r.setStatus(false);
            r.setMessage("There are no refund requests yet");
        }
		else
		{
			r.setStatus(true);
            r.setMessage("there are refund requests");
			ArrayList<String> l =  managment.getRefundsList().print();
			r.object = l;
		}
		
		       
		return r;      
   }
	
	@GetMapping("/getTransaction/payment")
	public Response<ArrayList<String>> get_payments()
	{
		Response<ArrayList<String>> r = new Response<ArrayList<String>>();
		TransactionList managment = TransactionList.getInstance();
		
		if(managment.CheckEmpty()){
			r.setStatus(false);
            r.setMessage("There are no Payment Transactions  yet");
        }
		else
		{
			r.setStatus(true);
            r.setMessage(" Payments transactions ");
			ArrayList<String> l =  managment.print();
			r.object = l;
		}
		
		       
		return r;      
   }
	
	@GetMapping("/getTransaction/refund")
	public Response<ArrayList<String>> get_refunds()
	{
		Response<ArrayList<String>> r = new Response<ArrayList<String>>();
		RefundTransactionList managment = RefundTransactionList.getInstance();
		
		if(managment.CheckEmpty()){
			r.setStatus(false);
            r.setMessage("There are no Refund Transactions  yet");
        }
		else
		{
			r.setStatus(true);
            r.setMessage("refunds transactions ");
			ArrayList<String> l =  managment.print();
			r.object = l;
		}
	       
		return r;      
   }
	
	
	@GetMapping("/getTransaction/wallet")
	public Response<ArrayList<String>> get_wallets()
	{
		Response<ArrayList<String>> r = new Response<ArrayList<String>>();
		WalletTransactionList managment = WalletTransactionList.getInstance();
		
		if(managment.CheckEmpty()){
			r.setStatus(false);
            r.setMessage("There are no Wallet transactions");
        }
		else
		{
			r.setStatus(true);
            r.setMessage("Wallet transactions ");
			ArrayList<String> l =  managment.print();
			r.object = l;
		}
		
		       
		return r;      
   }
	
	@PostMapping("/acceptrefund/{refundid}")
	public String acceptrefund(@PathVariable("refundid" ) int id) {
		
		RefundsManagment managment = RefundsManagment.getInstance();
		
		ListofRefunds l = ListofRefunds.getInstance();
		int index = -1;
		for(int i =0;i<l.RefundList.size();i++)
    	{
    		RefundRequest r = l.RefundList.get(i);
    		
    		if(r.getid() == id)
    			{index = i; break;}
    			
    	}
		if(index == -1)
		{
			return "There is no refund request with this id";
		}
		
		
		managment.giveRefund(index);
		
		return "Accepted Refund";
		
	}
	
	
	
	@PostMapping("/rejectrefund/{refundid}")
	public String rejectrefund(@PathVariable("refundid" ) int id) {
		
		RefundsManagment managment = RefundsManagment.getInstance();
		
		ListofRefunds l = ListofRefunds.getInstance();
		int index = -1;
		for(int i =0;i<l.RefundList.size();i++)
    	{
    		RefundRequest r = l.RefundList.get(i);
    		
    		if(r.getid() == id)
    			{index = i; break;}
    			
    	}
		if(index == -1)
		{
			return "There is no refund request with this id";
		}
		
		
		managment.removeRefund(index);
		
		return "Rejected Refund";
		
	}
	
	
	
}


