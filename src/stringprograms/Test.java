package stringprograms;

import java.util.Arrays;

public class Test {
	
	public void reverseStr(String str) {
		String str2 = str.toUpperCase();

		StringBuffer result = new StringBuffer();
		for(int i = str2.length() - 1; i >= 0; i--) {
			char c = str2.charAt(i);
			result.append(c);
		}
		System.out.println(result);
	}
	
	
	public void checkPalindrome(int num) {
		int temp1 = num;
		int result = 0;
		while(temp1 != 0) {
			int digit = temp1 % 10;
			result = result * 10 + digit;
			temp1 = temp1 / 10;
		}
		
		if(result == num) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
	
	public void fibonacci() {
		
		int num1 = 0;
		int num2 = 1;
		int result = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 +" ");
		
		for(int i = 0; i < 10; i++) {
			result = num1 + num2;
			System.out.print(result + " ");
			num1 = num2;
			num2 = result;
		}
	}

	
	// Merge two arrays
	public int [] merge(int num1 [], int num2 []) {
		int result [] = new int[num1.length + num2.length];
		
		for(int i = 0; i < num1.length; i++) {
			result[i] = num1[i];
		}
		for(int i = 0; i < num2.length; i++) {
			result[num1.length + i] = num2[i];
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Test  obj = new Test();
//		System.out.println("String reverse--->");
//		String str = " Dipak";
//		obj.reverseStr(str);
		
		// Palindrome
		int num = 121;
		int num2 = 123;
		obj.checkPalindrome(num);
		obj.checkPalindrome(num2);
		
		// Fibonacci series
		obj.fibonacci();
		
		// merge arrays
		int [] array1 = {1,2,3,4,45};
		int [] array2 = {6,7,8,9,54};
		System.out.println("\nMerged Array : ");
		int [] result = obj.merge(array1, array2);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		//2nd way
		System.out.println();
		int [] arr1 = {1,3,5};
		int [] arr2 = {2,4,6};
		int [] merged = new int[arr1.length + arr2.length];
		
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		System.out.println(Arrays.toString(merged));
		
		
		//Find largest number in array
		int [] marks = {1,54,32,67,500,4,20,4,10};
		int max = marks[0];
		for(int i = 1; i < marks.length; i++) {
			if(marks[i] > max) {
				max = marks[i];
			}
		}
		
		System.out.println("Maximum Marks of student is : " + max);
		

	}

	

}
