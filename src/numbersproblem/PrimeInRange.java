package numbersproblem;
// Finding prime numbers in a range
import java.util.Scanner;
public class PrimeInRange {

	// Function to check prime or not
	public static boolean optPrime(int num){
		if(num == 2) {
			return true;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//function to check range prime or not
	public static void checkRange(int range) {
		for(int i = 1; i <= range; i++) {
			boolean result = optPrime(i);
			if(result) {
				System.out.println("Number : " + i + " = " + result);
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("---Checking Prime numbers in a Range---");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of number : ");
		int num = sc.nextInt();
		checkRange(num);
	}

}
