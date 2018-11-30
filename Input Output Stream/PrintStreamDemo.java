package IOstream;
import java.io.*;
import java.util.Date;
public class PrintStreamDemo {
	public static void main(String arg[]) throws IOException
	{
		FileOutputStream fos=null;
		PrintStream ps=null;
		try
		{
			fos=new FileOutputStream("D://file.txt");
			ps=new PrintStream(fos);
			ps.print('A');
			ps.println(100L);
			ps.println(45.451);
			ps.println(new Date());
			ps.println();
			ps.println("This is an example of print stream class");
			ps.append('a');
			ps.append("Append method of print stream");
			String str="Example print Stream Class";
			byte b[]=str.getBytes();
			ps.write(b);
			ps.printf("This is a %s application",str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fos!=null)
					fos.close();
				if(ps!=null)
					ps.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}