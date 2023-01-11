//abstraction example using abstract class
package abstract;
import java.util.*;//importing built-in package
abstract class Animal//declaring abstract class
{
abstract void ispet();//declaring abstract method
void type()//non-abstract method and its definition
{
System.out.println("Domestic");
}
}
class Cat extends Animal//derived class that inherits abstract class
{
void ispet()//defining the abstract class method
{
System.out.println("Yes it is pet");
}
}
class AbstractionExample//main class
{
public static void main(String args[])
{
Cat c = new Cat();//creating object for derived class
c.ispet();//accessing abstract method
c.type();//accessing non-abstract method
}
}
