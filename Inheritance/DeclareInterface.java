package Inheritance;
interface print
{
	void display();
}
class Demo implements print
{ 
	public void display()  /*methods in interfce should be publ in other clas*/
	{
		System.out .println("interface Print implemented");
	}
}
public class DeclareInterface {
public static void main(String args[])
{
	print p=new Demo();
	p.display();	
}	
}