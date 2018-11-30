package arrayPractice;
import java.util.*;
public class primeSum {
	public static void main(String arg[])
	{
		int i,n,j,sum=0;
		int a[]=new int[50];
		Scanner xyz=new Scanner(System.in);
		n=xyz.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(i=0;i<n;i++)
		{
            for(j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    break;
                }
            }
            if(a[i]==j)
            {
                sum=sum+a[i];
            }
		}
		System.out.println("Sum of prime nos. = "+sum);
		xyz.close();
	}
}