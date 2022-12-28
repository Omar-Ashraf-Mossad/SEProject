package form;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public abstract class Form {
	
	protected Map<String,String> formdata = new HashMap<String,String>();
	boolean takeamount = true;
	public double amount;
	
	public boolean start() {
//Template Method	
		
		
		Scanner i = new Scanner(System.in);

		take_input(i);
		if(takeamount) {
			System.out.print("Enter Amount of money:>");
			amount = i.nextDouble();
		}
		
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("1-Confirm payment         2-Cancel");
		System.out.println("-----------------------------------------");
		System.out.print(">");
		int choice = i.nextInt();
		
		if(choice==1)
			return true;
		else
			return false;
	}
	public Map<String,String> get_data()
	{
		return formdata;
	}
	public double get_amount()
	{
		return amount;
	}
	
	abstract void take_input(Scanner i);
	
}
