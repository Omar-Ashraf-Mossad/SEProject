package AdvancedSE.Phase2.controller;
import AdvancedSE.Phase2.userPack.User;
import AdvancedSE.Phase2.userPack.UserDataAccess;
import AdvancedSE.Phase2.Response;
import AdvancedSE.Phase2.MonitoringClasses.Currently_logined;
import AdvancedSE.Phase2.discountPack.OverallDiscounts;
import AdvancedSE.Phase2.form.Form;
import AdvancedSE.Phase2.paymentpac.Pay_on_delivery;
import AdvancedSE.Phase2.paymentpac.Pay_wallet;
import AdvancedSE.Phase2.paymentpac.Payment;
import AdvancedSE.Phase2.paymentpac.pay_CreditCard;
import AdvancedSE.Phase2.refundPack.RefundRequestControl;
import AdvancedSE.Phase2.serviceprovider.ServiceProvider;
import AdvancedSE.Phase2.services.SystemServices;
import AdvancedSE.Phase2.transactionPack.Transaction;
import AdvancedSE.Phase2.transactionPack.TransactionList;
import AdvancedSE.Phase2.transactionPack.WalletTransaction;
import AdvancedSE.Phase2.transactionPack.WalletTransactionList;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/User")
public class User_controller {
	
	
	private Currently_logined c = Currently_logined.getInstance();
	
	@GetMapping("/profile/{key}")
	public Response<User> getprofile(@PathVariable("key") long k)
	{
		
		Response<User> r = new Response<User>();
		
		if(c.get(k) == null)
		{
			r.setMessage("Wrong authentication key");
			r.setStatus(false);
			r.object = null;
			return r;
		}
		
		r.setStatus(true);
		r.setMessage("Your user profile data");
		r.object = c.get(k).user;
		
		return r;
		
	}
	
	@PostMapping("/requestRefund/{key}/{id}")
	public String request_refund(@PathVariable("key")long k, @PathVariable("id")int id)
	{
		if(c.get(k) == null)
		{
			return"Wrong authentication Key";
			
		}
		UserDataAccess access = c.get(k);
		
		
		RefundRequestControl controlObj = new RefundRequestControl();
		
		String msg = controlObj.RequestARefund(id,access.getmail());
		return msg;
		
	}
	
	@PostMapping("AddCard/{key}/{cardid}")
	public String addcard(@PathVariable("key")long k, @PathVariable("cardid")int card)
	{
		if(c.get(k) == null)
		{
			return"Wrong authentication Key";
			
		}
		UserDataAccess access = c.get(k);
		
		access.addcard(card);
		
		return "Card added Successfully";
		
	}
	@GetMapping("/getdiscountnames/{key}")
	public Response<ArrayList<String>> get_Discounts_name(@PathVariable("key") long k)
	{
		Response<ArrayList<String>> r = new Response<ArrayList<String>>();
		if(c.get(k) == null)
		{
			r.setMessage("Wrong authentication Key");
			r.setStatus(false);
			r.object = null;
			
			
			return r ;
		}
		
		r.setMessage("Authenticated");
		r.setStatus(true);
		
		SystemServices s1 = SystemServices.getInstance();
		
	     ArrayList<String> l1 = s1.get_providers();
	     
	     l1.add(0, "OverAll");
	     r.object = l1;
	     return r;
	}
	
