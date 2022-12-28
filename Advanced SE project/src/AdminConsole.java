import java.util.ArrayList;
import java.util.Scanner;

public class AdminConsole {

    RefundsManagment managment = new RefundsManagment();
    Scanner adminInput = new Scanner(System.in);

    public void ViewRefunds(){
       ArrayList<String> l =  managment.getRefundsList().print();
       
       for(String s:l)
       {
    	   System.out.println(s);
       }
    }

    public void ViewOptions(int choice){
    	
        switch(choice) {
            case 1 -> {
                if(managment.EmptyList()){
                    System.out.println("Refund List is Empty.");
                }
                else{
                    System.out.println("List of Refunds : ");
                    ViewRefunds();
                    System.out.println("Pick a Refund to Approve or Reject: ");
                    int r = adminInput.nextInt();
                    System.out.println("Approve or Reject Refund number " + r +" (Enter 1 to Approve or 2 to Reject): ");
                    int AppOrRej = adminInput.nextInt();
                    switch (AppOrRej){
                        case 1 -> {
                            managment.giveRefund(r-1);
                        }
                        case 2 -> {
                            managment.removeRefund(r-1);
                        }
                        default -> {
                            System.out.println("Please enter a correct operation number");
                        }              
                    }
                }
                }
            case 2 -> {
            	System.out.println("Enter Discount Percent : ");
                DiscountManagment DM = new DiscountManagment();
                float perecnt = adminInput.nextFloat();
                boolean flag = true;
                while (flag){
                    System.out.println("Select Discount Type : \n 1 for overall discount \n 2 for specific discount");
                    int disChoice = adminInput.nextInt();
                    switch (disChoice){
                        case 1 -> {DM.SetOverAll(perecnt);
                                flag = false;
                        }
                        case 2 -> {DM.specificdiscount(perecnt);
                                flag = false;
                        }
                        default -> System.out.println("Please enter a correct operation number");
                    }
                }
                System.out.println("Discount has been added.");
            }
            default -> System.out.println("Please enter a correct operation number");
        }

    }
    public boolean start() {
    	
    	while(true) {
    		System.out.println("pick an Operation : \n 1 to manage Refunds \n 2 to manage discounts \n 3 to logout");
            int c = adminInput.nextInt();
            if(c==3)
            	return true;
            ViewOptions(c);
            
    	}
        
    }

}
