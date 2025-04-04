import java.util.*;
class shapes
{
public void areas(float radius)
{
double area=Math.PI*radius*radius;
System.out.println("Area of circle is" +area);
}
public void areas(int s)
{
int area=s*s;
System.out.println("Area of square is" +area);
}
public void areas(int l,int b)
{
int area=l*b;
System.out.println("Area of rectangle is" +area);
}
}
class area
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
shapes sh=new shapes();
System.out.println("Enter  the choice:1.Circle,2.square,3.rectangle");
int n=sc.nextInt();
switch(n)
{
case 1:{ System.out.println("Enter the radius of circle:");
int r=sc.nextInt();
sh.areas(r);
break; }
case 2:{ System.out.println("Enter the side of squares:");
int s=sc.nextInt();
sh.areas(s);
break; }
case 3:{ System.out.println("Enter the length and breadth of rectangle:");
int l=sc.nextInt();
int b=sc.nextInt();
sh.areas(l,b);
break; }
default:
System.out.println("Invalid choice:");
}
}
}

