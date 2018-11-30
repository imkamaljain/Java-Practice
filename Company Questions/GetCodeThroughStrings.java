package Company;
import java.util.Scanner;
public class GetCodeThroughStrings {
	public static void main(String arg[])
	{
		Scanner xyz=new Scanner(System.in);
		String s=xyz.nextLine();
		String str[]=s.split(" ");
		int i,sum=0,n;
		for(i=0;i<str.length;i++)
		{
			sum+=str[i].length();
		}
		if(sum==0)
			n=0;
		else if(sum%9==0)
			n=9;
		else
			n=sum%9;
		System.out.println(n);
		xyz.close();
	}
}
