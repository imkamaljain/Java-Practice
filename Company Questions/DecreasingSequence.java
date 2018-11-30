package Company;
import java.util.Scanner;
public class DecreasingSequence {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int n,i,j,flag,count,seq=0,count1=0,p=0;
		n=xyz.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(i=0;i<n;i++)
		{
			flag=0;
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					count++;
					i++;
					flag=1;
				}
				else
					break;
			}
			if(flag==1)
			{
				seq++;
				if(count1<count)
				{
					count1=count;
					p=i;
				}
			}
		}
		System.out.println(seq+" "+count1);
		for(i=p-count1+1;i<=p;i++)
		{
			System.out.print(a[i]+" ");
		}
		xyz.close();
	}
}
