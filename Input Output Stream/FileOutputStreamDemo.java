package IOstream;

import java.io.FileInputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		int i=0;
		try {
			FileInputStream fis = new FileInputStream("/home/jivtesh/Downloads/1");
			while((i=fis.read())!=-1) {
			    System.out.print((char)i);
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
