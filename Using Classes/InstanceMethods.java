package classes;
import java.util.Scanner;
class InstanceDemo
{
	String name;
	int age;
	public void setname(String name)
	{
		this.name=name;
	}
	void setage(int age)
	{
		this.age=age;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
}
public class InstanceMethods {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		InstanceDemo id=new InstanceDemo();
		id.setname("Kamal Jain");
		id.setage(19);
		System.out.println("Name: "+id.getname());
		System.out.println("Age: "+id.getage());
		xyz.close();
	}
}
