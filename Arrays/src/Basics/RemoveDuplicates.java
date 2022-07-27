package Basics;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int arr[] = {10,20,20,30,30,30};
		int n = arr.length;
		System.out.println("Before Removing Duplicates");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		 n = remDuplicates(arr);
		
		System.out.println();
		System.out.println("After Removing Duplicates");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	//Naive Soln
	public static int removeDuplicates(int arr[])
	{
		int temp[] = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(temp[res-1] != arr[i]) 
			{
				temp[res] = arr[i];
				res++;
			}
		}
		
		for(int i=0;i<res;i++)
		{
			arr[i] = temp[i];
		}
		
		return res;
	}
	
	//Effective Soln
	
	public static int remDuplicates(int arr[])
	{
		int res=1;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[res-1] != arr[i])
			{
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}










