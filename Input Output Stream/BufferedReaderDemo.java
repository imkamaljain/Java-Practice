package IOstream;
import java.io.*;
public class BufferedReaderDemo {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("/home/jivtesh/Downloads/1");    
        BufferedReader br=new BufferedReader(fr);    

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close();    
  }    
}
