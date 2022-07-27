package Basics;

public class ReverseAnArray {

	public static void main(String[] args) {

		int arr[] = {3,5,6,7,2,3};
		reverseArray(arr);
	}
	
	public static void reverseArray(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		while(low < high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		
		
	}

}
