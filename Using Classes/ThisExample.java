package classes;
import java.util.Scanner;
class This
{
	int i,j;
	void getdata(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void print()
	{
		System.out.print("i= "+i+" j= "+j);
	}
}
public class ThisExample {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		This te=new This();
		te.getdata(5,6);
		te.print();
		xyz.close();
	}
}
