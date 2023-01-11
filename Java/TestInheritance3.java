//hierarchial inheritance example
import java.util.*; //importing built-in package
class Animal//base class
{
void eat()// base class method
{System.out.println("eating");}
}
class Dog extends Animal//derived class 1 extending base class
{
void bark()//derived class 1 method
{System.out.println("barking");}
}
class Cat extends Animal//derived class 2 extending base class
{
void weep()//derived class 2 method
{System.out.println("weeping");}
}
class TestInheritance3//main class
{
public static void main(String args[])
{
Cat c=new Cat();//creating object for derived class 2
c.weep();//accessing derived class 2 method
c.eat();//accessing base class method from derived class 2 object
Dog d= new Dog();//creating object for derived class 1
d.bark();//accessing derived class 1 method
d.eat();//accessing base class method from derived class 1 object
}
}