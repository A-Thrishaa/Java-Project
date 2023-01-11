import java.io.*;//importing built-in package
import java.util.*;//importing built-in package
public class FileRead//class declaration
{
public static void main(String args[]) 
{
try //using try block as it may throw error
{
FileInputStream fin = new FileInputStream("input.txt");//creating object for built-in fileinputstream class
int i;//declaring a variable
while((i =fin.read()) !=-1)//reading the file until it reaches end of file
 {
System.out.print((char)i);//printing the contents in file as sequence of characters
}
fin.close();//closing the file
}
//catch block to handle exception if occured
catch(Exception e) {
System.out.println(e);
}
}
}