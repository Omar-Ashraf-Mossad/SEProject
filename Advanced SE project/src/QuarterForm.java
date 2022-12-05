import java.util.Scanner;

public class QuarterForm extends Form{
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Quarter Receipt for 4 months");
		System.out.println("-----------------------------------------");
		System.out.print("Enter your LandLineNumber:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount to be transfered:>");
		amount = i.nextDouble();
		
		
		
	}
}
