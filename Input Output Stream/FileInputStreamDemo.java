package IOstream;

import java.io.*;

public class FileInputStreamDemo{

	public static void main(String[] args) throws IOException {
		int i=0;
		FileOutputStream fos = null;
		String str = "Data needs to be written into the file";
		try {
			fos = new FileOutputStream("/home/jivtesh/Downloads/1");
			byte byteArray[] =str.getBytes();
			fos.write(byteArray);
			System.out.print("File Written Succesfully");
		}
		catch(Exception e) {
			System.out.print(e);
		}
		finally {
			if(fos!=null)
				fos.close();
		}
	}
}
