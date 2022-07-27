package Basics;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int arr[] = {12,14,0,0,87,0,65};
		//moveZerosToEnd(arr);
		moveZerosAtEnd(arr);
		
	}
	
	//Naive Soln
	public static void moveZerosToEnd(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j] != 0)
					{
						int temp=arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		
		System.out.println("after moving zeros to end");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//Effective Soln
	public static void moveZerosAtEnd(int arr[])
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] != 0)
			{
				int temp=arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		
		System.out.println("after moving zeros to end");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
