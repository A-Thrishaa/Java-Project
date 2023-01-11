import java.util.*;//importing built-in package
class TwoDimensional//class declaration
{
public static void main(String args[])
{
int arr[][] = { {2,7,9},{3,6,1}}; // declaring and initializing 2D array
for (int i=0; i< 2 ; i++)// printing 2D array
{
for (int j=0; j < 3 ; j++)
System.out.print(arr[i][j] + " ");
System.out.println();
}
}
}