import java.util.Scanner;

public class ClassAverage
{ 
   public static void main(String[] args)
    {
        Scanner newObject = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = newObject.nextDouble();
        System.out.print("Input the second number: ");
        double y = newObject.nextDouble();
        System.out.print("Input the third number: ");
        double z = newObject.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
        System.out.print("Good job!");
       
    }
 
  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }

}
