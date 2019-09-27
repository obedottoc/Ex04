/** 
 * Devloped by Mari Bhagavathi.T
 * mari36mars@gmail.com
 */

package StringCollection;

import java.util.*;



public class StringList {

    public static void main(String[] args) {
        int option;
        String n;
        int index;
        int i;
        String a;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> nums;
       
       
        nums=new ArrayList<String>();
       
        while(true)
        {
            System.out.println("1. To add an String  at the end");
            System.out.println("2. To insert an String at particular index");
            System.out.println("3. To search for a String");
            System.out.println("4. To display with letter");
            System.out.println("5. display all");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:");
       
            option=sc.nextInt();
            switch(option)
            {
            case 1:
            	System.out.println("Enter a String:");
            	n=sc.next();
            	nums.add(n);
            	System.out.println("The given number is added at the end");
            	break;
            case 2:
            	System.out.print("Enter a String:");
            	n=sc.next();
            	System.out.print("Enter the index:");
            	index=sc.nextInt();
            	nums.add(index,n);
            	System.out.println("The given String is added at the given index");
                break;
            case 3:
            	System.out.println("Enter a String:");
            	n=sc.next();
            	index=nums.indexOf(n);
            	if(index<0)
            	{
            		System.out.println("The given String is not available in list");
            	}
            	else
            	{
            		System.out.printf("The String %s is found at the index %s\n",n,index);
            	}
            	break;
            case 4:
            	System.out.println("Enter a letter");
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
            	System.out.println("The available Strings are:");
            	for(i=0;i<nums.size();i++)
            	{
            		System.out.println(nums.get(i));
            		 
            	}
            	break;
            case 6:
            	System.out.println("Thank for using number list application!!!");
            	break;
            	
            default:
            	
            	System.out.println("Please enter a valid String!!!");
            }
            if(option==6)
            {
            	break;
            }
            }
        }
    }
            