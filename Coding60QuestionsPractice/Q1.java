package study;

import java.util.Scanner;

//seperete digits from a number

public class Q1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	//now i want to seperete digits from this number
	int rem;
	while(num != 0) {
		
		rem = num % 10;
		System.out.print(rem+" ");
		num = num / 10;
	}
		
	}

}
