package numberconversion;
import java.util.Scanner;
public class DecimalToBinary {

	
	
	public static void DecToBin(int decNum) {
		int initial = decNum;
		int pow = 0;
		int binNum = 0;
		
		while(decNum > 0) {
			int rem = decNum % 2;
			binNum = binNum + (rem * (int)Math.pow(10, pow));
			pow++;
			decNum = decNum / 2;
		}
		System.out.println("Binary of Decimal " + initial + " is : " + binNum);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("***Decimal to Binary Conversion***");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Decimal Number : ");
		int decNum = sc.nextInt();
		
		DecToBin(decNum);

	}

}
