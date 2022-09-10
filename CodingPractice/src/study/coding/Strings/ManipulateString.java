package study.coding.Strings;

public class ManipulateString {

	public static void main(String[] args) {

		//i want half of the string in lowercase and other half in uppercase
		
		String str = "Expense Splitter Web App Expense Splitter Web App";
		
		int mid = str.length() / 2;
		
		String lowerCase = "";
		String upperCase = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(i <= mid) {
				lowerCase += Character.toLowerCase(str.charAt(i));
			}
			else {
				upperCase += Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(lowerCase+upperCase);
	}

}
