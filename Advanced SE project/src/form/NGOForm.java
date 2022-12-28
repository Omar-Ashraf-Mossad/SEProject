package form;
import java.util.Scanner;

public class NGOForm extends Form{
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Donate to a non profitable organization");
		System.out.println("-----------------------------------------");
		System.out.print("Enter Organization name:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount to be transfered:>");
		amount = i.nextDouble();
		
		
		
	}

}
