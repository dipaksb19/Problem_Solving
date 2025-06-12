package problemsolvingpdf3;

import java.util.Arrays;

// Problem solving PDF 3 solved here 


public class Test3 {

	//reverse the String
	public void reverseString(String str) {
		StringBuffer result = new StringBuffer();
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			result.append(c);
		}
		System.out.println("Original String : " + str);
		System.out.println("Reverse Strig is : " + result);
	}
	
	
	
	
	// Method to find GCD
	public void findGCD(int num1, int num2) {
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		System.out.println("GCD is : " + num1);
	}
	

	
	
	// Method 1 to check Anagram with predefined methods
	public void checkAnagramByFun(String str1, String str2) {
		char [] char1 = str1.toCharArray();
		char [] char2 = str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		boolean result = Arrays.equals(char1, char2);
		if(result) {
			System.out.println("The Entered String is Anagram");
		}else {
			System.out.println("The Entered String is Not Anagram");
		}
	}
	
	
	// Method2 to check Anagram
	public void checkAnagramByOwn(String str1, String str2) {
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		char [] res1 = sortArray(arr1);
		char [] res2 = sortArray(arr2);
		int flag = 0;
		for(int i = 1; i < res1.length; i++) {
			if(res1[i] != res2[i]) {
				flag++;
			}
		}
		
		int caseSensitivity = 0;
		for(int i = 0; i < res1.length; i++) {
			if(Character.isUpperCase(res1[i]) != Character.isUpperCase(res2[i])) {
				caseSensitivity++;
			}
		}
		if(flag == 0 && res1.length == res2.length && caseSensitivity == 0) {
			System.out.println("Entered String is Anagram");
		}else {
			System.out.println("Entered String is Not Anagram");
		}
		
	}
	
	public char[]  sortArray(char [] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
					char temp1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp1;
				}
			}
		}
		return arr1;
	}
	
	
	
	
	// Method to check number of digits present in number
	public void checkNumberOfDigits(int num) {
		int length = 0;
		while(num != 0) {
			length++;
			num = num / 10;
		}
		System.out.println("The Length of Number is : " + length);
	}
	
	
	
	
	// Method to check prime numbers in given range
	public void checkPrimeInRange(int start, int end) {
		for(int i = start; i <= end; i++) {
			int num = i;
			int flag = 0;
			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					flag++;
				}
			}
			if(flag == 0) {
				System.out.println(num + " is Prime");
			}else {
				System.out.println(num + " is Not Prime");
			}
		}
	}
	
	
	
	
	// Program to print Pascals Triangle
	
	//	*****1 
	//	****1 1 
	//	***1 2 1 
	//	**1 3 3 1 
	//	*1 4 6 4 1
	
	public void pascalsTriangle(int rows) {      // 5
		for(int i = 0; i < rows; i++) {          
			for(int j = 0; j < rows - i; j++) {  // 5 - 0
				System.out.print(" ");
			}
			
			int number = 1;
			for(int j = 0; j <= i; j++) { // 0 0
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
	
	
	
	// Find Missing Number from an Array
	public void findMissingNum(int arr []) {
		int n = arr.length + 1;           // n = 5 + 1 = 6
		int total = n * (n + 1)/2;        // total = 6 * (6 + 1) = 21
		for(int num : arr) {              // arr = 1, 2, 4, 5, 6 
			total -= num;
		}
		System.out.println("Input array is : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMissing Number : " + total);
	}
	
	
	
	// Find the Decimal to Binary Number
	public void decimalToBinary(int num) {
		String binary = Integer.toBinaryString(num);
		String hex = Integer.toHexString(num);
		String octal = Integer.toOctalString(num);
		
		System.out.println("Original Decimal : " + num);
		System.out.println("Its Binary : " + binary);
		System.out.println("Its Hexa Decimal : " + hex);
		System.out.println("Its Octal : " + octal);
		
	}
	
	
	
	// Program to check Perfect Number 
	public String checkPerfectNum(int num) {
		if (num <= 1) {
            return "Entered Number is Less than 1";
        }
		int result = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				result += i; 
			}
		}
		
		if(num == result) {
			return "The " + num + " is Perfect number";
		}else {
			return "The " + num + " is Not Perfect number";
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Test3  obj = new Test3();
		
		System.out.println("Reverse the String --->");
		String str1 = "Dipak";
		obj.reverseString(str1);
		
		
		System.out.println("\nFind GCD of Two Numbers --->");
		int num1 = 48;
		int num2 = 18;
		obj.findGCD(num1,num2);
		
		
		System.out.println("\nCheck Anagram --->");
		String str2 = "listen";
		String str3 = "silent";
		obj.checkAnagramByFun(str2, str3);
		obj.checkAnagramByOwn(str2, str3);
		
		
		System.out.println("\nCheck Number of Digits in a Number --->");
		int num3 = 56732;
		obj.checkNumberOfDigits(num3);
		
		
		System.out.println("\nPrint the Prime Number in a range --->");
		int start = 10;
		int end = 50;
		obj.checkPrimeInRange(start, end);
		
		
		System.out.println("\nPrint the Pascals Triangle --->");
		int rows = 5;
		obj.pascalsTriangle(rows);
		
		
		System.out.println("\nPrint the Missing number of Array --->");
		int arr[] = {1,2,4,5,6};
		obj.findMissingNum(arr);
		
		
		System.out.println("\nPrint the Decimal to Binary Number --->");
		int num4 = 10;
		obj.decimalToBinary(num4);
		
		
		System.out.println("\nProgram to Check Perfect Number --->");
		int num5 = 6;
		System.out.println(obj.checkPerfectNum(num5));
	
	}

}
