package IOstream;
import java.io.*;
public class ByteArrayOutputStreamDemoInCapitalWords {
	public static void main(String arg[]) throws IOException
	{
		ByteArrayOutputStream f=new ByteArrayOutputStream();
		String s="Content of Byte Array Output Stream";
		char c;
		//s=s.toUpperCase();
		int j=0;
		byte buffer[]=s.getBytes();
		f.write(buffer);
		System.out.println("Buffer size "+f.size());
		System.out.println("Buffer as String");
		System.out.println(f.toString());
		System.out.println("Into Array");
		byte b[]=f.toByteArray();
		
		for(int i=0;i<b.length;i++)
		{
//			c=;
//			if((char)b[i]>=65 && (char)b[i]<=90  )
//			    System.out.print(c);
//			else
				System.out.print(Character.toUpperCase((char)b[i]));
		}
		System.out.println("InToAnOutputStream()");
		FileOutputStream f2=new FileOutputStream("text.txt");
		f.writeTo(f2);
		f2.close();
	}
}