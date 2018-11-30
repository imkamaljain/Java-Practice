package Company;
import java.util.Scanner;
public class Streak {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		String s[]=new String[5];
		int i,a[]=new int[3],j;
		for(i=0;i<5;i++)
		{
			s[i]=xyz.nextLine();
		}
		for(i=0;i<3;i++)
		{
			int count=0;
			for(j=0;j<5;j++)
			{
				if(s[j].charAt(0)=='y')
					count++;
				else
					count=0;
			}
			a[i]=count;
		}
		int max=a[0],emp=1;
		for(i=0;i<3;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				emp=i+1;
			}
		}
		System.out.print("Employee "+emp+" Streak "+max);
		xyz.close();
	}
}
