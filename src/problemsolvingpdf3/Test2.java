package problemsolvingpdf3;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
	
	
	// Removing Duplicates from array
	public void removeDuplicate(int [] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int  num : arr) {
			set.add(num);
		}
		
		System.out.println("After Removing Duplicates from Array : " + set);
	}

	// Reverse the Input Number
	public void reverse(int num) {
		int result = 0;
		while(num != 0) {
			int digit = num % 10;
			result = result * 10 + digit;
			
			// result = result * 10 + num % 10;
			num /=  10;
		}
		System.out.println("After Reversing : " + result);
	}
	
	// fiding second largest element of Array
	public void findSecondLargest(int [] arr) {
		int first = arr[0];
		int second = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > first) {
				first = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}
		System.out.println("Second Largest is : "+ second);
	}
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		System.out.println("---Program Practice Question 3---");
		
		int arr1 [] = {8,6,8,5,4,3,5,2};
		obj.removeDuplicate(arr1);

		int num = 12345;
		obj.reverse(num);
		
		int arr2 [] = {1,2,2,3,6,7,5,32,2};
		obj.findSecondLargest(arr2);
		
		System.out.println("--Swapping of Numbers---");
		int a = 10;
		int b = 20;
		System.out.println(a + " -- " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " -- " + b);
	}

}
