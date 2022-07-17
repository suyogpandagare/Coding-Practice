package Basics;

public class Prime {

	public static void main(String[] args) {

		int n = 2;
		boolean res = prime(n);
		if(res==false)
			System.out.println("Not Prime");
		else 
			System.out.println("Prime");
	}
	
	//NAIVE SOLUTION
	/*public static boolean prime(int n) {
		
		if(n==1) 
			return false;
		for (int i = 2; i < n; i++) {
			
			if(n%i == 0)
				return false;
		}
		return true;
	}
*/
	
	//EFFECTIVE SOLUTION
	/*public static boolean prime(int n) {
		
		if(n==1) {
			return false;
		}
			
		for (int i = 2; i*i <= n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}*/
	
	//EFFECTIVE SOLUTION
		public static boolean prime(int n) {
			
			if(n == 1) {
				return false;
			}
			if(n == 2 || n == 3) {
				return true;
			}
			if(n%2==0 || n%3==0) {
				return false;
			}
				
			for (int i = 5; i*i <= n; i=i+6) {
				if(n%i==0 || n%(i+2)==0) {
					return false;
				}
			}
			return true;
		}
	
}//end of class
