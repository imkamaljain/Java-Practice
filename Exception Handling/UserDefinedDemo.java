package ExceptionHandling;
import java.util.*;
public class UserDefinedDemo {
	public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Your Age ");
          int age = sc.nextInt();
          try
          {
              if(age < 1)
              {
                  throw new Exception();
              }
              else
              {
            	  System.out.println("Valid Age");
              }
          }
          catch(Exception ex)
          {
              System.out.println(ex+":Inavlid Age");
          }
    }
}