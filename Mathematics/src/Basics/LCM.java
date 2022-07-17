package Basics;

public class LCM {

	public static void main(String[] args) {
		
		int a = 12,b=15;
		int lcm = lcm(a,b);
		System.out.println(lcm);
	}

	//NAIVE SOLUTION
	/*public static int lcm(int a, int b)
	{
		int res = Math.max(a, b);
		while(true)
		{
			if(res%a==0 && res%b==0)
				return res;
			res++;
		}
	}*/

	//EFFECTIVE SOLUTION=>(we get logarithmic time complexicity here)
	public static int gcd(int a, int b) {
		
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	
	public static int lcm(int a, int b) {
		
		return (a*b)/gcd(a, b);
	}

}//class end
