package study;

import java.util.Scanner;

public class Q5 {

	//find entered number is palindrome or not => normal and reverse are same
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//now i want to seperete digits from this number
		int rem,reverse=0;
		int original = num;
		while(num != 0) {
			
			rem = num % 10;  //123
			reverse = rem + reverse*10;  //321
 			num = num / 10;
		}
		if(original == reverse) {
			System.out.println("The entered number is Palindrome");
		}
		else {
			System.out.println("The entered number is not Palindrome");
		}
	}

}
