package study;

import java.util.Scanner;

public class Q7 {

	//Fibonacci Series
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of terms to print");
		int terms = sc.nextInt();
		
		int n1=0,n2=1,n3;
		
		System.out.print(n1+" "+n2);
		
		//agar 5 terms print krne hai to 2 already print kie so loop must run 3 times hence <= n-2
		for(int i=1;i <= terms-2;i++) {
			
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
