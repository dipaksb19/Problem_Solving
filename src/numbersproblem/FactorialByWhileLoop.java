package numbersproblem;

import java.util.Scanner;

public class FactorialByWhileLoop {

	public static void main(String[] args) {
		
		System.out.println("----Finding the Factorial----");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int fact = 1;
		
		int i = 1;
		while(i <= num) {
			fact = fact * i;
			i++;
		}
		
		System.out.println("Factorial of !" + num + " is : " + fact);
		System.out.println("Iterator is : " + i);

	}

}
