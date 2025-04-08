package basicproblems;

import java.util.Arrays;

public class MathsAllPrograms {

	//prime Numbre
	public void primeNumber(int num) {
		int flag = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				flag++;
			}
		}

		if(flag == 0) {
			System.out.println("Number is Prime Number");
		}else {
			System.out.println("Number is not prime");
		}
	}


	// Factorial
	public void factorial(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("factorial is " + result);
	}


	//max min of array

	public void array(int [] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		//		for(int i = 0; i < arr.length; i++) {
		//			if(arr[i] < min) {
		//				min = arr[i];
		//			}
		//			if(arr[i] > max) {
		//				max = arr[i];
		//			}
		//		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}

		min = arr[0];
		max = arr[arr.length - 1];
		System.out.println("Max Number is : " + max);

		System.out.println("Min Number is : " + min);
	}


	//Fibonacci Series

	public void fibonacciSeries(int length) {
		int num1 = 0;
		int num2 = 1;
		int result = 0;
		System.out.print(num1 + " ");

		for(int i = 1; i < length; i++) {
			result = num1 + num2;
			System.out.print(result + " ");
			num1 = num2;
			num2 = result;
		}
	}

	// Armstrong Number

	public void armstrongNum(int num) {
		int temp1 = num;
		int temp2 = num;
		int length = 0;

		while(temp1 != 0) {
			length++;
			temp1 = temp1 / 10;
		}

		int result = 0;
		while(temp2 != 0) {
			int digit = temp2 % 10;
			int mul = 1;
			for(int i = 1; i <= length; i++) {
				mul = mul * digit;
			}
			result = result + mul;
			temp2 = temp2 / 10;
		}


		if(num == result) {
			System.out.println("Number is Armstrong Number");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}


	// Palindrome code
	public void palindrom(int num) {
		int temp1 = num;
		int result = 0;

		while(temp1 != 0) {
			int digit = temp1 % 10;
			result = result * 10 + digit;
			temp1 = temp1 / 10;
		}
		if(result == num) {
			System.out.println("The Number is Palindrome");
		}else {
			System.out.println("The Number is not Palindrome");
		}

	}

	//Asked Question --------------------

	//Area of Circle
	public void areaOfCircle(double radius) {
		double result = Math.PI * radius *radius;
		System.out.println("Area of Circle is : " + result);
	}

	//Area of triangle
	public void areaOfTriangle(double base, double height) {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle : " + area);
	}

	//Area of Square
	public void areaOfSquare(double side) {
		double area = side * side;
		System.out.println("Area of Square is : " + area);
	}

	//-------------------------------------
	//Reverse the Number 
	public void reverseNumber(int num) {
		int result = 0;
		while(num !=  0) {
			int digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;
		}
		System.out.println("After Reverse : " + result);
	}



	//Max Number from three numbers
	public void findMaxOfThree(int a, int b, int c) {
		if(a > b) {
			if(a > c) {
				System.out.println(" Greater : " + a);
			}else {
				System.out.println("Greater : " + c);
			}
		}else if(b > c){
			System.out.println("Greater : " + b);
		}else {
			System.out.println("Greater : " + c);
		}
	}



	// Strings-----------------------------------------


	// String palindrome (By Method)
	public void stringPalindrom(String str) {
		String result = new StringBuilder(str).reverse().toString();
		System.out.println(result);
		if(str.equals(result)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrom");
		}
	}

	// String palindrome without method
	public void stringPalindromeByLoop(String str) {
		char [] charString = str.toCharArray();

		int start = 0;
		int end = charString.length - 1;

		while(start < end) {
			char temp = charString[start];
			charString[start] = charString[end];
			charString[end] = temp;
			start++;
			end--;
			System.out.println("k");
		}

		String result = new String(charString);
		System.out.println(result);
	}

	// String duplicate 
	public void stringDuplicate(String str) {
		char[] charArray = str.toCharArray();

		System.out.println("Duplicate characters in the string:");

		// Outer loop picks each character
		for (int i = 0; i < charArray.length; i++) {
			int count = 1;
			if (charArray[i] != ' ') {  // Ignore spaces
				// Inner loop checks for duplicates
				for (int j = i + 1; j < charArray.length; j++) {
					if (charArray[i] == charArray[j]) {
						count++;
						charArray[j] = ' '; // Mark as visited
					}
				}
				// Print if count > 1 (duplicate found)
				if (count > 1) {
					System.out.println(charArray[i] + " - " + count + " times");
				}
			}
		}
	}


	// find duplicate in array
	public void duplicate(int [] array) {
		Arrays.sort(array);
		int temp = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i - 1] == array[i]) {
				temp = array[i - 1];
				System.out.println("The Duplicate is : " + temp);
				break;
			}
		}

	}




	public static void main(String[] args) {
		System.out.println("---Numbers Problems---");
		MathsAllPrograms obj = new MathsAllPrograms();

		obj.primeNumber(7);

		obj.factorial(4);


		int [] array = {56,221,564,87,34,1,90,3,64,2};
		obj.array(array);

		obj.fibonacciSeries(10);

		System.out.println("------------------------------------");

		obj.armstrongNum(1534);

		obj.palindrom(121);

		//-------------------------------------------------

		obj.areaOfCircle(10);

		obj.areaOfTriangle(5, 10);

		obj.areaOfSquare(10);

		obj.reverseNumber(123);

		obj.findMaxOfThree(10, 3, 11);

		//--------------------------------------------------

		obj.stringPalindrom("abba");

		obj.stringPalindromeByLoop("Dipak");

		int arr2 [] = {6,4,8,9,2,2,5,9};
		obj.duplicate(arr2);

		obj.stringDuplicate("dipakkid");


	}

}
