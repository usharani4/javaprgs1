class Car
{
int wheels;
float price;
String color;
void start()
{
int a;
System.out.println("car started..");
System.out.println("wheels"+wheels);
System.out.println("color:"+color);
System.out.println("price:"+price);
System.out.println("a"+a);
}
void stop()
{
String msg="welcome";
System.out.println("wheels"+wheels);
System.out.println("color"+color);
System.out.println("msg"+msg);
}
class Car1
{
public static void main (String [] args)
{
Car innova=new Car();
innova.start();
innova.stop();
}
}
}

