	@PostMapping("/checkdiscount/{key}/{name}")
	public String check_discount(@PathVariable("name") String name,@PathVariable("key") long k )
	{
		if(c.get(k) == null)
		{
			return"Wrong authentication Key";
			
		}
		
		OverallDiscounts ov = OverallDiscounts.getInstance();
		SystemServices s1 = SystemServices.getInstance();
	     
	     if(name == null)
	    	 return "Wrong input";
	     
	     
	     else if (name.toUpperCase() .equals( "overall".toUpperCase()))
	    	 return "Overall Discuont: "+ ov.getPercent()+" %";
	     
	     else if(s1.get_SP(name)==null)
	    	 return "There is no service with that name";
	     
	     return name+": "+s1.get_SP(name).getDiscount()+" %";
	}

	
	////////////////////////////////////////////////////////////////////////	
	@PostMapping("/addwallet/{key}/{amount}")
	public String add_funds(@PathVariable("key")long k, @PathVariable("amount")double amo )
	{
		
		WalletTransactionList list = WalletTransactionList.getInstance();
		
		if(c.get(k) == null)
		{
			return "Wrong authentication Key";
		}
		UserDataAccess access = c.get(k);
		
		int cre = access.getcard();
		if(cre == -1)
			return "No credit card was found please add a credit card before performing this operation";
		
		access.add_to_wallet( amo);
		WalletTransaction w = new WalletTransaction(access.getmail(),access.getname(),cre,amo);
		
		list.addtransaction(w);
		
		return "You have added the amount to your wallet using your card: "+ cre;
	}
	////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/search/{key}/{searchword}")
	public Response<ArrayList<String>> search_service(@PathVariable("key")long k,@PathVariable("searchword")String name)
	{
		SystemServices s1 = SystemServices.getInstance();
		Response<ArrayList<String>> r = new Response<ArrayList<String>>();
		if(c.get(k) == null)
		{
			r.setMessage("Wrong authentication Key");
			r.setStatus(false);
			r.object = null;
			
			
			return r ;
		}
		
		ArrayList<String> l2;
		
		
		if(name.toUpperCase().equals( "ALL"))
		{
			 l2 = s1.get_providers();
			 
		}
			
		else
			l2 = s1.get_providers(name);
		
		if(l2.size()==0)
		{
			r.setMessage("No services were found matching the seach word");
			r.setStatus(false);
			r.object = null;
			return r;
		}
		
		r.setMessage("Services found");
		r.setStatus(true);
		r.object = l2;
		return r;
		
	}
	////////////////////////////////////////////////////////////////
	@GetMapping("/select/{key}/{spname}")
	public Response<Form> select_service(@PathVariable("key")long k,@PathVariable("spname")String name)
	{
		SystemServices s1 = SystemServices.getInstance();
		Response<Form> r = new Response<Form>();
		if(c.get(k) == null)
		{
			r.setMessage("Wrong authentication Key");
			r.setStatus(false);
			r.object = null;
			
			
			return r;
		}
		
			
		ServiceProvider p = s1.get_SP(name);
		
		if(p==null)
		{
			r.setMessage("No Service was found with that name");
			r.setStatus(false);
			r.object = null;
			return r;
		}
		
		Form f = p.create_form();
		f.start();
		
		r.setMessage("This the form properties and a list of form components each component contain the name of the input map key and input type and if exist drop down options  that this service accepts");
		r.setStatus(true);
		r.object = f;
		return r;
		
	}
	
	//////////////////////////////////////////////////////////
	@PostMapping("/pay/{payingMethod}/{key}/{spname}/{amount}")
	public Response<String> pay(@PathVariable("payingMethod")String m,@RequestBody Map<String,String> input,@PathVariable("key")long k,@PathVariable("spname")String spname,@PathVariable("amount")double amount )
	{
		SystemServices s1 = SystemServices.getInstance();
		Response<String> r = new Response<String>();
		if(c.get(k) == null)
		{
			r.setMessage("Wrong authentication Key");
			r.setStatus(false);
			r.object = null;
			
			
			return r;
		}
		
			
		ServiceProvider p = s1.get_SP(spname);
		
		if(p==null)
		{
			r.setMessage("No Service was found with that name");
			r.setStatus(false);
			r.object = null;
			return r;
		}
		UserDataAccess access = c.get(k);
		
		boolean deliverable=p.get_deliverystate();
		double dis=p.getDiscount();
		String userNa=access.getname();
		
		String service_provider=spname;
		double temp=0;
		double dis2 = 0;
		

		if(access.isnew()) {
			OverallDiscounts discount = OverallDiscounts.getInstance();
			 dis2 = discount.getPercent();
		}
		temp=amount-(dis*amount)/100-(dis2*amount)/100;
		Payment pays;
		
		if(m.equals("bycard"))
		{
			
			int cre = access.getcard();
			if(cre == -1)
			{
				r.setStatus(false);
				r.setMessage("No credit card was found please add a credit card before performing this operation");
				r.object = ("Payment Failed");
				return r;
			}
			pays = new pay_CreditCard(cre);
			
		}
		else if(m.equals("bywallet"))
		{
			pays = new Pay_wallet();
		}
		else if(m.equals("oncash"))
		{
			if(!deliverable)
			{
				r.setStatus(false);
				r.setMessage("Sorry this service does nor support payment on cash");
				r.object = ("Payment Failed");
				return r;
			}
			pays = new Pay_on_delivery(); 
			
		}
		else {		r.setStatus(false);
					r.setMessage("\"Wrong payment Method name");
					r.object = ("Payment Failed");
					return r;
			}
		Response<String> res = pays.pay(userNa,temp,service_provider);
		
		if(!res.isStatus())
		{
			return res;
		}
		
		TransactionList list = TransactionList.getInstance();
		
		Transaction t = new Transaction(access.getmail(),p.get_name(),0,temp);
		int id = list.addtransaction(t);
		
		String message = p.handle(input, amount);
		
		access.changestate();
		res.object = "\n--------------------\n Your Receipt ID is:"+id+"\n--------------------------------\n"+message;
		return res;
		
	}
	
		
		
	
	//////////////////////////////////////////////////////////////
	@PostMapping("/logout/{key}")
	public String logout(@PathVariable("key") long k)
	{
		if(c.remove(k))
			return " You have Logged out Succsefully";
		else
			return "This Key does not exist";
		
	}

}
