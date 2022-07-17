package Basics;

public class largestElement {

	public static void main(String[] args) {

		int []arr = {2,8,6,3,9,5};
		System.out.println(getLargestElement(arr));
		
		
		
	}
	
	public static int getLargestElementIndex(int []arr)
	{
		int res = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > arr[res]) {
				res = i;
			}

		}
		return res;		
		
	}
	
	public static int getLargestElement(int []arr)
	{
		int res = -999;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > res) {
				res = arr[i];
			}

		}
		return res;		
		
	}
	
	

}
