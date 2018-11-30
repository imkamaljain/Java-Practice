package classes;
import java.util.*;
public class addOneToEachDigit {
public static void main(String args[])
{
	Scanner xyz=new Scanner(System.in);
	int n,i,m,r=1,sum=0,count=0;
	n=xyz.nextInt();
	m=n;	
	while(m!=0)
	{
		m/=10;
		count++;
	}
	for(i=0;i<count;i++)
	{
		sum=n+r;
		n=sum;
		r*=10;
	}
	System.out.print(sum);
}
}