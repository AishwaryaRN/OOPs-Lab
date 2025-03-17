import java.io.*;
import java.util.*;
class rev
{
public static void main(String args[])
{
int num,reve=0,digit;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.nextInt();
while(num!=0) 
{
digit=num%10;
reve=(reve*10)+digit;
num=num/10;
}
System.out.println("Reverse of the given number is"+reve);
}
}



