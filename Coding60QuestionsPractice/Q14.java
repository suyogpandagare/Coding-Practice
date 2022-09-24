package study;

import java.util.Scanner;

public class Q14 {
	//Wap enter an array and print it in reverse order.
	public static void main(String[] args) {

		Scanner x=new Scanner (System.in);
		int a[]=new int[9];
		int i,c=0;
		System.out.println("Enter element of Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=x.nextInt();
		}
		System.out.print("Array in reverse order is = ");
		for (int j = a.length-1; j >= 0; j--) {
			System.out.print(a[j]+" ");
		}
	}

}
