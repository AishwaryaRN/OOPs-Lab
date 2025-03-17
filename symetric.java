import java.io.*;
import java.util.*;
public class symetric  {
public static void main(String args[]){
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the  matrix:");
int m=sc.nextInt();
int n=sc.nextInt();
if(m==n) {
int [][]matrix=new int[m][n];
System.out.println("Enter the  matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++) {
matrix[i][j]=sc.nextInt();
}
}
System.out.println("The given matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(matrix[i][j]+ " ");
}
System.out.print("\n");
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(matrix[i][j]!=matrix[j][i])
{
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println("The given matrix is symmetric"); }
else
{
System.out.println("The given matrix is  not symmetric");
}
}
else
{
System.out.println("not symmetric");
}
}
}

