package classes;
class Rect{
	int l,b;
	void getdata(int x,int y)
	{
		l=x;
		b=y;
	}
	int rectarea()
	{
		return (l*b);
	}
}
public class RectMain {
public static void main(String arg[])
{
	Rect r=new Rect();
	r.getdata(10,20);
	System.out.print("Area= "+r.rectarea());
}
}