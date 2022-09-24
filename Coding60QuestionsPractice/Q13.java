package study;

import java.util.Scanner;

//Wap enter an array and print the element which is on odd position.


public class Q13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[]=new int[9];
		int i,c=0;
		System.out.println("Enter element of Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}


		for (int j = 0; j < a.length; j++) {
			//odd position elements
			if(j % 2 == 1) {
				System.out.println(a[j]);
			}
			//for even
			//			if(j % 2 == 0) {
			//				System.out.println(a[j]);
			//			}
		}


	}

}
