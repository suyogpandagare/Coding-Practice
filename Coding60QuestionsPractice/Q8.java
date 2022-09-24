package study;

import java.util.*;

public class Q8 {

	//Factorial

	public static void main(String [] args)
	{
		Scanner s=new Scanner (System.in);
		int i,fact,n;
		i=1; fact=1;
		System.out.println("Enter the number");
		n=s.nextInt();
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("The factorial of number"+n+" is = "+fact);
	}

}
