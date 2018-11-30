package PassingObjectToMethods;
import java.util.Scanner;
class Complex
{
    int r,i;
    Complex(){}
    Complex(int r,int i)
    {
    	this.r=r;
    	this.i=i;
    }
    Complex add(Complex c1,Complex c2)
    {
    	Complex sum=new Complex();
    	sum.r=c1.r+c2.r;
    	sum.i=c1.i+c2.i;
    	return sum;
    }
}
public class ComplexNoSum{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		Complex c1=new Complex(4,6);
		Complex c2=new Complex(5,3);
		Complex c3=new Complex();
		c3=c3.add(c1, c2);
		System.out.print(c3.r+"+"+c3.i+"i");
		xyz.close();
	}
}