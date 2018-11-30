package BasicPrograms;
import java.util.*;
public class NationalitiesNew {
	public static void main(String[] args)
	{
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter no. of characters: ");
        int n=xyz.nextInt(),j,k;
        System.out.print("Enter characters: ");
		char a[]=new char[n],i;
		for(i=0;i<n;i++)
		{
			a[i]=xyz.next().charAt(0);
		}
        for(i=65;i<=122;i++)
        {
            k=0;
            for(j=0;j<n;j++)
            {
                if(i==a[j])
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println(i+" "+k);
            }
        }
		xyz.close();
	}
}
