package IOstream;
import java.io.*;
public class FileWriterDemo {
	public static void main(String arg[]) throws IOException
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("/home/jivtesh/Downloads/1");
			String data="This is an exaple of file writer";
			fw.write(data,5,10);
			char []chardata=data.toCharArray();
			fw.write(chardata);
			fw.append("End of code");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(fw!=null)
					fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
