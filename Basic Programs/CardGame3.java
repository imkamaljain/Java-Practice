package BasicPrograms;
import java.util.*;
public class CardGame3 {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int n,i,j=0,r,osum=0,esum=0;
		int a[]=new int[50];
		n=xyz.nextInt();
		while(n!=0)
		{
			r=n%10;
			a[j]=r;
			j++;
			n/=10;
		}
		for(i=0;i<j;i++)
		{
			if(a[i]%2==0)
				esum+=a[i];
			else
				osum+=a[i];
		}
		if(esum==osum)
		System.out.print("Johnny will win the Card Game");
		else
			System.out.print("Johnny will not win the Card Game");
	}
}
