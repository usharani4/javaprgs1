public class EmployeeB
{
private String name;
private float salary;
public String getName()
{
return name;
}
public void setName(String newname)
{
this.name=newname;
}
public float getSalary()
{
return salary;
}
public void setSalary(float salary)
{
this.salary=salary;
}
public static void main(String args[])
{
EmployeeB emp1=new EmployeeB();
emp1.setName("usha");
emp1.setSalary(50000);
System.out.println(emp1.getName());
System.out.println(emp1.getSalary());
}
}