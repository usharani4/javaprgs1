class Employee
{
 private String name;
private float salary;
void setValue(String name,float salary)
{
this.name=name;
if (salary>0)
{
this.salary=5000;
}
else
{
this.salary=salary;
}
}
void display()
{
System.out.println("name is:"+name);
System.out.println("salary is:"+salary);
}
}
class EmployeeA
{
public static void main(String args[])
{
Employee emp1=new Employee();
/*emp1.name="ramesh";
emp1.salary=5000;*/
emp1.setValue("ramesh",-12000);
emp1.display();
}
}
