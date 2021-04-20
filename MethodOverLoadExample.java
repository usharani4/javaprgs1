class Abc
{
void add(int a,int b)
{
System.out.println(a+b);
}
void add(float a ,int b)
{
System.out.println(a+b);
}
}
class MethodOverLoadExample
{
public static void main (String args[])
{
Abc obj=new Abc();
obj.add(2,3);
obj.add(2.5f,4);
}
}