import java.util.Scanner;

public class OrangeRechargeForm extends Form{
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Orange Mobile Recharge Service");
		System.out.println("-----------------------------------------");
		System.out.print("Enter your orange number :>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Money amount:>");
		amount = i.nextDouble();
		
		
		
	}
}
