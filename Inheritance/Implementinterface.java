package Inheritance;
interface area1
{
	int Sarea();
	double Carea();
	
}
class SquareArea implements area1
{
	int r;
	SquareArea(int r)
	{
		this.r=r;
		
	}
	public int Sarea()
	{
		return 0;

	}
	public double Carea()
	{
		return 0;
	}
}
class circleArea implements area1
{
	int r;
	circleArea(int r)
	{
		this.r=r;
	}
public int Sarea()
{
	return 0;
}
public double Carea()
{
	return(3.14*r*r);
}

}
	
public class Implementinterface {

public static void main(String args[])
{
	
	area1 obj=new SquareArea(5);
	area1 jcj=new circleArea(10);
	System.out.println("Cirlce area= "+jcj.Carea());
	System.out.println("Square area= "+obj.Carea());
}
}