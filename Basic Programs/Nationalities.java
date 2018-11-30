package BasicPrograms;
import java.util.*;
public class Nationalities {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int n=xyz.nextInt(),j,i;
		char a[]=new char[n];
		for(i=0;i<n;i++)
		{
			a[i]=xyz.next().charAt(0);
		}
		int freq[]=new int[26];
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			 freq[a[i]-'A']++;
		}
		for(i = 0; i < n; i++)
		{
			if (freq[a[i]-'A'] != 0)
			{
				System.out.print(a[i]+" "+freq[a[i]-'A']+"\n");
                freq[a[i]-'A']=0;
            }
        }
	}
}