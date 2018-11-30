package ExceptionHandling;

public class TryDemo {
public static void main(String args[])
{
	try
	{
		int n=args.length;
		System.out.println("Value= "+25/n);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
