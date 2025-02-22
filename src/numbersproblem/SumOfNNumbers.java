package numbersproblem;

import java.util.Scanner;
public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of Numbers is :" + sum);
	}

}
