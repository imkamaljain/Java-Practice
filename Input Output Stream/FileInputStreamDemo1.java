package IOstream;
import java.io.*;
public class FileInputStreamDemo1 {
	public static void main(String arg[]) throws IOException
	{
		FileInputStream fis=null;
		int i=0;
		char c;
		byte by[]=new byte[10];
		try
		{
			fis=new FileInputStream("D:\\file.txt");
			System.out.println("No. of bytes "+fis.available());
			i=fis.read(by);
			System.out.println("No. of bytes read "+i);
			System.out.println("Bytes Read");
		    for(byte b:by)
		    {
		        c=(char)b;
		        System.out.println(c);
		    }
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(fis!=null)
			{
				fis.close();
			}
		}
	}
}
