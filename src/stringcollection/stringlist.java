 
/*
 * This program is maintain the list of numbers
 * Developed by
 * panneer D.
 * Saveetha Engineering College
 * selvamthalamail.com
 *
 * 
 * 
 */
package stringcollection;

import java.util.*;



public class stringlist {

	public static void main(String[] args) {
		int option;
		int index,i;
		String n,a;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list;
		
		
		list=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("1. To add an integer String at the end");
			System.out.println("2. To insert an integer String at particular index");
			System.out.println("3. To search for a String");
			System.out.println("4. To display all the String");
			System.out.println("5. enter the letter");
			System.out.println("6. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a String:");
				n=sc.next();
				list.add(n);
				System.out.println("The given String is added at the end");
				break;
			case 2:
				System.out.print("Enter a String:");
				n=sc.next();
				System.out.print("Enter the index:");
				index=sc.nextInt();				
				list.add(index,n);
				System.out.println("The given String is added at the given index");				
				break;
			case 3:
				System.out.print("Enter a String:");
				n=sc.next();
				index=list.indexOf(n);
				if(index<0)
				{
					System.out.println("The given String is not available in the list");
				}else
				{
					System.out.printf("The String %s is found at the index %\n",n,index);
				}
				break;
			case 4:
				System.out.println("The available String are:");
				for(i=0;i<list.size();i++)
				{
					System.out.println(list.get(i));
				}
				break;
			case 5:
				System.out.println("Enter the letter");
                a=sc.next();
                for(i=0;i<list.size();i++)
				if(list.get(i).startsWith(a))
				{
					System.out.println(list.get(i));
				
				}
				break;
			case 6:
				System.out.println("Thankyou for using String list application !!!");
				break;
			default:
				System.out.println("Please enter a valid String !!!");
			}
			
			if(option==6)
			{		
				break;
			}
		}

	}
    
}
