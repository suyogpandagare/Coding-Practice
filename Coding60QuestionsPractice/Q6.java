package study;

import java.util.Scanner;

public class Q6 {

	//Armstrong number : Armstrong number is a number that is equal 
	//to the sum of cubes of its digits. For example 0, 1, 153, 370, 371
	//and 407 are the Armstrong numbers.
	
	//sum of cubes of digits is same as that of given number
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int ref = num;
		int rem,res=0;
		while(num != 0) {
			rem = num % 10;
			
			res += rem*rem*rem;
			
			num = num / 10;
			
		}
		
		if(ref == res) {
			System.out.println("number is Armstrong number");
		}
		else {
			System.out.println("number is not Armstrong number");
		}
			
	}

}
