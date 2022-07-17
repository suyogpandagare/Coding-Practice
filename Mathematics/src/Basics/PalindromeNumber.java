package Basics;

public class PalindromeNumber {

	public static void main(String[] args) {

		long n = 1234321;
		if(isPalindrome(n))
		System.out.println("Palindrone");
		else
			System.out.println("Not Palindrome");
		
	}
	
	static boolean isPalindrome(long n)
	{
		long temp = n;
		long rev = 0;
		while(temp!=0)
		{
			long ld = temp % 10;
			rev = rev*10+ld;
			temp = temp/10;
		}
		if(n==rev) return true;
		else
			return false;
	}

}
