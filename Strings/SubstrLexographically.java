package Strings;
import java.util.Scanner;
public class SubstrLexographically {
	public static void main(String[] args)
	{
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=xyz.nextLine();
        System.out.print("Enter length: ");
        int n=xyz.nextInt(),i,j=0,k;
        String arr[]=new String[str.length()-n+1],temp;
        for(i=0;i<=str.length()-n;i++)
        {
        	arr[j]=str.substring(i,i+n);
        	j++;
        }
        for(i=0;i<j;i++)
        {
        	for(k=i+1;k<j;k++)
        	{
        		if(arr[i].compareTo(arr[k])>0)
        		{
        			temp=arr[i];
        			arr[i]=arr[k];
        			arr[k]=temp;
        		}
        	}
        }
        for(i=0;i<j;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        xyz.close();
	}
}