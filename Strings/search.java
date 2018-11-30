package Strings;
import java.util.*;
public class search {
public static void main(String args[])
{
	Scanner xyz=new Scanner(System.in);
	int i;
	String str[]=new String[5];
	System.out.print("Enter 5 strings: ");
	for(i=0;i<5;i++)
	{
		str[i]=xyz.nextLine();
	}
	String str1;
	System.out.print("Enter string to find: ");
	str1=xyz.nextLine();
	for(i=0;i<5;i++) {
		if(str1.equals(str[i])) {
			System.out.print(i);
			break;
		}	
	}
	xyz.close();
}
}