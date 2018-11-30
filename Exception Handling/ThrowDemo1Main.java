package ExceptionHandling;
class ThrowDemo1
{
	private String name;
	void getname(String name)
	{
		try
		{
			this.name=name;
			char ch=name.charAt(10);
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
			throw se;
		}
	}
}
public class ThrowDemo1Main {
public static void main(String args[])
{
	ThrowDemo1 td=new ThrowDemo1();
	try
	{
		td.getname("ABCD");
	}
	catch(StringIndexOutOfBoundsException se)
	{
		System.out.println(se);
	}
}
}