package Inheritance;
class demo1
{
	int a,b,f=84;
	String c;
	demo1(int a,int b,String c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String toString()
	{
		return a+" "+b+" "+c;
	}
}
public class ToStringDemo {
public static void main(String args[])
{
	demo1 d=new demo1(1,2,"KAMAL");
	System.out.println(d);
}
}
