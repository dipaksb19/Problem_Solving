package basicproblems;
import java.util.Scanner;
public class NumberProblems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*
		System.out.println("---- Palindrome or not ----");
		System.out.println("Enter the NUmber : ");
		int num = sc.nextInt();
		int temp1 = num;
		int result = 0;
		while(temp1 != 0) {
			int digit = temp1 % 10;
			result = result * 10 + digit;
			temp1 = temp1 / 10;
		}
		
		if(num == result) {
			System.out.println("Is Palindrome : " + num);
		}else {
			System.out.println("Is Not Palindrome : " + num);
		}
		
		*/
		
		
		
		
		
		
		/*
		System.out.println("---- Armstrong Number Program ----");
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
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
			System.out.println("The Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("---- Fibonacci Series ----");
		
		System.out.println("Enter the length of series : ");
		int len = sc.nextInt();
		
		int temp1 = 0;
		int temp2 = 1;
		int result = 0;
		System.out.print("Fibonacci Series : ");
		System.out.print(temp1 + " ");
		System.out.print(temp2 + " ");
		
		for(int i = 2; i < len; i++) {
			
			result = temp1 + temp2;
			System.out.print(result + " ");
			temp1 = temp2;
			temp2 = result;
			
		}
		
		
		*/
		
		
		
		
		
		
		/*
		System.out.println("----Loops UnderStanding----");
		
		int [] arr = {6,23,1,5,46,32,0};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
			if(arr[i] == arr[0]) {
				System.out.println("Min ELement : " + arr[i]);
			}
			if(arr[i] == arr[arr.length - 1]) {
				System.out.println("Max Element : " + arr[i]);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("---- Find Max Min of Array ----");
		System.out.println("Enter the size of Array :");
		int size = sc.nextInt();
		
		int [] array = new int[size];
		
		System.out.println("Enter the Array Elements : ");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			
			}
			if(array[i] > max) {
				max = array[i];
			}
			
			if(array[i] < min) {
				min = array[i];
			}
			
		}
		
		
		System.out.println("Max of Array is : " + max);
		
		System.out.println("Min of Array is : " + min);
		
		System.out.println("Sorted Array is : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		*/
		
		
		
		
		
		
		
		
		/*
		System.out.println("---- Find the Factorial ----");
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("Factorial is : " + result);
		
		*/
		
		
		
		
		/*
		System.out.println("---- Odd Even Program ----");
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}else if(num % 2 == 1) {
			System.out.println("Number is Odd");
		}
		*/
		

		
		
		
		
		/*
		System.out.println("----Prime NUmber Probram----");
		System.out.println("Enter The number : ");
		int num = sc.nextInt();
		int flag = 0;
		int i = 2;
		while(i < num) {
			System.out.println(i);
			if(num % i == 0) {
				flag++;
			}
			i++;
		}
		if(flag == 0) {
			System.out.println(num + " is Prime Number");
		}else {
			System.out.println(num + " is Not Prime Number");
		}
		*/

	}

}
