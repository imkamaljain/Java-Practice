package PassingObjectToMethods;
import java.util.Scanner;
class SwapObject
{
	int id1,id2;
	SwapObject(int id1,int id2)
	{
		this.id1=id1;
		this.id2=id2;
	}
	void swapId(SwapObject od)
	{
		int temp=od.id1;
		od.id1=od.id2;
		od.id2=temp;
	}
	void display()
	{
		System.out.println("id1= "+id1+" id2= "+id2);
	}
}
public class SwapByObjectPass {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		SwapObject od =new SwapObject(10,20);
		od.display();
		od.swapId(od);
		od.display();
		xyz.close();
	}
}
