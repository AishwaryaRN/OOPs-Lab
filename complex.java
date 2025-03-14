class num {
int r;
int c;
num(int real,int comp)
{
r=real;
c=comp; 
}
void display() 
{
System.out.println(r+"+"+c+"i"); 
}
static void add(int r1,int c1,int r2,int c2) 
{
int re=r1+r2;
int co=c1+c2;
System.out.println("sum="+re+"+"+co+"i"); 
}
}
class complex
{
public static void main(String args[]) 
{
num first=new num(2,3);
num second=new num(4,7);
first.display();
second.display();
num.add(first.r,first.c,second.r,second.c);
}
}
