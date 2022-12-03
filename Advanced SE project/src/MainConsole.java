import java.util.ArrayList;
import java.util.Scanner;

public class MainConsole {

	public static void main(String[] args) {
		
var scan = new Scanner(System.in);
		
		
		boolean flag = true;
		Isign control = new AccountControl();
		
		while(flag)
		{
			System.out.println("--------------------------------------");
			System.out.println("Choose your operation:");
			

			System.out.println("1-Sign Up");
			System.out.println("2-Login");
		
			System.out.println("3-exit");
			System.out.println("-------------------------------");
			System.out.print(">");
			
			Scanner s = new Scanner(System.in);
		    int choice = s.nextInt();
		    System.out.println("---------------------------------------------");
		    
		    s.nextLine();
		    switch(choice)
		    {
		    case(1):
		    		boolean flag2 = true;
		    		while(flag2) {
		
		    		System.out.println("Sign Up:");
		    		System.out.print("Please choose your user name:\n"+">");
		    		String name = s.nextLine();
		    		System.out.print("Please Enter your email:\n"+">");
		    		String email = s.nextLine();
		    		System.out.print("Please choose your password:\n"+">");
		    		String password = s.nextLine();
		    		
		    		
		    		String message = control.sign_up(name, email, password);
		    		if(message == null)
		    			{
		    			System.out.println("You have Successfuly registered!");
		    			flag2 = false;
		    			break;
		    			}
		    	
		    		else {
		    			System.out.println(message  + "please Try Again!");
		    			System.out.println("---------------------------------------------");
		    		}
		    			
		    		
		    		}
		    		break;
		    		
		    		
		    		
		    case(2): System.out.println("log in:");
    				 System.out.print("Please Enter your email:\n"+">");
    				 String email = s.nextLine();
    				 System.out.print("Please Enter your password:\n"+">");
    				 String password = s.nextLine();
    				 
    				 if(!control.log_in(email, password))
    				 {
    					 System.out.println("Wrong Information!");
    				 }
    				break;
    				
		    case(3):flag = false;
		    		break;
		    default: System.out.print("Please enter a correct operation number");
		    }
			
			
		}
		
		
		
	}

}
