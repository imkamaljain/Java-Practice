package Company;
import java.util.Scanner;
public class CountHoles {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int n=xyz.nextInt();
		int r,count=0;
		while(n!=0)
		{
			r=n%10;
			if(r==0 || r==6 || r==9)
				count+=1;
			if(r==8)
				count+=2;
			n/=10;
		}
		System.out.print(count);
		xyz.close();
	}
}
