package basicproblems;

import java.util.Scanner;

public class MathsProgram {
	
	
	//Program to find prime Number
	public String primeNumber(int num) {
		int flag = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				flag++;
			}
		}
		if(flag == 0) {
			return "The Number is Prime";
		}else {
			return "Number is Not Prime";
		}
			
	}
	
	
	//Armstrong Number 
	public void armstrongNumber(int num) {
		int temp1 = num;
		int temp2 = num;
		int length = 0;
		int result = 0;
		
		while(temp1 != 0) {
			length++;
			temp1 = temp1 / 10;
		}
		
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
			System.out.println("The Number is Armstrong");
		}else {
			System.out.println("The Number is not Armstrong");
		}
	}
	
	
	// Palindrome Number
	public void palindromeNumber(int num) {
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
	
	// Even Odd Number
	public void evenoddNumber(int num) {
		if(num % 2 == 0) {
			System.out.println("The Number is Even");
		}else {
			System.out.println("The number is Odd");
		}
	}
	
	// Factorial of Number
	public void factorialofNumber(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("factorial of " + num + " is : " + result);
	}
	
	// Fibonacci series
	public void fibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		int result = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for(int i = 1; i < num; i++) {
			result = num1 + num2;
			System.out.print(result + " ");
			num1 = num2;
			num2 = result;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("---Number Program---");
		
		Scanner sc = new Scanner(System.in);
		MathsProgram obj = new MathsProgram();
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		//System.out.println(obj.primeNumber(num));
		
		//obj.armstrongNumber(num);
		
		//obj.palindromeNumber(num);
		
		//obj.evenoddNumber(num);
		
		//obj.factorialofNumber(num);
		
		//obj.fibonacciSeries(num);

	}

}
