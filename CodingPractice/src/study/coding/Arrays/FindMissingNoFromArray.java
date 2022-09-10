package study.coding.Arrays;

public class FindMissingNoFromArray {

	public static void main(String[] args) {

		//if 5 is missing from array then find that number
		int arr [] = new int[] {1,2,3,5,6,7,8,9,10};
		
		int missingNo = getMissingNumber(arr);
		if(missingNo == 0) 
			System.out.println("No Missing Number");
		else
			System.out.println("Missing number is = "+missingNo);
		
		
	}
	
	public static int getMissingNumber(int arr[])
	{
		int n = arr[arr.length-1];
		int originalSumOfArray = (n * (n+1))/2;
		int currentArraySum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			currentArraySum += arr[i];
		}
		
		return (originalSumOfArray - currentArraySum);
	}

}
