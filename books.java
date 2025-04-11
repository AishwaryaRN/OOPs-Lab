import java.io.*;
import java.util.*;
class publisher
{
String name="DC Books";
}
class book extends publisher
{
String book_Name="Mysterious woods";
}
class literature extends book
{
String type="literature";
}
class fiction extends book
{
String type="fiction";
}
class books
{
public static void main(String args[])
{
literature lb=new literature();
fiction fb= new fiction();
System.out.println("Fiction book details:");
System.out.println("publisher:"+fb.name+"name is:"+fb.book_Name+"type is :"+fb.type);
System.out.println("Literature book details:");
System.out.println("publisher:"+lb.name+"name is:"+lb.book_Name+"type is :"+lb.type);
}
}

