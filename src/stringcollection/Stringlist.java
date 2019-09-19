/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:1
 *EEE-A
 */
package stringcollection;
import java.util.*;

public class Stringlist {

		public static void main(String[] args) {
			int option;
			int index,i;
			String n;
			Scanner sc=new Scanner(System.in);
			ArrayList<String> str;
			
			
			str=new ArrayList<String>();
			
			while(true)
			{
				System.out.println("1. To add an String at the end");
				System.out.println("2. To insert an String at particular index");
				System.out.println("3. To search for a String");
				System.out.println("4. To display all the Strings");
				System.out.println("5. To display the String starting with the given letter");
				System.out.println("6. Exit");
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
						System.out.printf("The String %s is found at the index %d \n",n,index);
					}
					break;
				case 4:
					System.out.println("The available Strings are:");
					for(i=0;i<str.size();i++)
					{
						System.out.println(str.get(i));
					}
					break;
				case 5:
					System.out.println("Enter the first letter charater:");
					n=sc.next();
					for(i=0;i<str.size();i++)
					{
						if(str.get(i).startsWith(n))
					{
						System.out.println(str.get(i));
					}
					}
					break;
				case 6:
					System.out.println("Thankyou for using String list application !!!");
					break;
				default:
					System.out.println("Please enter a valid String !!!");
				}
			}
	
		}
}

