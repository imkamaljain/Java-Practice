package Threading;
class One extends Thread{
	One()
	{
		super("ONE");
		System.out.println("One Thread : "+this );
		start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("One Thread : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("One Interrupted");
		}
		System.out.println("One Exiting ");
	}
}

class Two extends Thread{
	Two()
	{
		super("TWO");
		System.out.println("Two Thread : "+this );
		start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("Two Thread : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Two Interrupted");
		}
		System.out.println("Two Exiting ");
	}
}
public class threading {
	public static void main(String args[]) {
		One o=new One();
		Two t=new Two();
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
		    System.out.println("mAIN tHREAD Interupted");
		}
		System.out.println("Main Thread Exiting");
		
	}

}