/**
 * Application for array list
 * 
 * developed by Mohan Raj c
 * cvmohanraj3@gmail.com
 * 
 * 
 */
package StringCollectionApplication;

import java.util.*;
import java.util.Arrays;





public class StringList {

	public static void main(String[] args) {
		int option;
		int index,i;
		String n,a;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> cha;
		
		
		cha=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("1. To add an string at the end");
			System.out.println("2. To insert an string at particular index");
			System.out.println("3. To search for a string");
			System.out.println("4. the string starts with:");
			System.out.println("5. To display all the string");
			System.out.println("6. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a string:");
				n=sc.next();
				cha.add(n);
				System.out.println("The given string is added at the end");
				break;
			case 2:
				System.out.print("Enter a string:");
				n=sc.next();
				System.out.print("Enter the index:");
				index=sc.nextInt();				
				cha.add(index,n);
				System.out.println("The given string is added at the given index");				
				break;
			case 3:
				System.out.print("Enter a string:");
				n=sc.next();
				index=cha.indexOf(n);
				if(index<0)
				{
					System.out.println("The given string is not available in the list");
				}else
				{
					System.out.printf("The string %s is found at the index %s\n",n,index);
				}
				break;
			case 4:
				System.out.println("The string starts with:");
				a=sc.next();
				for(i=0;i<cha.size();i++)
				{
					if(cha.get(i).startsWith(a)) 
					System.out.println(cha.get(i));
				}
				break;
			case 5:
				System.out.println("The available numbers are:");
				for(i=0;i<cha.size();i++)
				{
					System.out.println(cha.get(i));
				}
				break;
			case 6:
				System.out.println("Thankyou for using string list application !!!");
				break;
			default:
				System.out.println("Please enter a valid string !!!");
			}
			
			if(option==6)
			{		
				break;
			}
		}

	}

}
