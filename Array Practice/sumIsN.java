package arrayPractice;

import java.util.Scanner;
public class sumIsN {
	public static void main(String a[]) {
		int i,j,n;
		int arr[]=new int[5];
		Scanner xyz=new Scanner(System.in);
		System.out.print("Enter the no ");
		n=xyz.nextInt();
		System.out.print("Enter the Elements of array ");
		for(i=0;i<5;i++) {
			arr[i]=xyz.nextInt();
		}
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) {
				if((arr[i]+arr[j])==n) {
					System.out.println(arr[i]+"+"+arr[j]+"="+n);
				}
			}
		}
		xyz.close();
	}
}