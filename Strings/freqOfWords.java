package Strings;
import java.util.Scanner;
public class freqOfWords {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		String str=xyz.nextLine();
		int i,c=0,k=0;
		String arr[]=new String[50];
        for(i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                 arr[k++]=str.substring(c,i);
                c=i+1;
            }
        }
        for(i=0;i<k;i++)
        {
        	System.out.print(arr[i]);
        }
		xyz.close();
	}
}