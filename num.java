import java.io.* ;
import java.util.*;
class num
{
public static void main(String args[])
{
int n,i,sum=0;
System.out.println("enter n");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("sum of n is "+sum);
}
}
