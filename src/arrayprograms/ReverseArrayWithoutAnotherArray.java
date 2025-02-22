package arrayprograms;
import java.util.Scanner;

public class ReverseArrayWithoutAnotherArray {
	
	
	//  1  2  3  4  5  6  7  8
	
	
	public static void reverseArray(int array []) {
		int first = 0;
		int last = array.length - 1;
		while(first < last) {
			int temp = array[last];
			array[last] = array[first];
			array[first] = temp;
			first++;
			last--;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Reversing array without another Array ----");
		
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		
		int array [] = new int[size];
		
		System.out.println("Enter the Elements : ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("\n Array Before Swap : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Function Calling
		ReverseArrayWithoutAnotherArray.reverseArray(array);
		
		System.out.print("\n Array After Swap : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		

	}

}
