package numbersproblem;
import java.util.Scanner;
public class PrimeNumberOptimized {

	//function to check if number is prime or not
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
	
	public static void main(String[] args) {
		System.out.println("---Prime number Optimized Program---");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println(optPrime(num));;
		
	}

}
