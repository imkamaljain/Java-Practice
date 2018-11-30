package Strings;
import java.util.*;
public class LapindromeString {
public static void main(String arg[])
{
	Scanner xyz=new Scanner(System.in);
	int t=xyz.nextInt(),i;
	String str,a="",b="";
	while(t!=0)
	 {
		 str=xyz.nextLine();
	     int n=str.length();
	     if(n%2==0)
	     {
	         for(i=0;i<n/2;i++)
	             a+=str.charAt(i);
	         for(i=n/2;i<n;i++)
	             b+=str.charAt(i);
	         char arr1[]=a.toCharArray();
	         char arr2[]=a.toCharArray();
	         Arrays.sort(arr1);
	         Arrays.sort(arr2);
	         if(arr1.equals(arr2))
	             System.out.print("YES");
	         else
	        	 System.out.print("NO");
	     }
	     else
	     {
	    	 for(i=0;i<n/2;i++)
	             a+=str.charAt(i);
	         for(i=(n/2+1);i<n;i++)
	             b+=str.charAt(i);
	         char arr1[]=a.toCharArray();
	         char arr2[]=a.toCharArray();
	         Arrays.sort(arr1);
	         Arrays.sort(arr2);
	         if(arr1.equals(arr2))
	             System.out.print("YES");
	         else
	        	 System.out.print("NO");
	     }
	     t--;
	 }
	 xyz.close();
}
}
