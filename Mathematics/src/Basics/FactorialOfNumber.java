package Basics;

public class FactorialOfNumber {

	public static void main(String[] args) {

		long n = 10;
		long res = Factorial(n);
		System.out.println("Factorial of number = "+ res);

	}

	//Iterative Solution
	static long Factorial(long n)
	{
		if(n==0) return 1;
		else
		{
			long res = 1;
			for(int i=1; i<=n; i++)
			{
				res = res * i;
			}
			return res;
		}

	}

	//Recursive solution
	/*static int Factorial(int n)
	{
		if(n==0) return 1;
		else
		return n * Factorial(n-1);
	}*/

}
