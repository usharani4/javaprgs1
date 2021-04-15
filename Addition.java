public class Addition
{
private int a=5,b=7,sum;
public int getSum()
{
return sum;
}
private void setSum( int sum)
{
sum=a+b;
this.sum=sum;
}
public static void main(String args[])
{
Addition add=new Addition();
add.setSum(5+7);
System.out.println(add.getSum());
}
}