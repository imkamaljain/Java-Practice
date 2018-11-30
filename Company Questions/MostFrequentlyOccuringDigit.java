package Company;
import java.util.Arrays;
import java.util.Scanner;
public class MostFrequentlyOccuringDigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[10],r=0;
		for(i=0;i<10;i++)
		{
			b[i]=0;
		}
		for(i=0;i<n;i++)
		{
			while(a[i]!=0)
			{
				r=a[i]%10;
				b[r]=b[r]+1;
		        a[i]/=10;
			}
		}
		int max=b[0];
		int digit=0;
		for(i=1;i<10;i++)
		{
			if(b[i]>=max)
			{
				max=b[i];
				digit=i;
			}
		}
		System.out.print(digit);
		sc.close();
	}
}
