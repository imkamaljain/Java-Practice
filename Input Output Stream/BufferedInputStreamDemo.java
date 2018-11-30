package IOstream;
import java.io.*;
public class BufferedInputStreamDemo
{
    public static void main(String arg[]) throws IOException
    {
        FileInputStream inStream=null;
        BufferedInputStream bis=null;
        try
        {
            inStream=new FileInputStream("D://file.txt");
            bis =new BufferedInputStream(inStream);
            while(bis.available()>0)
            {
            	char c=(char)bis.read();
            	System.out.print(c);
            }
        }
        catch(Exception e)
        {
        	System.out.print(e);
        }
        finally
        {
        	if(inStream!=null)
        		inStream.close();
        	if(bis!=null)
        		bis.close();
        }
    }
}