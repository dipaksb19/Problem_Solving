package stringprograms;

import java.util.Scanner;

public class CountUpperLowercaseChar {
	
	//Finding Uppercase and Lowercase
	public void upperLowerCase(String str) {
		int uppercase = 0;
		int lowercase = 0;
		int space = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				uppercase++;
			}else if(Character.isLowerCase(c)) {
				lowercase++;
			}else if(Character.isWhitespace(c)) {
				space++;
			}
		}
		System.out.println("Upper case char : " + uppercase);
		System.out.println("Lower case char : " + lowercase);
		System.out.println("White Spaces : " + space);
	}

	
	//Program to reverse the String
	public void reverseString(String str) {
		//StringBuilder rstr = new StringBuilder();
		String rstr = new String();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				rstr += Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				rstr += Character.toUpperCase(c);
			}else if(Character.isWhitespace(c)){
				rstr += " ";
			}
		}
		System.out.println("After Reversing case: " + rstr);
	}
	
	//Reversing the String
	public void reverse(String str) {
		String rstr = new String();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			rstr += c;
		}
		System.out.println("Reverse of String is : " + rstr);
	}
	
	
	
	// String palindrome
	public void palindrome(String str) {
		String rstr = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			rstr += c;
		}
		if(str.equals(rstr)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CountUpperLowercaseChar obj = new CountUpperLowercaseChar();
		
		System.out.println("Enter the String : ");
		// always take input with nextLine it takse whole string
		String str = sc.nextLine();
		obj.upperLowerCase(str);
		obj.reverseString(str);
		obj.reverse(str);
		obj.palindrome(str);
	}

}
