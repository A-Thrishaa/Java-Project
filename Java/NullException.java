import java.util.*; //importing built-in package
public class NullException//class declaration
{
public static void main(String[] args) 
{
try//try block
{
String s=null;
System.out.println(s.length());
}
//handling exception
catch(NullPointerException e)
{
System.out.println(e);
}
}
}