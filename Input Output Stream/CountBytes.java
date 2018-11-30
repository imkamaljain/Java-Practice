package IOstream;
import java.io.*;
public class CountBytes {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		int i=0;
		char c;
		byte by[]=new byte[10];
		try
		{
			fis=new FileInputStream("/home/jivtesh/Downloads/1");
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
