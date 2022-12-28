import java.util.ArrayList;
import java.util.Scanner;

public class Discuonts_form {
	
	
	public String start(ArrayList<String> list)
	{
		
		var scan = new Scanner(System.in);
		

		System.out.println("-----------------");
		System.out.println("Please enter the number of the service you want to check the discount for:");
		System.out.println("--------------------------------------------------");
		System.out.println((1)+"- Over All discounts");
		for(int i =0;i<list.size();i++)
		{
			System.out.println((i+2)+"-"+list.get(i));
		}
		System.out.println("--------------------------------------------------");
		System.out.print(">");
		//get choice
		int choice = scan.nextInt();


		if(choice<1&&choice>=list.size())
			return null;

		if(choice == 1)
		{
			return "overall";
		}
			
			
		return list.get(choice-2);
		
	}
}
