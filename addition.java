import java.io.*;
import java.util.*;
class addition {
public static void main(String args[])
{
int r1,r2,c1,c2,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of matrix A:");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("Enter the size of matrix B:");
r2=sc.nextInt();
c2=sc.nextInt();
int A[][]=new int[r1][c1];
int B[][]=new int[r2][c2];
int C[][]=new int[r1][c1];
System.out.println("Enter element of matrix A:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter element of matrix B:");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
B[i][j]=sc.nextInt();
}
}
if((r1==21)&&(c1==c2))
{
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
C[i][j]=A[i][j]+B[i][j];
}
}
System.out.println("The resultant matrix is :");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.println("\t+C[i][j]");
}
System.out.print("\n");
}
}
else
{
System.out.println("Addition is not possible");
}
}
}



