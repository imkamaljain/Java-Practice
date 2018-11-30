package Company;
import java.util.Scanner;
public class FindStringCode {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		String s=xyz.nextLine();
		s=s.toUpperCase();
		String str[]=s.split(" ");
		String nn="";
		int i,k,sum;
		for(i=0;i<str.length;i++)
		{
			sum=0;
			int l=str[i].length();
			for(k=0;k<l;k++)
			{
				sum=sum+str[i].charAt(k)-str[i].charAt(l-1);
				if(k==l-1)
					sum=sum+str[i].charAt(k)-64;
				
				l--;
			}
			nn=nn+String.valueOf(sum);
		}
		System.out.println(nn);
//		int res=0;
//		for(i=0;i<nn.length();i++)
//		{
//			res=res*10+nn.charAt(i)-'0';
//		}
		xyz.close();
	}
}
