package Company;
import java.util.Scanner;
public class SumOfSumsOfDigitsInCyclicOrder {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int n;
		n=xyz.nextInt();
		int sum=0,r=0;
        while(n!=0)
        {
            r=r+n%10;
            sum=sum+r;
            n/=10;
        }
        System.out.print(sum);
		xyz.close();
	}
}
