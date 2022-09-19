package study;

import java.util.Scanner;

public class Q3 {

	//find sum of even and odd
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int rem,sumEven=0,sumOdd=0,cntEven=0,cntOdd=0;
		while(num != 0) {
			rem = num % 10;
			if(rem % 2 == 0) {
				cntEven++;
				sumEven += rem;
			}
			else {
				cntOdd++;
				sumOdd += rem;
			}
			num = num / 10;
		}
		System.out.println("Sum of even numbers = "+sumEven +" and total even numbers are = "+cntEven );
		System.out.println("Sum of odd numbers = "+sumOdd +" and total odd numbers are = "+cntOdd );
	}

}
