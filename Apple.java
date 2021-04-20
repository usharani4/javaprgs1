class Abc
{
int a;
static int b;
void dis1()
{
System.out.println("non-static method");
}
static void dis2()
{
System.out.println("static method");
}
}
class Apple
{
public static void main(String args[])
{
Abc A1=new Abc();
A1.dis1();
Abc.dis2();
A1.dis2();
}
}

 