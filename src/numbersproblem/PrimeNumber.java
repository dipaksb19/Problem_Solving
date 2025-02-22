package numbersproblem;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int flag = 0;
		int div;
		
		for(int i = 1; i <= num; i ++) {
			if(num % i == 0) {
				flag ++;
			}
		}
		
		if(flag == 2) {
			System.out.println(num + " is a Prime number");
		}
		else {
			System.out.println(num + " is not prime number");
		}
		/*
		for(int i = 1; i<= num; i++) {
			System.out.println("Division of " + num + " by " + i + " : " + (div = num % i));
			if(div != 0) {
				flag ++;
			}
		}

		System.out.println(flag);
		System.out.println(flag = num - flag);
		if(flag == 2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		*/
	}

}
