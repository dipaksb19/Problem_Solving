package basicproblems;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// πr2
		
		System.out.println("\t ----Findig Area of Circle----");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle : ");
		int radius = sc.nextInt();
		
		double result = 3.14 * (radius * radius);
		
		System.out.println("Result : " + result);
		

	}

}
