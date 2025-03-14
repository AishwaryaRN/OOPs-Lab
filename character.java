import java.io.*;
import java.util.*;
class character 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
char ch= sc.nextLine().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("The character is  vowel"+ch);
}
else {
System.out.println("The character is consonant"+ch);
}
}
}
