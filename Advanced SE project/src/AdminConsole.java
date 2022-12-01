import java.util.Scanner;

public class AdminConsole {
	
	 Scanner adminInput = new Scanner(System.in);
	 
	 public void ViewOptions(int choice){
	     switch(choice) {
	         case 1 -> System.out.println("Operation 1");
	         case 2 -> System.out.println("Operation 2");
	     }

	 }
	     public AdminConsole() {
	         System.out.println("pick an Operation : \n 1 to manage Refunds \n 2 to manage discounts ");
	         int c = adminInput.nextInt();
	         ViewOptions(c);
	     }

}
