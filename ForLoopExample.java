class ForLoopExample
{
public static void main(String args[])
{
int i=20;
for(i=0;i<=10;i++)
{
if(i==5)
break;
System.out.println(i);
}
for(i=0;i<=10;i++)
{
if(i==5)
continue;
System.out.println(i);
}
}
}