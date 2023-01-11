//inheritance example
import java.util.*; //importing built-in package
class Animal //parent class
{
void eat() //method inside parent class
{
System.out.println("eating");
}
}
class Dog extends Animal //child class inheriting parent class
{
void bark() //child class method
{
System.out.println("barking");
}
}
class TestInheritance //main class
{
public static void main(String args[])
{
Dog d=new Dog();// creating object for child class
d.bark(); //accessing child class method
d.eat(); //accessing parent class method
}
}