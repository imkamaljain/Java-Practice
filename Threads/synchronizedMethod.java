package Threading;
class Table
{
	synchronized void printTable(int n)
	{
		//synchronized(this)
		//{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		//}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1 (Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
		System.out.println("Thread1 exiting");
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2 (Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
		System.out.println("Thread2 exiting");
	}
}
public class synchronizedMethod 
{
public static void main(String arg[])
{
	Table obj=new Table();
	MyThread1 t1=new MyThread1(obj);
	MyThread2 t2=new MyThread2(obj);
	t1.start();
	t2.start();
}
}
