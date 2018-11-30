package arrayPractice;
import java.util.*;
public class sumofRC {
public static void main(String arg[])
{
	Scanner xyz=new Scanner(System.in);
	int a[][]=new int[3][3];
	int i,j,sum;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=xyz.nextInt();
		}
	}
	for(i=0;i<3;i++)
	{
		sum=0;
		for(j=0;j<3;j++)
		{
			sum+=a[i][j];
		}
		System.out.println("sum of element of "+(i+1)+" row: "+sum);
	}
	for(i=0;i<3;i++)
	{
		sum=0;
		for(j=0;j<3;j++)
		{
			sum+=a[j][i];
		}
		System.out.println("sum of element of "+(i+1)+" column: "+sum);
	}
	xyz.close();
}
}