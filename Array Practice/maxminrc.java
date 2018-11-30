package arrayPractice;
import java.util.*;
public class maxminrc {
public static void main(String arg[])
{
	Scanner xyz=new Scanner(System.in);
	int a[][]=new int[3][3];
	int i,j,l;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=xyz.nextInt();
		}
	}
	for(i=0;i<3;i++)
	{
		l=a[i][0];
		for(j=0;j<3;j++)
		{
			if(a[i][j]>l)
				l=a[i][j];
		}
		System.out.println("Max element in "+(i+1)+" row: "+l);
	}
	for(i=0;i<3;i++)
	{
		l=a[0][i];
		for(j=0;j<3;j++)
		{
			if(a[j][i]>l)
				l=a[j][i];
		}
		System.out.println("Max element in "+(i+1)+" column: "+l);
	}
	xyz.close();
}
}