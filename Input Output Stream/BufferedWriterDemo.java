package IOstream;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("/home/jivtesh/Downloads/1");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Hello World !!!");  
	    buffer.close();  
	    System.out.println("Success");  
	    }  
}
