// multilevel inheritance
import java.util.*; //importing built-in package;
class Animal// base class
{
void eat() // method in base class
{System.out.println("eating");}
}
class Dog extends Animal //derived class 1 
{
void bark() //derived class method
{System.out.println("barking");}
}
class BabyDog extends Dog//derived class 2 from derived class 1
{
void weep() // method of derived class 2
{System.out.println("weeping");}
}
class TestInheritance2 //main class
{
public static void main(String args[])
{
BabyDog d=new BabyDog(); //creating object for derived class 2
d.weep();// accessing derived class 2 method
d.bark();// accessing derived class 1 method
d.eat();// accessing base class method
}
}