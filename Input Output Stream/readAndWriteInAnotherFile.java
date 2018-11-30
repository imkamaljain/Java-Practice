package IOstream;
import java.io.*;
public class readAndWriteInAnotherFile{

	public static void main(String[] args) throws IOException {
		int i=0;
		FileOutputStream fos=null;
		FileInputStream fis;
		String str ;
		try {
			 fis = new FileInputStream("/home/jivtesh/Downloads/1");
			 fos = new FileOutputStream("/home/jivtesh/Downloads/2");
			while((i=fis.read())!=-1) {
				str=String.valueOf((char)i);
				byte byteArray[] =str.getBytes();
				fos.write(byteArray);
			}
			
			
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		finally {
			System.out.print("File Written Succesfully");
			if(fos!=null)
				fos.close();
		}
	}
}

