package Strings;
import java.util.*;
public class NextPalindrome {
public static void main(String arg[])
{
	Scanner xyz=new Scanner(System.in);
	int t=xyz.nextInt();
	int n=xyz.nextInt();
	int rem,rev=0,m;
	while(t!=0)
	{
		 while(n!=rev)
		 {
			 n++;
			 m=n;
			 rev=0;
			 while(m!=0)
			 {
				 rem=m%10;
			     rev=rev*10+rem;
			     m=m/10;
			 }
		  }
		 System.out.print(rev);
		t--;
		n=xyz.nextInt();
	}
	xyz.close();
}
}
