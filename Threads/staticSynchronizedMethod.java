package Threading;
class Table1
{
    synchronized static	void printTable(int n)
	{
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
	}
}
class MyThread01 extends Thread
{
	Table1 t;
	MyThread01(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
		System.out.println("Thread1 exiting");
	}
}
class MyThread02 extends Thread
{
	Table1 t;
	MyThread02 (Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
		System.out.println("Thread2 exiting");
	}
}
public class staticSynchronizedMethod 
{
public static void main(String arg[])
{
	Table1 obj=new Table1();
	MyThread01 t1=new MyThread01(obj);
	MyThread02 t2=new MyThread02(obj);
	t1.start();
	t2.start();
}
}
