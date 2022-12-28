import java.util.Scanner;
public class PaymentConsole {
	Payment pays;
	public boolean run(boolean Isdelivery,double discount,double discount2,String username,double amo,String ser,String ser_prov)
	{
		boolean deliverable=Isdelivery;
		double dis=discount;
		String userNa=username;
		String service=ser;
		String service_provider=ser_prov;
		double temp=0;
		double amount=amo;
		boolean flag=false;
		Scanner is = new Scanner(System.in);
		
			temp=amount-(discount*amount)/100-(discount2*amount)/100;
			flag=true;
		
		System.out.println("-------------------------------");
		System.out.println("Your money amount:"+ amount);
		System.out.println("ServiceDiscount: "+discount+"%");
		System.out.println("Overall discount: "+discount2+"%");
		System.out.println("-------------------------------");
		System.out.println("total: "+ temp);
		System.out.println("-------------------------------");
		
		System.out.println("how do you want to pay for the service: "+service);
		System.out.println("1- Via credit card");
		System.out.println("2- By wallet");
		if(deliverable)
		{
			System.out.println("3- On delivery");
		}
		System.out.println("-------------------------------");
		int choice = is.nextInt();
		//if the user entered any number other than the valid operations
		while(choice>3)
		{
			System.out.println("enter one of the valid operations");
			choice = is.nextInt();
		}
		boolean res=false;
		 switch(choice)
		 {
		 case(1): pays = new pay_CreditCard();
		 		  res= pays.pay(userNa,temp,service_provider);
			 	  break;
			 	  
		 case(2): pays = new Pay_wallet();
			 	   res= pays.pay(userNa,temp,service_provider);
			 	  break;
		 case(3): pays = new Pay_on_delivery();
		 		  res= pays.pay(userNa,temp,service_provider);
			 	  break;
		 
		 }
		 return res;
						
	}

}
