package Basics;

public class MaximumDiff {

	public static void main(String[] args) {

		int arr[] = {2, 3, 10, 6, 4, 8, 1};
		int maxDiff = getMaxDiff(arr);
		System.out.println("The max difference between two elements in Array is = "+maxDiff);
		
		}
	
		public static int getMaxDiff(int arr[])
		{
			int n = arr.length;
			int res = arr[1]-arr[0];
			int minVal = arr[0];
			for (int i = 1; i < n; i++) 
			{
				res = Math.max(res, arr[i] - minVal);
				minVal = Math.min(minVal, arr[i]);
			}
			return res;
		}

}
