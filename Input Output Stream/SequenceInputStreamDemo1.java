package IOstream;

import java.io.*;
public class SequenceInputStreamDemo1 {
	public static void main(String arg[]) throws IOException
	{
		SequenceInputStream inst=null;
		FileInputStream input1=null;
		FileInputStream input2=null;
		FileOutputStream fout=null;
		try
		{
			input1=new FileInputStream("D://file.txt");
			input2=new FileInputStream("D://file1.txt");
			fout=new FileOutputStream("D://file2.txt");
			inst=new SequenceInputStream(input1,input2);
			int j;
			while((j=inst.read())!=-1)
			{
				System.out.print((char)j);
				fout.write(j);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(inst!=null)
				inst.close();
			if(input1!=null)
				input1.close();
			if(input2!=null)
				input2.close();
		}
	}
}