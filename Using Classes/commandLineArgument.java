package classes;

public class commandLineArgument {
	public static void main(String args[])
	{
		int n=args.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(args[i]);
		}
		for(String i:args)
		{
			System.out.print(i);
		}
	}
}