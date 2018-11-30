package BasicPrograms;
import java.util.*;
class check
{
	int m=0,p=0,r=0,sum,i=0;
	void pal(int n)
	{
		sum=0;
		m=n;
		while(m!=0)
		{
			r=m%10;
			sum=sum*10+r;
			m/=10;
		}
		if(n==sum)
			System.out.print("No. of steps to make palindrome: "+i);
		else
		{
			n=n+sum;
			i++;
			pal(n);
		}
	}
}
public class MakePalindrome {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int x,y;
		check c=new check();
		System.out.print("enter a no.: ");
		x=xyz.nextInt();
		c.pal(x);
	}
}