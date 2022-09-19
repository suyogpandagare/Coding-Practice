package study;

import java.util.Scanner;

public class Q4 {

	//reverse the number
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//now i want to seperete digits from this number
		int rem,reverse=0;
		while(num != 0) {
			
			rem = num % 10;  //123
			reverse = rem + reverse*10;  //321
 			num = num / 10;
		}
		System.out.println("reverse of the number is = "+reverse);
	}

}
