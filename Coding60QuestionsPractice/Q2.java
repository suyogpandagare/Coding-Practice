package study;

import java.util.Scanner;

public class Q2 {

	//find even and odd numbers
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rem,count=0;
		System.out.print("The Even numbers are ");
		while(num != 0) {
			rem = num % 10;
			if(rem % 2 == 0) {
				count++;
				System.out.print(rem+ " ");	
			}
			num = num / 10;
		}
		System.out.println();
		System.out.println("total even numbers are = "+count);
	}

}
