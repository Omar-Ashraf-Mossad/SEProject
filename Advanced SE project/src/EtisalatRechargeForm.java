import java.util.Scanner;

public class EtisalatRechargeForm extends Form{
	public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Etisalat Recharge Service");
		System.out.println("-----------------------------------------");
		System.out.print("Enter your phone number:>");
		formdata.put("Number", i.nextLine());
		
		System.out.print("Enter Amount you want to add:>");
		amount = i.nextDouble();
		
		
		
	}
}
