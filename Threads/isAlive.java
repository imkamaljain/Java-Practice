package Threading;
class thread1 extends Thread
{
	public void run()
	{
		System.out.println("Hello");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("World");
	}
}
public class isAlive {
public static void main(String arg[])
{
	thread1 t1=new thread1();
	thread1 t2=new thread1();
	System.out.println(t1.isAlive());
	t1.start();
	System.out.println(t1.isAlive());
	try
	{
		t1.join();
	}
	catch(Exception e)
	{}
	t2.start();
}
}
