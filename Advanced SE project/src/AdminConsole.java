import java.util.Scanner;

public class AdminConsole {

    RefundsManagment managment = new RefundsManagment();
    Scanner adminInput = new Scanner(System.in);

    public void ViewRefunds(){
        managment.getRefundsList().print();
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
            case 2 -> System.out.println("Operation 2");
            default -> System.out.println("Please enter a correct operation number");
        }

    }
    public AdminConsole() {
        System.out.println("pick an Operation : \n 1 to manage Refunds \n 2 to manage discounts ");
        int c = adminInput.nextInt();
        ViewOptions(c);
    }

}
