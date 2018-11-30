package Threading;
class RunnableDemo implements Runnable
{
	public Thread t;
	private String threadName;
	boolean suspended=false;
	RunnableDemo(String name)
	{
		threadName=name;
		t=new Thread(this,threadName);
		System.out.println("Creating: "+threadName);
		t.start();
	}
	public void run()
	{
		System.out.println("Running: "+threadName);
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Thread: "+threadName+","+i);
				Thread.sleep(500);
				synchronized(this)
				{
					while(suspended)
					{
						System.out.println("Thread Suspended: "+threadName);
						wait();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread: "+threadName+" interrupted");
		}
		System.out.println("Thread: "+threadName+" exiting");
	}
	synchronized void suspend()
	{
		suspended=true;
	}
	synchronized void resume()
	{
		suspended=false;
		notify();
	}
}
public class SuspendResumeStop{
	public static void main(String arg[])
	{
		RunnableDemo r1=new RunnableDemo("Thread-1");
		RunnableDemo r2=new RunnableDemo("Thread-2");
		try
		{
			Thread.sleep(1000);
			r1.resume();
			System.out.println("Resuming first thread");
			r2.suspend();
			System.out.println("Suspending second thread");
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
