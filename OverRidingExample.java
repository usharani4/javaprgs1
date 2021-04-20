abstract class Bike
{
abstract void speed();
}

abstract class Pulsar extends Bike
{
void color()
{
System.out.println("red");
}
}
class Honda extends Bike
{
@Override
void speed()
{
System.out.println("150km/hr");
}
}
class OverRidingExample
{
public static void main(String args[])
{
Honda hh=new Honda();
hh.speed();

}
}
