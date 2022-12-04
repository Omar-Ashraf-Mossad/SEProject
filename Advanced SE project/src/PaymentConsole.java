import java.util.Scanner;
public class PaymentConsole {
	Payment pays;
	public void run(boolean Isdelivery,double discount,String username,double amo,String ser,String ser_prov)
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
		if(discount!=0)
		{
			temp=amount-(discount*amount);
			flag=true;
		}
		System.out.println("-------------------------------");
		if(flag)
		{
			System.out.println("there were an discount applied on the amount: "+amount+" and the final price is: "+temp+" pounds");
		}
		System.out.println("how do you want to pay dor the service: "+service);
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
			System.out.println("enter one of the services");
			choice = is.nextInt();
		}
		 switch(choice)
		 {
		 case(1): pays = new pay_CreditCard();
		 		  pays.pay(userNa,amount,service_provider);
			 	  break;
			 	  
		 case(2): pays = new Pay_wallet();
			 	  pays.pay(userNa,amount,service_provider);
			 	  break;
		 case(3): pays = new Pay_on_delivery();
		 		  pays.pay(userNa,amount,service_provider);
			 	  break;
		 
		 }
						
	}

}
