package classes;
import java.util.*;
class display
{
	int a = 0,b = 1,c = 1,d;
	void series(int n)
	{
    System.out.print("Tribonacci Series: "+a+" "+b+" "+c);
    for(int i=4;i<=n;i++)
    {
    	d=a+b+c;
        a=b;
        b=c;
        c=d;
        System.out.print(" "+d);
    }
    }
}
public class TribonnaciSeries {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. till u want Tribonacci series: ");
        int n=sc.nextInt();
        display d=new display();
        d.series(n);
        sc.close();
    }
}