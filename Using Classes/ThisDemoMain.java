package classes;
import java.util.Scanner;
class ThisDemo
{
	int x;
	ThisDemo()
	{
		this(100);
		this.display();
	}
	ThisDemo(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("x= "+x);
	}
}
public class ThisDemoMain {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		ThisDemo th=new ThisDemo();
		xyz.close();
	}
}
