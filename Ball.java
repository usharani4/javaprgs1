class Abc
{
int a;
static int b;
void dis1()
{
int a=100;
System.out.println("non static method");
System.out.println("a="+this.a);
System.out.println("b="+b);
}
static void dis2()
{
System.out.println("static method");
Abc obj=new Abc();
System.out.println("a="+obj.a);
System.out.println("b="+b);
}
}
class Ball
{
public static void main(String args[])
{
Abc obj1=new Abc();
obj1.dis1();
obj1.a=100;
obj1.b=200;
obj1.dis2();
obj1.a=200;
obj1.b=300;
}
} 