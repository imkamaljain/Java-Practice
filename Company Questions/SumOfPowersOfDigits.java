package Company;
import java.util.Scanner;
public class SumOfPowersOfDigits {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int n=xyz.nextInt(),r=0,i=0;
		long sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=(long)(sum+Math.pow(r,i));
			i=r;
			n/=10;
		}
		System.out.print(sum);
		xyz.close();
	}
}
