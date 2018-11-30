package ExceptionHandling;

public class TryDemo1 {
	public static void main(String args[])
	{
		try
		{
			int arr[]= {10,20,30};
			arr[5]=60;
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
