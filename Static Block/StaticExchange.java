package Static;
class Exchange
{
	static int a=3;
	static int b;
	static void cal(int x)
	{
		System.out.println("x= "+x);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	static
	{
		System.out.println("Static Block");
		b=a+5;
	}
}
public class StaticExchange {
	public static void main(String[] args)
	{
		Exchange.cal(5);
		System.out.println("Main");
	}
}
