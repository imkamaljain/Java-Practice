package classes;
class Rectangle{
	int l,b;
	Rectangle(){l=0;b=0;}
	Rectangle(int x,int y)
	{
		l=x;
		b=y;
	}
	int rectarea()
	{
		return (l*b);
	}
}
 class Square{
	int l;
	Square(){l=0;}
	Square(int x)
	{
		l=x;
	}
	int sqarea()
	{
		return (l*l);
	}
}
 class Triangle{
	int b,h;
	Triangle(){h=0;b=0;}
	Triangle(int x,int y)
	{
		b=x;
		h=y;
	}
	float triarea()
	{
		return (float)(0.5*b*h);
	}
}
public class RectTriSq {
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(10,20);
		System.out.println("Area= "+r.rectarea());
		Square s=new Square(15);
		System.out.println("Area= "+s.sqarea());
		Triangle t=new Triangle(15,20);
		System.out.println("Area= "+t.triarea());
	}
}
