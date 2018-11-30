package IOstream;
import java.io.*;
public class ByteArrayInputStreamDemo {
	public static void main(String arg[]) throws IOException
	{
		int i;
		String str="abcdefghijklmnopqrstuvwxyz";
		byte buffer[]=str.getBytes();
		ByteArrayInputStream bais=null;
		try
		{
			bais=new ByteArrayInputStream(buffer);
			while((i=bais.read())!=-1)
				System.out.print((char)i+" ");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		finally
		{
			if(bais!=null)
				bais.close();
		}
	}
}