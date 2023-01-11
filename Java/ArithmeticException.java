import java.io.*;//importing built-in package
import java.util.*;//importing built-in package
class ArithmeticException//class declaration
{
public static void main(String[] args) 
{
try//try block
{
int data=50/0; //may throw exception
}
//handling the exception
catch(Exception e) 
{
System.out.println(e); 
}
finally//the block of code to be executed whether exception occurs or not
{
System.out.println("rest of the code");
}
}
}