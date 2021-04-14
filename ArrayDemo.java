class ArrayDemo
{
public static void main(String args[])
{
/*int a;
int abc[];
int mno[]={};
int xyz[]={1,2,3,4,5};
System.out.println(mno.length);
System.out.println(xyz.length);*/
int abc[]={100,200,300,40};
System.out.println(abc[0]);
System.out.println("using for loop");
for(int i=0;i<abc.length;i++)
{
System.out.println(abc[i]);
System.out.println("using foreach loo");
for(int a:abc)
{
System.out.println(a);
}
}
}
}