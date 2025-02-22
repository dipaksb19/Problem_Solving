package numbersproblem;

import java.util.Scanner;
public class FactorialByForLoop {

	public static void main(String[] args) {
		
		System.out.println("----Finding the Factorial----"); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial is " + fact);
		
	}

}
