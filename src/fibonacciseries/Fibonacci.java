package fibonacciseries;

import java.util.Scanner;
public class Fibonacci {
	
	// 0 + 1 = 1
	// 1 + 1 = 2
	// 1 + 2 = 3
	
	public void fibonacciSeries(int size) {
		int temp1 = 0;
		int temp2 = 1;
		
		System.out.print(temp1);
		for(int i = 1; i < size; i++) {
			int result = temp1 + temp2;
			System.out.print(" " + result);
			temp1 = temp2;
			temp2 = result;
		}
	}
	
	
	

	public static void main(String[] args) {
//		System.out.println("---Fibonacci Series---");
//		int num1 = 1;
//		int num2 = 1;
//		int add = 0;
//		System.out.println(add);
//		System.out.println(num1);
//		for(int i = 1; i <= 10; i++) {
//			add = num1 + num2;
//			System.out.println(add);
//			num2 = num1;
//			num1 = add;
//			
//		}
		
		System.out.println("----Fibonacci Series By Function----");
		
		Fibonacci obj = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int size = sc.nextInt();
		obj.fibonacciSeries(size);
		

	}

}
