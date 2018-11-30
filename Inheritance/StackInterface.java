package Inheritance;
import java.util.*;
interface int1
{
	void push(int item,int size);
	void pop();
}
class stack implements int1
{
	int a[]=new int[50],n,top;
	stack()
	{
		Scanner xyz=new Scanner(System.in);
		top=-1;
	}
	public void push(int n,int size)
	{
		if(top==size-1)
			System.out.print("overflow ");
		else
		{
			top++;
			System.out.println(top+" "+size);
			
			a[top]=n;		
		}
	}
	public void pop()
	{
		int temp;
		if(top==-1)
			System.out.print("Underflow ");
		else
		{
			temp=a[top];
			System.out.print(temp);
			top--;
		}
	}
}
public class StackInterface {
	public static void main(String args[])
	{
		int1 i=new stack();
		Scanner xyz=new Scanner(System.in);
		int size,j,n;
		System.out.print("Enter size: ");
		size=xyz.nextInt();
		for(j=0;j<size;j++)
		{
			n=xyz.nextInt();
			i.push(n,size);
		}
		for(j=0;j<size;j++)
		{
			i.pop();
		}
	}
}
