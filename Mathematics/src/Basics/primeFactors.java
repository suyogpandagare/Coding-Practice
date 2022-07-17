package Basics;

public class primeFactors {

	public static void main(String[] args) {

		int n = 13;
		primeFactors(n);
		
	}
	
	public static boolean isPrime(int n) {
		
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0 || n%3==0) {
			return false;
		}
		for(int i=5;i*i<=n;i=i+6) {    //after 5 and 7 i directly want to check for 11 and 13 i.w. i=i+6
			
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeFactors(int n) {    //function cannot return more than 1 values i.w. printing here only
		
		for (int i = 2; i < n; i++) {
			
			if(isPrime(i)) {
				int x = i;
				while(n%x==0) {
					System.out.print(i +" ");
					x = x * i;
				}
			}
				
		}
		
	}

}
