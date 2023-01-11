import java.util.*;//importing built-in package
public class ArrayException//class declaration
 {
public static void main(String[] args)
 {
try//try block
{
int arr[]= {1,3,5,7};//array initialization
System.out.println(arr[10]); //may throw exception
}
// handling the array exception
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
finally//the block of code to be executed whether exception occurs or not
{
System.out.println("rest of the code");
}
}
}