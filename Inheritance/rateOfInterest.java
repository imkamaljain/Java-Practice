package Inheritance;
abstract class Bank{ 
	int p,r,t;
	Bank(int p,int r,int t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
    abstract int rate();    
}    
class SBI extends Bank{ 
	SBI(int p,int r,int t)
	{
		super(p,r,t);
	}
    int rate()
    {
    	return (p*r*t/100);
    }    
}    
class IDBI extends Bank{    
	IDBI(int p,int r,int t)
	{
		super(p,r,t);
	}
    int rate()
    {
    	return (p*r*t/100);
    }   
}
public class rateOfInterest {
	public static void main(String args[]){    
		Bank B1=new SBI(5000,5,2);  
		System.out.println("Interest: "+B1.rate());    
		Bank B2=new IDBI(2000,6,1);  
		System.out.println("Interest: "+B2.rate());    
		}
}