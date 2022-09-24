package study;

import java.util.Scanner;

public class Q9 {

	//prime number

	public static void main(String [] args)
	{
		Scanner s=new Scanner (System.in);
		int i,n,rem,rev;
		i=2;
		System.out.println("Enter the number");
		n=s.nextInt();
		while(n!=0)
		{
			rem=n%10;
			if(rem%i==0)
				break;
			i++;
		}
		if(i==n)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
	}

}


