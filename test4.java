import java.io.*;
import java.util.Scanner;
class test4
{
public static void main(String args[])
{
int a,b;
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number for A");
a=obj.nextInt();
System.out.println("Enter a number for B");
b=obj.nextInt();
System.out.println("Before Swapping");
System.out.println("A="+a);
System.out.println("B="+b);
int temp=a;
a=b;
b=temp;
System.out.println("After Swapping");
System.out.println("A="+a);
System.out.println("B="+b);
}
}

