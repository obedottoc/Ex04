
/**
 * Application for area and length conversion
 * 
 * developed by
 * tamilfreakz002@gmail.com
 * saveetha engineering college 
 * tamilfreakz002@gmail.com
 * 
 */


package stringcollection;

import java.util.*;

public class StringList {

    public static void main(String[] args) {
        int option;
        String n;
        int index,i;
        String a;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> nums;
       
       
        nums=new ArrayList<String>();
       
        while(true)
        {
            System.out.println("1. To add an string at the end");
            System.out.println("2. To insert an string at particular index");
            System.out.println("3. To search for a string");
            System.out.println("4. To display all the strings starts with a given letter");
            System.out.println("5. To display all the strings");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:");
           
            option=sc.nextInt();
            switch(option)
            {
            case 1:
                System.out.print("Enter a string:");
                n=sc.next();
                nums.add(n);
                System.out.println("The given string is added at the end");
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
                }
                else
                {
                    System.out.printf("The string %s is found at the index %s\n",n,index);
                }
                break;
            case 4:
                System.out.println("Enter a letter:");
                a=sc.next();
              
                for(i=0;i<nums.size();i++)
                {
                    if(nums.get(i).startsWith(a))
                    {
                        System.out.println(nums.get(i));
                    }
                }
                break;
            case 5:
                System.out.println("The available strings are:");
                for(i=0;i<nums.size();i++)
                {
                    System.out.println(nums.get(i));
                }
                break;
            case 6:
                System.out.println("Thankyou for using string list application !!!");
                break;
            default:
                System.out.println("Please enter a valid number !!!");
            }
           
            if(option==6)
            {       
                break;
            }
        }

    }
}


	

