import java.io.*;
import java.util.*;
class length{
public static void main(String args[]){
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String s=sc.nextLine();
String rev=" ";
for(i=(s.length()-1);i>=0;i--) {
rev+=s.charAt(i); }
System.out.println("reversed string is "+rev);
if(s.equals(rev)) {
System.out.println(s +"is a palindrome");
} else {
System.out.println(s +"is not  a palindrome");
}
}
}
