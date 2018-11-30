package arrayPractice;

import java.util.*;
public class sum {
	public static void main(String a[]) {
		int i,sum=0;
		int arr[]=new int[5];
		Scanner xyz=new Scanner(System.in);
		for(i=0;i<5;i++) {
			arr[i]=xyz.nextInt();
			sum=sum+arr[i];
		}
		System.out.print(sum);
		xyz.close();
	}
}