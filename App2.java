class Abc
{
int a,b,sum;
Abc()
{
a=10;
b=20;
}
Abc(int x,int y)
{
a=x;
b=y;
}
void setValue(int x,int y)
{
a=x;
b=y;
}
void add()
{
sum=a+b;
}
void display()
{
System.out.println("sum is"+sum);
}
}
class App2
{
public static void main(String args[])
{
Abc obj=new Abc();
obj.add();
obj.display();
Abc obj2=new Abc();
obj2.add();
obj2.display();
Abc obj3=new Abc(100,200);
obj3.add();
obj3.display();
Abc obj4=new Abc();
obj4.setValue(1,2);
obj4.setValue(4,5);
obj4.add();
obj4.setValue(7,8);
obj4.display();
}
}