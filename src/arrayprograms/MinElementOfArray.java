package arrayprograms;

import java.util.Scanner;

public class MinElementOfArray {

	public static void main(String[] args) {
		System.out.println("---Finding min number from Array---");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entering the array elements");
		int arr[] = new int[10];
		for(int i = 0; i< arr.length; i++) {
			System.out.println("Enter the number : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("\nMinimum Element is : " + min);
		
	}

}
