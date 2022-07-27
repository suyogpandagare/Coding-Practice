package Basics;

public class LeadersInArray {

	public static void main(String[] args) {

		int arr[] = {3,5,17,5,16,7,8};
		leadersInArray(arr);
	}
	
	public static void leadersInArray(int arr[])
	{
		int j=0;
		int n = arr.length;
		int curLeader = arr[n-1];
		int res[] = new int[n];
		res[j] = curLeader;
		//System.out.print(curLeader+" ");
		
		for (int i = n-2; i >= 0; i--) 
		{
			if(arr[i] > curLeader)
			{
				curLeader = arr[i];
				++j;
				res[j] = curLeader;
				//System.out.print(curLeader+" ");
			}
		}
		
		for (int i = j; i >= 0; i--) {
			System.out.print(res[i]+" ");
		}
	}

}
