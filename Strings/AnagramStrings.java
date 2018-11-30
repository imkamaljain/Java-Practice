package Strings;
import java.util.Scanner;
class Anagram
{
	int[] frequency = new int[26];
	boolean check(String a, String b)
	{
		a = a.toLowerCase();
        b = b.toLowerCase();
        for (char c : a.toCharArray()) {
            frequency[(int) c - 97]++;
        }
        for (char c : b.toCharArray())
        {
            frequency[(int) c - 97]--;
        }
        boolean anagrams = true;
        for (int i : frequency)
        {
            if (i != 0)
            {
                anagrams = false;
                break;
            }
        }
		return anagrams;
	}
}
public class AnagramStrings {
	public static void main(String[] args)
	{
		Anagram A=new Anagram();
		Scanner xyz=new Scanner(System.in);
		String str1=xyz.nextLine();
		String str2=xyz.nextLine();
		boolean res=A.check(str1,str2);
		if(res)
			System.out.print("Strings are anagram");
		else
			System.out.print("Strings are not anagram");
		xyz.close();
	}
}