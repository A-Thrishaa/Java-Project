import java.util.*;//importing built-in package
class Sample//class declaration
{
void display(char a)//method with one argument
{
System.out.println(a);
}
void display(char a,int num)//same method with two arguments
{
System.out.println(a+" "+num);
}
}
class MethodOverloading//main class
{
public static void main(String args[])
{
Sample obj=new Sample();//creating object for sample class
obj.display('t');//accessing the method with one argument
obj.display('t',100);//accessing the method with two arguments
}
}

