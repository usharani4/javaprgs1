class Abc
{

/*int a;
void dis()
{
System.out.println("a="+a);
}
}
class App1
{
public static void main(String args[])
{
Abc obj1=new Abc();
Abc obj2=new Abc();
obj1.dis();
obj2.dis();
obj1.a=10;
obj1.dis();*/
Abc()
{
System.out.println("object created");
}
void dis()
{
System.out.println("dis method");
}
}
class App1
{
public static void main(String args[])
{
Abc obj1=new Abc();
obj1.dis();
}
}
