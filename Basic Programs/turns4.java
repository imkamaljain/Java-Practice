package BasicPrograms;
import java.util.*;
public class turns4 {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int n,m,i=0,sum=0;
		int a[]=new int[50];
		System.out.print("Enter the target score: ");
		n=xyz.nextInt();
		System.out.print("Enter the scores taken by Patrick in each turn: ");
		while(n!=0)
		{
			m=xyz.nextInt();
			sum+=m;
			i++;
			if(sum>=n)
			{
				System.out.print("The number of turns is "+i);
				break;
			}
			m=0;
		}
	}
}