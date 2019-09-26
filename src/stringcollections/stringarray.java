/*
 * Program to perform string collections
 * By Faizul
 * faizulsmart10@gmail.com
 */

package stringcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {

        int option;
        int index,i;
        String n;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> str;
        
        str=new ArrayList<String>();
    while(true)
    {
        System.out.println("1. To add a string at the end");
        System.out.println("2. To insert a string at particular index");
        System.out.println("3. To search for a string");
        System.out.println("4. To display all strings starting with the same letter");
        System.out.println("5. Exit");
        System.out.print("Enter your choice:");
        option=sc.nextInt();
        switch(option)
        {
        case 1:
            System.out.print("Enter a String:");
            n=sc.next();
            str.add(n);
            System.out.println("The given String is added at the end");
            break;
        case 2:
            System.out.print("Enter a String:");
            n=sc.next();
            System.out.print("Enter the index:");
            index=sc.nextInt();                
            str.add(index,n);
            System.out.println("The given String is added at the given index");                
            break;
        case 3:
            System.out.print("Enter a String:");
            n=sc.next();
            index=str.indexOf(n);
            if(index<0)
            {
                System.out.println("The given String is not available in the list");
            }else
            {
                System.out.printf("The String %s is found at the index %d\n" ,str,index);
            }
            break;
        case 4:
                    char l;
		System.out.println("Enter the starting letter: ");
				l=sc.next().charAt(0);
				
			for(i=0;i<str.size();i++)
			{
				String str1 = str.get(i);
				if(l==str1.charAt(0))
				System.out.println(str1);	
			}
				break;
        case 5:
            System.out.println("Thankyou for using String list application !!!");
            break;
        default:
            System.out.println("Please enter a valid String !!!");
        }
        
        if(option==5)
        {        
            break;
        }    
    }
    }
}
