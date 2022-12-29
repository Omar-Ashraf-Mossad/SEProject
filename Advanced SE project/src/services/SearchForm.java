package services;

import java.util.Scanner;
import java.util.ArrayList;

public class SearchForm {



	String start(ArrayList<String> list, String name)
	{
		var scan = new Scanner(System.in);

		System.out.println(name);
		System.out.println("--------------------------------------------------");
		if(list.size()==0)
		{
			System.out.println("No Service Provider was found Matching your request");
			return null;
		}
		for(int i =0;i<list.size();i++)
		{
			
			System.out.println((i+1)+"-"+list.get(i));
		}
		System.out.println("--------------------------------------------------");
		System.out.print(">");
		//get choice
		int choice = scan.nextInt();


		if(choice<1&&choice>=list.size())
			return null;

		else
			return list.get(choice-1);
	}
}