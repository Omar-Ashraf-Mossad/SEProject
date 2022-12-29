package form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FormReader {

	double amount;
	Map<String,String> result = new HashMap<String,String>();
	
	public boolean start(Form f)
	{
		Scanner i = new Scanner (System.in);
		
		
		System.out.println(f.getName());
		System.out.println("-----------------------------------------");
		
		ArrayList<FormComponent> list = f.getL();
		String s_value;
		Float f_value;
		int i_value;
		
			
			int index;
			for( index =0;index<list.size();index++)
			{
				FormComponent c = list.get(index);
				System.out.print(c.getMessage()+" ");
				
				
				if(c.isHasoptions())
					break;
				if(c.getType() == "I")
				{
					i_value = i.nextInt();
					s_value = Integer.toString(i_value);
					i.nextLine();
				}
				else if (c.getType() == "F")
				{
					f_value = i.nextFloat();
					s_value = Float.toString(f_value);
					i.nextLine();
				}
				else				
				{
					s_value = i.nextLine();
					
				}
				System.out.println("-----------------------------------------");
				result.put(c.getMapkey(),s_value);
			}
			
	if(f.limited)
	{
		System.out.println(f.getOptions_Message());
		
		System.out.print("Enter Your choice:> ");
		int choice;
		choice = i.nextInt();
			
		while(choice<1&&choice> f.getAmount_options().size())
		{
		    System.out.println("Please enter a valid option");
			choice = i.nextInt();
		}
			
		for(;index<list.size();index++)
		{
			FormComponent c = list.get(index);
				
			result.put(c.getMapkey(), c.getOptions().get(choice-1));
				
		}
			
			amount = f.getAmount_options().get(choice-1);
		}
		else
		{		
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
		return result;
	}
	public double get_amount()
	{
		return amount;
	}
}
