import java.util.*; // importing built-in package
class ForLoop//class declaration
{
public static void main(String args[])
{
System.out.println("Enter the limit:"); //getting limit from user
Scanner s=new Scanner(System.in); //getting input 
int num=s.nextInt();// storing input from user in a variable
for(int i=1;i<=num;i++)//for loop
{
System.out.println(i);// printing numbers
}
}
}
