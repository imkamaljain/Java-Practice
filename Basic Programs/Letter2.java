package BasicPrograms;
import java.util.*;
public class Letter2 {
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		String str1,str2,str3;
		String n;
		str1=xyz.nextLine();
		str2=xyz.nextLine();
		str3=xyz.nextLine();
		n=xyz.nextLine();
		if((str1.startsWith(n)) || (str2.startsWith(n)) || (str3.startsWith(n)))
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}