package Static;

import java.util.Scanner;

class StaticVariable
{
	static int count=0;
	StaticVariable()
	{
		count++;
		System.out.println(count);
	}
}
public class StaticVariableMain {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		StaticVariable sv1=new StaticVariable();
		StaticVariable sv2=new StaticVariable();
		StaticVariable sv3=new StaticVariable();
		xyz.close();
}
}