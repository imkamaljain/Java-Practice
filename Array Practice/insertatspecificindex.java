package arrayPractice;
import java.util.*;
public class insertatspecificindex {
	public static void main(String arg[])
	{
		int i,n,j=0,k=0;
		int a[]=new int[50];
		Scanner xyz=new Scanner(System.in);
		n=xyz.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		j=xyz.nextInt();
		k=xyz.nextInt();
		for(i=n-1;i>k-2;i--)
		{
			a[i+1]=a[i];
		}
		a[k-1]=j;
		for(i=0;i<n+1;i++)
		{
			System.out.print(a[i]+" ");
		}
		xyz.close();
	}
}
