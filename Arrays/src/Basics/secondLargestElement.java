package Basics;

public class secondLargestElement {

	public static void main(String[] args) {

		int arr[] = {10,10,10};
		int sL = getSecondLargestIndex(arr);
		if(sL == -1) {
			System.out.println("Array has only 1 element or zero element");
		}
		else
		System.out.println(arr[sL]);
	}
	
	public static int getSecondLargestIndex(int arr[])
	{
		int largest = 0;
		int res = -1;
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i] > arr[largest]) 
			{
				res = largest;
				largest = i;
			}
			else if(arr[i] != arr[largest]) 
			{
				if(res == -1 || arr[i] > arr[res])
				res = i;
			}
		}
		return res;
	}
}
