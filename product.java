import java.io.*;
import java.util.*;
public class prodct
{
int pcode;
string pname;
double price;
void data(int a,string b,double c)
{
pcode=a;
pname=b;
price=c;
}
void display ()
{
System.out.println(pcode+"\t"+pname+"\t"+price"\t");
}
static void lowestprice(double p1,double p2,double p3) {
if(p1<=p2 && p1<=p3)
{
System.out.println("p1 is lowest");
}
else if(p2<=p1 && p2<=p3)
{ System.out.println("p2 is lowest");
else
{
System.out.println("p3 is lowest");
}
}
public static void main(String args[])
{
product ob1=new product();
product ob2=new product();
product ob3=new product();
ob1.data(101,"A",34.50);
ob2.data(102,"B",50.00);
ob3.data(103,"C",30.25);
ob1.display();
ob2.display();
ob3.display();
product.lowestprice(ob1.price,ob2.price,ob3.price);
}
}
