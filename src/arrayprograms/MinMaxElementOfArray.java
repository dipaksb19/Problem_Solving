package arrayprograms;

import java.util.Scanner;
public class MinMaxElementOfArray {

	public static void main(String[] args) {
		System.out.println("\t---Finding Minimum and Maximum Element from Array---");
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the elements :");
		int arr[] = new int[10];
		for(int i = 0; i< arr.length; i++) {
			System.out.println("Element " + i +" :");
			arr[i] = sc.nextInt();
		}
		
		//displaying array
		System.out.println("Entered Elements are :");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("\nMinimum Element : " + min);
		System.out.println("maximum Element : " + max);

	}

}
