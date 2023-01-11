import java.util.*; //importing built-in package
class Teacher //base class
{
void job() //base class method
{
System.out.println("Teaching");
}
}
class Student extends Teacher //derived class inheriting base class
{
void job()//derived class method overriding the base class method
{
System.out.println("Studying");
}
}
class MethodOverriding//main class
{
public static void main(String args[])
{
Teacher ob=new Teacher();//creating object for base class
Student ob1=new Student();//creating object for student class
ob.job();//accessing method using base class object
ob1.job();//accessing method using derived class object
}
}