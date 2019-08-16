package Stringcollection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Stringlist {

public static void main(String[] args) {

int option,index,i;
String n;
Scanner sc=new Scanner(System.in);
ArrayList alpha;


alpha=new ArrayList();

while(true)
{
System.out.println("1. To add an string at the end");
System.out.println("2. To insert an string at particular index");
System.out.println("3. To search for a string");
System.out.println("4. To display all the string");
System.out.println("5. Exit");
System.out.print("Enter your choice:");

option=sc.nextInt();
switch(option)
{
case 1:
System.out.print("Enter a string:");
n=sc.next();
alpha.add(n);
System.out.println("The given string is added at the end");
break;
case 2:
System.out.print("Enter a string:");
n=sc.next();
System.out.print("Enter the index:");
index=sc.nextInt();
alpha.add(index,n);
System.out.println("The given string is added at the given index");
break;
case 3:
System.out.print("Enter a string:");
n=sc.next();
index=alpha.indexOf(n);
if(index<0)
{
System.out.println("The given string is not available in the list");
}else
{
System.out.printf("The string %s is found at the index %s\n",n,index);
}
break;
case 4:
System.out.println("The available string are:");
for(i=0;i<alpha.size();i++) {
System.out.println(alpha.get(i));
}
break;
case 5:
System.out.println("Thankyou for using string list application !!!");
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