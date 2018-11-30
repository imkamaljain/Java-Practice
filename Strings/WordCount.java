package Strings;
import java.util.Scanner;
public class WordCount {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int i,count=1;
		String str=xyz.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
 		System.out.println("Number of words = "+count);
 		xyz.close();
	}
}