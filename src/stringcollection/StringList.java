/*developed by: Sanjai Kumar
* gsanjaik@gmail.com
*/
package stringcollection;
import java.util.*;
public class StringList {

	public static void main(String[] args) {
		int option;
		int index,i;
		String str1;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> strs;
		
		
		strs=new ArrayList<String>();
		
		while(true)
		{
			System.out.println("\n\n1. To add an String at the end");
			System.out.println("2. To insert an String at particular index");
			System.out.println("3. To search for a String");
			System.out.println("4. To display all the Strings starting with spcific letter");
			System.out.println("5. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a String:");
				str1=sc.next();
				strs.add(str1);
				System.out.println("The given string is added at the end");
				break;
			case 2:
				System.out.print("Enter a string:");
				str1=sc.next();
				System.out.print("Enter the index:");
				index=sc.nextInt();				
				strs.add(index,str1);
				System.out.println("The given string is added at the given index");				
				break;
			case 3:
				System.out.print("Enter a string:");
				str1=sc.next();
				index=strs.indexOf(str1);
				if(index<0)
				{
					System.out.println("The given string is not available in the list");
				}else
				{
					System.out.printf("The string %s is found at the index %d",str1,index);
				}
				break;
			case 4:
				char l;
				System.out.println("Enter the starting letter: ");
				l=sc.next().charAt(0);
				
				for(i=0;i<strs.size();i++)
				{
					str1=strs.get(i);
					if(l==str1.charAt(0))
						System.out.println(str1);	
				}
				break;
			case 5:
				System.out.println("Thankyou for using String list application !!!");
				break;
			default:
				System.out.println("Please enter a valid number !!!");
			}
			
			if(option==5)
			{		
				break;
			}
		}

	}

}
