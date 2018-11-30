package Company;
import java.util.Scanner;
public class PIN {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		int i,j,a[]=new int[3];
		for(i=0;i<3;i++)
		{
			a[i]=xyz.nextInt();
		}
		int n=1,pin=0,r,least=0,max=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(j==0)
				{
					r=a[j]%10;
					least=r;
				}
				r=a[j]%10;
				if(r<least)
					least=r;
				if(r>max)
					max=r;
				a[j]/=10;
			}
			pin=pin+least*n;
			n=n*10;
		}
		pin=pin+max*n;
		System.out.print(pin);
		xyz.close();
	}
}
