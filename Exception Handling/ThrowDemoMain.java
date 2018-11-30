package ExceptionHandling;
class ThrowDemo
{
	static void get()
	{
		try
		{
			System.out.println("Get Value");
			throw new NullPointerException("Exception Caught");
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}
	}
}
public class ThrowDemoMain {
public static void main(String args[])
{
	ThrowDemo.get();
}
}
