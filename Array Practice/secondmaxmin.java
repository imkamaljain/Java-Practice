package arrayPractice;
import java.util.*;
public class secondmaxmin {
	public static void main(String arg[])
		{
			int i,n;
			int a[]=new int[50];
			Scanner xyz=new Scanner(System.in);
			n=xyz.nextInt();
			for(i=0;i<n;i++)
			{
				a[i]=xyz.nextInt();
			}
			int max1,max2;
			max1=max2=Integer.MIN_VALUE;
			for(i=0;i<n;i++)
			{
				if(a[i]>max1)
				{
					max2=max1;
					max1=a[i];
				}
				else if(a[i]>max2 && a[i]!=max1)
				{
					max2=a[i];
				}
			}
			System.out.println("SECOND MAX="+max2);
			xyz.close();
		}
	

}
