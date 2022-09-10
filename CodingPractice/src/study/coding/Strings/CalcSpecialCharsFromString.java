package study.coding.Strings;

public class CalcSpecialCharsFromString {

	public static void main(String[] args) {

		//1st=> i want number of count of special characters in given string 
		//2nd => i want to remove special characters form string
		
		String str = "RakhiMatAhe@#$%%";
		int count = 0;
		String stringWithNoSpecialChars = "";
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
			{
				count++;
			}
			else
			{
				stringWithNoSpecialChars += str.charAt(i);
			}
		}
		if(count == 0) System.out.println("No Special Characters Present");
		else System.out.println("The Special characters count is = "+count);
		
		System.out.println("string excluding special characters = "+stringWithNoSpecialChars);
	}

}
