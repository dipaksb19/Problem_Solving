package stringprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringPractice {
	
	// counting of string charecters
	public void countChar(String str) {
		int length = str.length();
		System.out.println("Size of String is : " + length);
	}
	
	// Counting the capital alphabets of the string
	public void capsOfString(String str) {
		int caps = 0;
		int small = 0;
		int blank = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				caps++;
			}else if(Character.isWhitespace(c)){
				blank++;
			}else {
				small++;
			}
		}
		System.out.println("Count of capital letters in string is : " + caps);
		System.out.println("Count of Small letters in string is : " + small);
		System.out.println("Count of Blank Spaces in string is : " + blank);
		
	}
	
	// Reversing String
	public void reverseString(String str) {
		String result = new String();
		for(int i = str.length() - 1; i >= 0 ; i--) {
			char c = str.charAt(i);
			result += c;
;		}
		
		System.out.println("\nReversed String : " + result);
	}
	
	
	//remove duplicate characters
	public void removeDuplicate(String str) {
		String result = new String();
		int flag = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for(int j = i + 1; j < str.length(); j++) {
				
				char d = str.charAt(j);
				
				if(c == d) {
					flag++;
				}
			}
			if(flag == 0) {
				result += c;
				flag = 0;
			}
		}
		System.out.println("After Removing Duplicates : " + result);
	}
	
	
	
	public void printDuplicateChar(String str) {
		char[] input = str.toCharArray();
		Arrays.sort(input);
		for(int i = 0; i < input.length; i++) {
			Integer flag = 0;
			
			for(int j = i + 1; j < input.length; j++) {
				if(input[i] == input[j]) {
					flag++;
				}
			}
			if(flag != 0) {
				System.out.println("Char "+ input[i] + " Occured " + flag + " times");
			}
			
		}
	}
	

	public static void main(String[] args) {
		StringPractice obj = new StringPractice();
		System.out.println("\t----String programs----");
		
		String str = "ababab";
		System.out.println("Input String is : " + str);
		obj.countChar(str);
		
		obj.capsOfString(str);
		
		obj.reverseString(str);
		
		obj.removeDuplicate(str);
		
		obj.printDuplicateChar(str);

	}

}
