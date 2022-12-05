import java.util.Scanner;

public class MonthlyForm extends Form{
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Monthly Receipt for LandLine Add money to be used to pay your bill for the next month");
		System.out.println("-----------------------------------------");
		System.out.print("Enter your LandLineNumber:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount to be transfered:>");
		amount = i.nextDouble();
		
		
		
	}
}
