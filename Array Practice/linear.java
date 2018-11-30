package arrayPractice;
import java.util.Scanner;
public class linear {
	public static void main(String arg[])
	{
		int i,n;
		int a[]=new int[5];
		Scanner xyz=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=xyz.nextInt();
		}
		n=xyz.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==n)
			System.out.print("element "+n+" is found at index "+(i+1));
		}
	}
}