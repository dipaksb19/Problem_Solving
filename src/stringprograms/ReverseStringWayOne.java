package stringprograms;

import java.util.Scanner;

public class ReverseStringWayOne {

	// hello
	// olleh
	
	//Approch - 1
	// Preforming By Simply loop 
	public void reverseString(String str) {
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	
	//Approch - 2
	// Performing by method ( converting string in array )
	public void reverseStringbyArray(String str) {
		char [] array = str.toCharArray();
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
	
	
	
	// Approch - 3
	// Using string buffur class method
	public void reverseStringbyBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	// Approch - 3
		// Using string builder class method
		public void reverseStringbyBuilder(String str) {
			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse());
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReverseStringWayOne obj = new ReverseStringWayOne();
		System.out.println("---- Program to reverse String ----");
		
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		obj.reverseString(str);
		
		System.out.println();
		
		obj.reverseStringbyArray(str);
		
		System.out.println();
		
		obj.reverseStringbyBuffer(str);
		
		
		obj.reverseStringbyBuilder(str);
		
//		
//		char [] array = new char[str.length()];
//		int j = 0;
//		for(int i = array.length - 1; i >= 0; i--) {
//			array[j] = str.charAt(i);
//			j++;
//		}
//		
//		for(int i = 0; i< array.length; i++) {
//			System.out.print(array[i]);
//		}

	}

}
