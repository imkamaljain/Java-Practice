package PassingObjectToMethods;
import java.util.Scanner;
class Time
{
	int h,m,s;
	Time(){}
	Time(int h,int m,int s)
	{
		this.h=h;
		this.m=m;
		this.s=s;
	}
	Time add(Time t1,Time t2)
	{
		Time sum=new Time();
		sum.h=t1.h+t2.h;
		sum.m=t1.m+t2.m;
		sum.s=t1.s+t2.s;
		if(sum.m>=60)
		{
			sum.h++;
			sum.m-=60;
		}
		if(sum.s>=60)
		{
			sum.m++;
			sum.s-=60;
		}
		return sum;
	}
	Time sub(Time t1,Time t2)
	{
		Time diff=new Time();
		diff.h=t1.h-t2.h;
		diff.m=t1.m-t2.m;
		diff.s=t1.s-t2.s;
		if(diff.s<0)
		{
			diff.s+=60;
			diff.m--;
		}
		if(diff.m<0)
		{
			diff.m+=60;
			diff.h--;
		}
		return diff;
	}
}
public class TimeAddSub {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter time in (hrs,min,sec)");
		System.out.print("Enter time1: ");
		int h,m,s;
		h=xyz.nextInt();
		m=xyz.nextInt();
		s=xyz.nextInt();
		Time t1=new Time(h,m,s);
		System.out.print("Enter time2: ");
		h=xyz.nextInt();
		m=xyz.nextInt();
		s=xyz.nextInt();
		Time t2=new Time(h,m,s);
		Time t3=new Time();
		t3=t3.add(t1,t2);
		Time t4=new Time();
		t4=t4.sub(t1,t2);
		System.out.println("Sum= "+t3.h+":"+t3.m+":"+t3.s);
		System.out.println("Diff= "+t4.h+":"+t4.m+":"+t4.s);
		xyz.close();
	}
}
