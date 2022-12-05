import java.util.Scanner;

public class SchoolDonationForm extends Form {
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Donate to a School");
		System.out.println("-----------------------------------------");
		System.out.print("Enter School name:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount to be transfered:>");
		amount = i.nextDouble();
		
		
		
	}

}
