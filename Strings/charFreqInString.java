package Strings;
import java.util.Scanner;
public class charFreqInString {
	public static void main(String[] args)
	{
		int i,k;
        char c, ch;
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=xyz.nextLine();
        for(c='A';c<='z';c++)
        {
            k=0;
            for(i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println(c+" "+k);
            }
        }
		xyz.close();
	}
}