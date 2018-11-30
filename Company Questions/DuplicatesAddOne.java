package Company;
import java.util.*;
public class DuplicatesAddOne {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int n=xyz.nextInt(),i,j;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					a[j]+=1;
			}
		}
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.print(sum);
		xyz.close();
	}
}
