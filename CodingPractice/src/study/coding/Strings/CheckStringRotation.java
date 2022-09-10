package study.coding.Strings;

public class CheckStringRotation {

	public static void main(String[] args) {

		//we are given ABCD and CDAB we have to write program which tells this two strings are rotation of each other or not
		
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		//i will string 1 with itself and find str2 is present in it or not if present then str2 is rotation of 1st
		
		boolean res = isRotation(str1, str2);
		if(res) System.out.println("Str2 is rotation of str1");
		else System.out.println("Str2 is not rotation of str1");
		
	}
	
	
	//index of returns 1st occurance of specified string if not found then returns -1
	public static boolean isRotation(String str1,String str2)
	{
		return(str1.length() == str2.length() && (str1+str1).indexOf(str2) != -1); 
	}

}
