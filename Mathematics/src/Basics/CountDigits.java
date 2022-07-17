package Basics;

public class CountDigits {

	public static void main(String[] args) {

		long n=124564500;
		int res = countDigits(n);
		System.out.println(res);
		
	}
	
	//1) iterative solution
	/*public static int countDigits(long n)
	{
		int cnt = 0;
		while(n != 0)
		{
			cnt++;
			n=n/10;
		}
		return cnt;
	}*/
	
	//2) recursive solution
	public static int countDigits(long n)
	{
		if(n == 0)  return 0;
		else
		return 1 + countDigits(n/10);
	}
	
	

}//end of class












