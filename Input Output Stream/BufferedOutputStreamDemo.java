package IOstream;
import java.io.*;
public class BufferedOutputStreamDemo {
	 public static void main(String arg[]) throws IOException
	 {
		 FileOutputStream outStream=null;
	        BufferedOutputStream bos=null;
	        try
	        {
	        	outStream=new FileOutputStream("D://file1.txt");
	            bos =new BufferedOutputStream(outStream);
	            String s="Content of Buffered Output Stream class";
	            byte buffer[]=s.getBytes();
	            bos.write(buffer);
	            bos.flush();
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        finally
	        {
	        	if(outStream!=null)
	        		outStream.close();
	        	if(bos!=null)
	        		bos.close();
	        }
	 }
}