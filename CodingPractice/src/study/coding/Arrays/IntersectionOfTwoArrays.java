package study.coding.Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		//find common elements form this two array i.e. intersection of two arrays
		int arr1[] = {80,10,15,2,35,60};
		int arr2[] = {35,80,60,20,75};
		
		printIntersection(arr1, arr2);
		
		printUnion(arr1, arr2);
		
	}
	//the best catch here is set interface as it doesn't allow duplicates
	static void printIntersection(int arr1[],int arr2[]) {
	
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if(set.contains(arr2[i]))
				System.out.print(arr2[i] + " ");
		}
	}
	
	//Union of two arrays
		static void printUnion(int arr1[],int arr2[]) {
		
			Set<Integer> set = new HashSet<>();
			
			for (int i = 0; i < arr1.length; i++) {
				set.add(arr1[i]);
			}
			
			for (int i = 0; i < arr2.length; i++) {
				set.add(arr2[i]);
			}
			
			System.out.println("Union of two arrays = "+set);
		}

}
