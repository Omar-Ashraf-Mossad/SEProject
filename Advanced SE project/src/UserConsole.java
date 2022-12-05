import java.util.Scanner;
public class UserConsole {
		
	private UserDataAccess access;
	
	UserConsole(UserDataAccess u){
		access = u;
	}
	
	void start()
	{
		boolean flag = true;
		while(flag)
		{
			System.out.println("-------------------------------");
			System.out.println("User:" + access.getname());
			System.out.println("Balance = "+ access.getbalance());
			
			System.out.println("Choose Your operation:" );
			
			System.out.println("1-Search for a service");
			System.out.println("2-Add funds to wallet");
			System.out.println("3-Request a refund");
			System.out.println("4-check discount (not finished)");
			System.out.println("5-logout");
			System.out.println("-------------------------------");
			System.out.print(">");
			
			Scanner s = new Scanner(System.in);
			Scanner wall= new Scanner(System.in);
			Scanner credit=new Scanner(System.in);
		    int choice = s.nextInt();
		    
		    switch(choice)
		    {
		    case(1):  OperationControl control = new OperationControl();
		    			String result = control.getSP(access.getname(),access.getmail(),access.isnew(),access);
		    			
		    			if(result != null) {
		    				System.out.println(result);
		    				System.out.println("----------------------------------------");
		    			}
		    				
		    			break;
		    case(2):System.out.println("enter the amount to be added to wallet and your credit card");
		    		double amo;
		    		int cre;
		    		amo=wall.nextDouble();
		    		cre=credit.nextInt();
		    		access.add_to_wallet( amo);
		    		System.out.println("You have added the amount to your wallet");
		    		break;
		    			
		    case(4): System.out.println("This operation is not ready yet");
		    		break;
		    case(5):flag = false;
		    		break;
		    default: System.out.println("Please enter a correct operation number");
		    }
			
			
		}
	}
}