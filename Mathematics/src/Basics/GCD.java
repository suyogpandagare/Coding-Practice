package Basics;

public class GCD {

	public static void main(String[] args) {

		int a=15;
		int b=12;
		int gcd = gcd(a, b);
		System.out.println("GCD = "+gcd);
	}
	
	//NAIVE SOLUTION
	/*public static int gcd(int a, int b)
	{
		int res = Math.min(a, b);
		while(res > 0) {
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res--;
		}
		
		return res;
	}*/
	
	//EUCLIDEAN ALGO
	/*public static int gcd(int a, int b)
	{
		while(a != b) {
			if(a > b) 
				a = a-b;
			else
				b = b-a;
		}
		return a;
	}*/
	
	//OPTIMISED IMPLEMENTATION
	
	public static int gcd(int a, int b)
	{
		if(b == 0)
		return a;
		else
			return gcd(b, a%b);
	}
}
