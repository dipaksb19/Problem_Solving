package numbersproblem;
// Checking if the given number is palindrome or not
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		
		System.out.println("---Check Number is Palindrome or not---");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int rem;
		int rev = 0;
		
		
		//Reversing the number
		while(temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		
		
		// Checking num is palindrome or not
		if(num == rev) {
			System.out.println("Entered number : " + num);
			System.out.println("It is Palindrome !");
		}
		else {
			System.out.println("Entered number : " + num);
			System.out.println("It is not Palindrome !");
		}

	}

}
