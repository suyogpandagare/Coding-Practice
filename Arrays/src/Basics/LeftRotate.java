package Basics;

public class LeftRotate {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50};
		leftRotate1(arr, 2);
		
	}
	
	public static void leftRotateOne(int arr[])
	{
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	//Naive Soln
	public static void leftRotate(int arr[],int d)
	{
		for (int i = 0; i < d; i++) {
			leftRotateOne(arr);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//Effective Soln
	
	public static void leftRotate1(int arr[],int d)
	{
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reverse(int arr[],int low, int high)
	{
		while(low < high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
 
}
