class Singleton //declaring class
{
                  static Singleton obj = null;//static instance of singleton class
	public String s;//declaring string variable
	private Singleton()//constructor of singleton class
	{
		s = "This is a string part of Singleton class";
	}
	public static Singleton Singleton()//method to create instance of singletonclass
	{
		if (obj == null) //to ensure only one object is created
                                   {
			obj = new Singleton();//creating object
		}
		return obj;//returning the object part
	}
}
class SingletonExample//main class
{
	public static void main(String args[])
	{
		Singleton x = Singleton.Singleton();//creating object with variable x
		Singleton y = Singleton.Singleton();//creating object with variable y
		System.out.println("String from x is " + x.s);//printing object part
		System.out.println("String from y is " + y.s);//printing object part
	}
}
