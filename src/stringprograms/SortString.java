package stringprograms;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		System.out.println("\t ----Program to Sort String in Alphabetical Order----");
		
		//Approch -1 - Without Using Method
		String str = "dipak";
		
		char [] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < arr.length; i++) {
			result.append(arr[i]);
		}
		
		System.out.println("After Sorting : " + result);
		System.out.println(new String(arr));
		
		// Approch - 2 - by using method
		String str2 = "rock";
		char [] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		System.out.println("Sorted Using 2nd Approch : " + new String(arr2));

	}

}
