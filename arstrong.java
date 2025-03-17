import java.io.*;
import java.util.*;
class armstrong{
public static void main(String args[])
{
int n,sum=0,digit;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
int originalnum=n;
int digit=0;
while(n!=0) 
{
n/10;
digit++;
}
n=originalnum;
while(n!=0) {
digit=n%10;
sum+=digits;
n/10;
}
if(sum==originalnum) {
System.out.println(originalnum+"is an armstrong number");
}
else {
System.out.println(originalnum+"is an armstrong number");
}
}
