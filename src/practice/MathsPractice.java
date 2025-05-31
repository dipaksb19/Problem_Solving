package practice;

import java.util.Scanner;

public class MathsPractice {
	
	
	//fumction to check number is prime or not
	public void primeNum(int num) {
		int flag = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				flag++;
			}
		}
		
		if(flag == 0) {
			System.out.println("The Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
	}
	
	//Armstrong Number
	
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
		
		if(result == num) {
			System.out.println("The Number is Armstromg");
		}else {
			System.out.println("The Number is Not Armstrong");
		}
	}
	
	
	//Palindrome Number
	public void palindromNum(int num) {
		int temp1 = num;
		int result = 0;
		while(temp1 != 0) {
			int digit = temp1 % 10;
			result = result * 10 + digit;
			temp1 = temp1 / 10;
		}
		
		if(result == num) {
			System.out.println("The Given Number is Palindrome");
		}else {
			System.out.println("The given Number is Not Palindrome");
		}
	}
	
	//Factorial of Number
	public void factorialOfNum(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("factorial of Number is : " + result);
	}
	
	
	//fibonacci series
	public void fibonacciSeries(int num) {
		int num1 = 1;
		int num2 = 0;
		int result = 0;
		System.out.print(num1 +  " ");
		for(int i = 1; i < num; i++) {
			result = num2 + num1;
			System.out.print(result + " ");
			num2 = num1;
			num1 = result;
		}
	}
	
	
	//Even Odd
	public void evenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("The Number is Even");
		}else {
			System.out.println("The Number is Odd");
		}
	}
	
	
	// Array Programs 
	
	public void arraySortingFirst(int [] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void arraySorting(int array []) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) { 
					array[i] = array[i] * array[j];
					array[j] = array[i] / array[j];
					array[i] = array[i] / array[j];
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("\t\t----Program to do maths Practice----");
		
		MathsPractice obj = new MathsPractice();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		//int num = sc.nextInt();
		
		//obj.primeNum(num);
		
		//obj.armstrongNum(num);
		
		//obj.palindromNum(num);
		
		//obj.factorialOfNum(num);
		
		//obj.fibonacciSeries(num);
		
		//obj.evenOdd(num);
		
		
		System.out.println("----ArrayProblems----");
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int [] array = new int[size];
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		//obj.arraySortingFirst(array);
		
		obj.arraySorting(array);

	}

}
