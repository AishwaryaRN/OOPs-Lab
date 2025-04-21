import java.io.*;
import java.util.*;
class student
{
String name="Neymer";
}
class sports extends student
{
String sportName="Football";
}
class result extends sports
{
String sportscore="first";
String academicScore="A+";
void display()
{
System.out.println("student Name:"+name);
System.out.println("Sports Name:"+sportName);
System.out.println("Sport Score:"+sportscore);
System.out.println("Academic Score:"+academicScore);
}
}
class sport 
{
public static void main(String args[])
{
result r=new result();
r.display();
}
}

