package numbersproblem;

import java.util.Scanner;
public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the A input : ");
		int a = sc.nextInt();
		System.out.println("Enter the B input : ");
		int b = sc.nextInt();
		System.out.println("Enter the C input : ");
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater (" + a + ")");
			}
			
		}
		else if(b>c) {
			System.out.println("B is greater (" + b + ")");
		}
		else {
			System.out.println("C is greater (" + c + ")");
		}
	}

}
