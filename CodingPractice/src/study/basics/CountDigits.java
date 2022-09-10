package study.basics;



public class CountDigits {

	public static void main(String[] args) {

		int num = 12345678;
		
		//1st way
		/*int count = 0;
		while(num % 10 != 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Number Of Digits = "+count);*/
		
		//2nd way
		String str = Integer.toString(num);
		System.out.println("Number Of Digits = "+ str.length());
		
	}

}
