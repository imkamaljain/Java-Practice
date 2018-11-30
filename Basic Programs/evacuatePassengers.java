package BasicPrograms;
import java.util.*;
public class evacuatePassengers {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int n,i,count=0;
		n=xyz.nextInt();
		int a[]=new int[n];
		char b[]=new char[n];
		for(i=0;i<n;i++)
			a[i]=xyz.nextInt();
		for(i=0;i<n;i++)
			b[i]=xyz.next().charAt(0);
		for(i=0;i<n;i++)
		{
			if(a[i]<1 || (b[i]>='a' && b[i]<='z'))
			{
				System.out.print("INVALID INPUT");
				System.exit(0);
			}
			else if(a[i]<60 && b[i]=='M')
						count++;
		}
		System.out.print(n-count);
	}
}