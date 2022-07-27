package Basics;

public class ArrayIsSorted {

	public static void main(String[] args) {

		int arr[] = {2,5,5,5,2};
		boolean res = isSorted(arr);
		if(res) {
			System.out.println("Array is sorted");
		}
		else
			System.out.println("Array is not sorted");
		
		
	}
	
	public static boolean isSorted(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < arr[i-1]) {
				return false;
			}
			
		}
		return true;
		
	}

}
