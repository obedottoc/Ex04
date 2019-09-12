package stringcollection;

import java.util.*;



public class StringList
	{

	public static void main(String[] args) {
		int option;
		String n;
		int index,i;
		Scanner sc=new Scanner(System.in);
		ArrayList<String>strings;
		
		
		strings=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("1. To add an string at the end");
			System.out.println("2. To insert an string at particular index");
			System.out.println("3. To search for a string");
			System.out.println("4. To  List all string starts with given letter");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a string:");
				n=sc.next();
				strings.add(n);
				System.out.println("The given string is added at the end");
				break;
			case 2:
				System.out.print("Enter the string:");
				n=sc.next();
				System.out.print("Enter the index:");
				index=sc.nextInt();				
				strings.add(index,n);
				System.out.println("The given string is added at the given index");				
				break;
			case 3:
				System.out.print("Enter a string:");
				n=sc.next();
				index=strings.indexOf(n);
				if(index<0)
				{
					System.out.println("The given string is not available in the list");
				}else
				{
					System.out.printf("The string %s is found at the index %s\n",n,index);
				}
				break;
			case 4:
				System.out.println("enter the string start letter");
				n=sc.next();
				for(i=0;i<strings.size();i++)
				{
					if(strings.get(i).startsWith(n))
					{
						System.out.println(strings.get(i));
					}
						
				}
				
				
				break;
				default:
					System.out.println("INVALID");
			
		
			}
			
		
		}

	}
}
