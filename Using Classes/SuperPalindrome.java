package classes;
import java.util.*;
class reverse
{
	int n,r,sum,a;
	int rev(int n)
	{
	a=n;
	sum=0;
	while(n!=0)                                        
    {
         r=n%10;
         sum=sum*10+r;
         n=n/10;
    }
	if(a==sum)
		return 1;
	else
		return 0;
	}
}
public class SuperPalindrome {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		reverse r=new reverse();
		int n,x,y;
        System.out.print("enter the number: ");
        n=xyz.nextInt();
        x=r.rev(n);
        if(x==1)
            {
        	    y=r.rev(n*n);
        	    if(y==1)
                System.out.println(n+" is a super palindrome & palindrome no." );
        	    else
                {
                    System.out.println(n+" is only a palindrome no." );
                }
            }
            else
            {
                System.out.println(n+" is neither palindrome nor superpalindrome no." );
            }
        xyz.close();
    }
}
