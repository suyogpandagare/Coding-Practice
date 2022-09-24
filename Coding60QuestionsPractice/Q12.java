package study;

import java.util.Scanner;

public class Q12 {

	//Wap enter an array and search any particular
	//element and find the count.

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int []arr = new int[7];
		System.out.println("Enter elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to find");
		int num = sc.nextInt();
		findNum(arr, num);
		int count = count(arr, num);
		System.out.println("count is = "+count);
	}
	
	public static void findNum(int []arr,int num)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("number "+num+" is present in array");
				return;
			}
		}
	}

	public static int count(int []arr,int num)
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		return count;
	}
}
