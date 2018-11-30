package IOstream;

import java.io.*;
public class SequenceInputStreamDemo {
	public static void main(String arg[]) throws IOException
	{
		String s1="Hello";
		String s2="World";
		byte []b1=s1.getBytes();
		byte []b2=s2.getBytes();
		ByteArrayInputStream is1=new ByteArrayInputStream(b1);
		ByteArrayInputStream is2=new ByteArrayInputStream(b2);
		SequenceInputStream sis=new SequenceInputStream(is1,is2);
		try
		{
			System.out.println(" "+sis.available());
			for(int i=0;i<10;i++)
			{
				char c=(char)sis.read();
				System.out.print(" "+c);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(sis!=null)
			{
				sis.close();
			}
		}
	}
}