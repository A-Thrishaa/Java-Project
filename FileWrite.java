import java.io.*;//importing built-in package
import java.util.*;importing built-in package
public class FileWrite//class declaration
 {
public static void main(String[] args) 
{
System.out.println("Enter the data to be written:");
Scanner s = new Scanner(System.in);//using scanner to get input from user
String data=s.nextLine();//storing the input in the variable named data
try //using try block as it may throw error
{
FileOutputStream fout = new FileOutputStream("output.txt");//creating object for built-in fileoutputstream class
byte[] array = data.getBytes();//converts a string into an array of bytes.
fout.write(array);// Writes byte to the file
fout.close();//closing a file
}
//catch block to handle the error if occured
catch(Exception e) {
System.out.println(e);
}
}
}