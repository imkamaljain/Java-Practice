package Inheritance;
abstract class figure
{
	int l,b;
	figure(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	abstract int area();
}
class rectangle extends figure
{
	rectangle(int l,int b)
	{
		super(l,b);
	}
	int area()
	{
		return (l*b);
	}
}
class triangle extends figure
{
	triangle(int l,int b)
	{
		super(l,b);
	}
	int area()
	{
		return (l*b/2);
	}
}
public class FigureMain {
	public static void main(String[] args)
	{
		figure f1=new rectangle(5,6);
		System.out.println("Area of rectangle= "+f1.area());
		figure f2=new triangle(8,10);
		System.out.println("Area of triangle= "+f2.area());
	}
}
