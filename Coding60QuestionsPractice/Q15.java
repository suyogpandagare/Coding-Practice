package study;

import java.util.Scanner;

public class Q15 {
	//Java Program to print the  square of the elements of an array present on odd position.

	public static void main(String[] args) {

		Scanner x=new Scanner (System.in);
		int a[]=new int[8];
		int i;
		System.out.println("Enter elemet of Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=x.nextInt();
		}
		System.out.println("square of odd position elements is");
		
		for (int j = 0; j < a.length; j++) {
			if(j % 2 == 1) {
				System.out.println(a[j]*a[j]);
			}
		}
	}

}
