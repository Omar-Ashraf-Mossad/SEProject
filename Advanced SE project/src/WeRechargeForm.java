import java.util.Scanner;




public class WeRechargeForm extends Form {

	
	
	public void take_input(Scanner i) {
		

		System.out.println("We Mobile Recharge Service");
		System.out.println("-----------------------------------------");
		System.out.print("Enter your phone number:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount to be transfered:>");
		amount = i.nextDouble();
		
		
		
	}

	

}
