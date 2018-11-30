package classes;
import java.util.*;
public class ForEachExp {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int n=xyz.nextInt(),sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=xyz.nextInt();
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println(sum);
	}
}
