package numberconversion;

import java.util.Scanner;
public class BinaryToDecimal {

	
	public static void BinToDec(int binNum) {
		int pow = 0;
		int decNum = 0;
		int initial = binNum;
		while(binNum > 0) {
			int ld = binNum % 10;
			decNum = decNum + (ld * (int)Math.pow(2, pow));
			pow++;
			binNum = binNum / 10;
		}
		System.out.println("Decimal of Binary num " + initial + " is : " + decNum);
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("***Binery to Decimal***");
	
	System.out.println("Enter the Number :");
	int binNum = sc.nextInt();
	
	BinToDec(binNum);

	}

}
