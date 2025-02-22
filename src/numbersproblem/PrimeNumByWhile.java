package numbersproblem;

import java.util.Scanner;
public class PrimeNumByWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int i = 1;
		int div = 0;
		int flag = 0;
		while(i <= num) {
			div = num % i;
			if(div == 0) {
				flag ++;
			}
			i++;
		}
		if(flag == 2) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}

}
