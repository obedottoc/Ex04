/***
 *Lakshmi priya P
 * lakshmipandian2103@gmail.com
 */
package Stringcollection;
import java.util.*;



public class Stringlist{

public static void main(String[] args) {
int option;
int index,i;
String n;
Scanner sc=new Scanner(System.in);
ArrayList<String> strings;


strings=new ArrayList<String>();

while(true)
{
System.out.println("1. To add a string at the end");
System.out.println("2. To insert a string at particular index");
System.out.println("3. To search for a string");
System.out.println("4. To display all the Strings");
System.out.println("5. To Display the strings starting with the given letter");
System.out.println("6. Exit");
System.out.print("Enter your choice:");

option=sc.nextInt();
switch(option)
{
case 1:
System.out.print("Enter a String:");
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
System.out.print("Enter a strings:");
n=sc.next();
index=strings.indexOf(n);
if(index<0)
{
System.out.println("The given strings is not available in the list");
}else
{
System.out.printf("The strings %s is found at the index %s\n",n,index);
}
break;
case 4:
System.out.println("The available numbers are:");
for(i=0;i<strings.size();i++)
{
System.out.println(strings.get(i));
}
break;

case 5:
   System.out.println("Enter the first letter character");
   n=sc.next();
   for(i=0;i<strings.size();i++)
    {
   if(strings.get(i).startsWith(n))
     {
   System.out.println(strings.get(i));
     }
   }
   break;
case 6:
System.out.println("Thankyou for using strings list application !!!");
break;
default:
System.out.println("Please enter a valid choice !!!");
}

if(option==6)
{	
break;
}
}

}

}


