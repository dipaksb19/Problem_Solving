package numbersproblem;

// Finding number is even or odd
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("---Finding number is Even or Odd---");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}

	}

}
