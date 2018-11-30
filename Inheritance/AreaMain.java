package Inheritance;
class Dimension
{
	int i,j;
	Dimension(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.print("length= "+i+"\nbreadth= "+j);
	}
}
class Area extends Dimension
{
	int ar;
	Area(int i,int j)
	{
		super(i,j);
	}
	void calcarea()
	{
		ar=i*j;
	}
	void display()
	{
		super.display();
		System.out.print("\narea= "+ar);
	}
}
public class AreaMain {
	public static void main(String[] args)
	{
		Area a=new Area(10,20);
		a.calcarea();
		a.display();
	}
}
