package arrayPractice;

import java.util.Scanner;

public class minMax {
	public static void main(String arg[])
	{
		int i,j,temp=0;
		int a[]=new int[5];
		Scanner xyz=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i;j<5;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("MAX="+a[0]+" MIN="+a[4]);
		xyz.close();
	}
}
