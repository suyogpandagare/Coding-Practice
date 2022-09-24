package study;

import java.util.Scanner;

public class Q11 {

	//Wap to enter an array and find the duplicate element 
	//and also count of that.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int arr[] = new int [7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count=0;
		System.out.print("Duplicate elements are = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Total count of duplicates = "+count);
	}

}
