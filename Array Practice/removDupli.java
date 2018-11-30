package arrayPractice;
import java.util.*;
public class removDupli {
	public static void main(String arg[])
	{
		int i,j,k,n;
		int a[]=new int[10];
		Scanner xyz=new Scanner(System.in);
		System.out.print("Enter no. of elements ");
		n=xyz.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(i=0;i<n;++i)
	    {
			for(j=i+1;j<n;)
	        {
	            if(a[i]==a[j])
	            {
	                for(k=j;k<n-1;++k)
	                    a[k]=a[k+1];
	                --n;
	            }
	            else
	                ++j;
	        }
	    }
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		xyz.close();
	}
}
