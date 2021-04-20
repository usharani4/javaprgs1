class Bike
{
void speed()
{
System.out.println("60km/hr");
}
}
class pulsar extends Bike
{
void speed()
System.out.println("90 km/hr");
}
void color()
{
System.out.println("red");
}
}
class Honda extends Pulsar
{
void speed()
{
System.out.println("150km/hr");
}
}
class OverRidingExample
{
public static void main(String args[])
{
Bike bb=new Bike();
bb.spped();
Pulsar pp=new Pulsar();
pp.spped();
pp.color();
Honda hh=new Honda();
hh.speed();
}
}
