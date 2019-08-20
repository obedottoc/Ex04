package stringcollection;

import java.util.ArrayList;
import java.util.Scanner;

public class stringlist {
	public static void main(String[] args) {
		int option;
		String n; 
		int index,i;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> nums;
		
		
		nums=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("1. To add an string  at the end");
			System.out.println("2. To insert an string at particular index");
			System.out.println("3. To search for a string");
			System.out.println("4. To display all the strings");
			System.out.println("5. To List all string starts with given letter");
			System.out.println("6. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a string:");
				n=sc.next();
				nums.add(n);
				System.out.println("The given  is added at the end");
				break;
			case 2:
				System.out.print("Enter a string:");
				n=sc.next();
				System.out.print("Enter the index:");
				index=sc.nextInt();				
				nums.add(index,n);
				System.out.println("The given string is added at the given index");				
				break;
			case 3:
				System.out.print("Enter a string:");
				n=sc.next();
				index=nums.indexOf(n);
				if(index<0)
				{
					System.out.println("The given string is not available in the list");
				}else
				{
					System.out.printf("The string %d is found at the index %d\n",n,index);
				}
				break;
			case 4:
				System.out.println("The available strings are:");
				for(i=0;i<nums.size();i++)
				{
					System.out.println(nums.get(i));
				}
				break;
			case 5:
				System.out.println("Enter the first letter character");
				n=sc.next();
				for(i=0;i<nums.size();i++)
				{
					if(nums.get(i).startsWith(n))
					{
						System.out.println(nums.get(i));
					}
				}
				break;
			case 6:
				System.out.println("Thankyou for using string list application !!!");
				break;
			default:
				System.out.println("Please enter a valid string !!!");
			}
			
			if(option==5)
			{		
				break;
			}
		}

	}

}

