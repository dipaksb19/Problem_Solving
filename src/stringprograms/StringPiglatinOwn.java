package stringprograms;

import java.util.Scanner;

public class StringPiglatinOwn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringPiglatinOwn obj = new StringPiglatinOwn();

		System.out.println("\t\t ---- Printing Piglatin of String ----");
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String s1 , s2;
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			char c = Character.toUpperCase(str.charAt(i));
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

				s1 = str.substring(i);
				s2 = str.substring(0, i);
				result.append(s1);
				result.append(s2);

			}
		}
		// can append by concating also
		// String result = s1 + s2 + "ay";
		result.append("ay");
		System.out.println(result);


	}

}
