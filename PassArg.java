import java.util.Scanner;

public class PassArg
{

	public static void main(String[] args)  //void method 
	{
      int x = 10;
          findMax( 330 , 66 );
	}
   public static void displaySum(int n1, int n2)
   {
      int result = n1 + n2;
      System.out.println("\t The summation is : " + result);
   }
   
   public static void findMax(int n1, int n2)
   {
      if(n1 > n2)
         System.out.println(n1 + " n1 is larger");
         else 
         System.out.println(n2 + " n2 is larger");
         
         displaySum(15, 16);
         System.out.println();
   }
}