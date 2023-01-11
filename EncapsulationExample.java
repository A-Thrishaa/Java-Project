//encapsulation example
import java.util.*; //importing built-in package
class EncapsulationExample//main class
{  
public static void main(String[] args)
{  
Students s=new Students();  //creating object for encapsulated class
s.setNumber(31);  //setting number
System.out.println(s.getNumber());  //printing number
}  
}