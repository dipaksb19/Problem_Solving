package arrayprograms;

import java.util.Scanner;

public class ReverseArrayWorst {
	
	public static void reverseArray(int [] array) {
		int [] arr = new int[array.length];
		int j = 0;
		for(int i = array.length - 1; i >= 0; i--) {
			arr[j] = array[i];
			j++;
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = arr[i];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Reversing Array by Another Array ----");
		
		System.out.println("Enter the Size of array : ");
		int size = sc.nextInt();
		
		int [] array = new int[size];
		
		System.out.println("Enter the elements in array : ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("Array Before Reversed : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		ReverseArrayWorst.reverseArray(array);
		
		// Display reversed array
		System.out.print(" \n Array After Reversed : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
