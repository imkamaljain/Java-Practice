package IOstream;
import java.io.*;
public class ReadAFileAndWriteInAnotherFile {
	public static void main(String[] args) throws IOException {
		int i=0;
		FileOutputStream fos=null;
		FileInputStream fis;
		String str ;
		try 
		{
			 fis = new FileInputStream("D://file.txt");
			 fos = new FileOutputStream("D://file1.txt");
			while((i=fis.read())!=-1)
			{
				str=String.valueOf((char)i);
				byte byteArray[] =str.getBytes();
				fos.write(byteArray);
			}	
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		finally
		{
			System.out.print("File Written Succesfully");
			if(fos!=null)
				fos.close();
		}
	}
}
