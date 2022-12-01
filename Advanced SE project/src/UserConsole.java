import java.util.Scanner;

public class UserConsole {
		
	private User user;
	
	UserConsole(User u){
		user = u;
	}
	
	void start()
	{
		boolean flag = true;
		while(flag)
		{
			System.out.println("-------------------------------");
			System.out.println("User:" + user.get_name());
			System.out.print("Balance = "+ user.get_balance());
			
			System.out.print("Choose Your operation:" );
			
			System.out.println("1-Search for a service");
			System.out.println("2-Add funds to wallet");
			System.out.println("3-Request a refund");
			System.out.println("4-check discount (not finished)");
			System.out.println("5-logout");
			System.out.println("-------------------------------");
			System.out.print(">");
			
			Scanner s = new Scanner(System.in);
		    int choice = s.nextInt();
		    
		    switch(choice)
		    {
		    case(4): System.out.print("This operation is not ready yet");
		    case(5):flag = false;
		    		break;
		    default: System.out.print("Please enter a correct operation number");
		    }
			
			
		}
	}
}