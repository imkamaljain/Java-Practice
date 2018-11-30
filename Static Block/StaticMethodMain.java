package Static;
class StaticMethod
{
	static void display(int x)
	{
		System.out.println("x= "+(x*x*x));
	}
}
public class StaticMethodMain {
	public static void main(String[] args)
	{
		StaticMethod.display(5);
	}
}