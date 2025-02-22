package numbersproblem;
// Finding number is armstrong or not by its number of digits
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n---Armstrong Number---");
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int t1 = num;
		int t2 = num;
		int length = 0;
		
		
		//finding the length of number
		while(t1 != 0) {
			t1 = t1 / 10;
			length = length + 1;
		}
		System.out.println("Length of Number is : "+length);
		
		// performing multiplication and addition
		int rem ;
		int arms = 0;
		while(t2 != 0) {
			rem = t2 % 10;
			int mul = 1;
			for(int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arms = arms + mul;
			t2 = t2 / 10;
		}
		
		// checking the number is armstrong or not
		if(num == arms) {
			System.out.println("The given number is Armstrong...!");
			System.out.println("Number || Armstrong ---> " + num + " || " + arms);
		}
		else {
			System.out.println("The given number is not Armstrong");
		}
		
		
	}

}
