package Basics;

public class FreqInSortedArray {

	public static void main(String[] args) {

		int arr[] = {40,50,50,60,75,75,75};
		getFreqOFElements(arr);
		
	}
	
	public static void getFreqOFElements(int arr[])
	{
		int freq = 1;
		int i=1;
		int n = arr.length;
		
		while(i<n)
		{
			while(i<n && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
			System.out.print(arr[i-1]+"-> "+freq+" , ");
			i++;
			freq=1;
		}
		if(n==1 || arr[n-1] != arr[n-2])
			System.out.print(arr[n-1]+"-> "+1);
	}

}
