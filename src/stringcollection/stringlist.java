/*
 * This program is maintain the list of numbers
 * Developed by
 * R.Neha
 * Saveetha Engineering College
 * rasapallenehareddy@gmail.com
 * 
 */
package stringcollection;

import java.util.*;



public class stringlist {

	public static void main(String[] args) {
		int option;
		int index,i;
		String n;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> strings;
		
		
		strings=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("1. To add an string at the end");
			System.out.println("2. To insert an string at particular index");
			System.out.println("3. To search for a string");
			System.out.println("4. To display all the strings");
			System.out.println("5. To list all strings start with given letter");
			System.out.println("6. Exit");
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
				System.out.print("Enter a string:");
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
					System.out.printf("The string %d is found at the index %d\n",n,index);
				}
				break;
			case 4:
				System.out.println("The available strings are:");
				for(i=0;i<strings.size();i++)
				{
					System.out.println(strings.get(i));
				}
				break;
			case 5:
			{
				System.out.println("enter string starting letter");
				n=sc.next();
				for(i=0;i<strings.size();i++)
				{
					if (strings.get(i).startsWith(n)) {
					System.out.println(strings.get(i));
				}
				}
				break;
				}
			case 6:
				System.out.println("Thankyou for using string list application !!!");
				break;
			default:
				System.out.println("Please enter a valid numbers !!!");
			}
			
			if(option==6)
			{		
				break;
			}
		}

	}

}
