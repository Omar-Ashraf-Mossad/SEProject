import java.util.ArrayList;


import java.util.Scanner;


public class SearchForm {

	String start(ArrayList<String> list, String name)
	{
		var scan = new Scanner(System.in);
		System.out.println(name);
		
		System.out.println("-----------------");
		System.out.println(name);
		System.out.println("--------------------------------------------------");
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
