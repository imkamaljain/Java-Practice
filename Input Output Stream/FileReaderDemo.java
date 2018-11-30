package IOstream;
import java.io.*;
public class FileReaderDemo {
	    public static void main(String args[])throws Exception{    
	          FileReader fr=new FileReader("/home/jivtesh/Downloads/1");    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
	    }   
}
