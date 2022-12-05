import java.util.Scanner;

public class VodafoneRechargeForm extends Form {
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Vodafone Recharge Service :     Welcome!");
		System.out.println("-----------------------------------------");
		System.out.print("Enter your Vodafone number:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount to be transfered:>");
		amount = i.nextDouble();
		
		
		
	}
}
