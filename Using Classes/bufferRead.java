package classes;
import java.io.*;
public class bufferRead {
	public static void main(String arg[]) throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		char c=(char)br.read();
		br.readLine();
		String str=br.readLine();
		int i=Integer.parseInt(br.readLine());
		float f=Float.parseFloat(br.readLine());
		System.out.println(c+" "+str+" "+i+" "+f);
		br.close();
		is.close();
	}
}