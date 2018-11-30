package BasicPrograms;
import java.util.*;
public class Lift1 {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int n,n1,n2,n3,x1,x2,x3;
		n=xyz.nextInt();
		n1=xyz.nextInt();
		n2=xyz.nextInt();
		n3=xyz.nextInt();
		x1=Math.abs(n-n1);
		x2=Math.abs(n-n2);
		x3=Math.abs(n-n3);
		if(x1<x2 && x1<x3)
			System.out.print(n1);
		else if(x2<x1 && x2<x3)
			System.out.print(n2);
		else if(x3<x1 && x3<x2)
			System.out.print(n3);
		if(x1==x2)
		{
			if(n1>n2)
			System.out.print(n1);
		    else
			System.out.print(n2);
		}
		if(x2==x3)
		{
			if(n2>n3)
			System.out.print(n2);
		    else
			System.out.print(n3);
		}
		if(x1==x3)
		{
			if(n1>n3)
			System.out.print(n1);
		    else
			System.out.print(n3);
		}
		xyz.close();
	}
}
