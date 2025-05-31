package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class Demo {
	
	public void reverseArray(int [] array) {
		int start = 0;
		int end = array.length - 1;
		while(start < end) {
			array[start] = array[start] + array[end];
			array[end] = array[start] - array[end];
			array[start] = array[start] - array[end];
			start++;
			end--;
		}
		System.out.println("Reveresed Array is : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	
	//Check string uppercase and lowercases
	public void checkCase(String str) {
		int uppercase = 0;
		int lowercase = 0;
		int whitespace = 0;
		
		ArrayList<Character> upper = new ArrayList<>();
		ArrayList<Character> lower = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				uppercase++;
				upper.add(c);
			}else if(Character.isWhitespace(c)) {
				whitespace++;
			}else {
				lowercase++;
				lower.add(c);
			}
		}
		System.out.println("Total Uppercase  " + uppercase + upper);
		System.out.println("Total Lowercase : " + lowercase + lower);
		System.out.println("Whitespace : " + whitespace);
	}
	
	//Reverse the string
	public void reverseString(String str) {
		String result = new String();
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			result += c;
		}
		System.out.println("Reversed String : " + result);
	}
	
	public void removeWhiteSpace(String str) {
		int count = 0;
		String result = new String();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isWhitespace(c)) {
				count++;
			}else {
				result += c;
			}
		}
		System.out.println("String after removing white spaces : " + result);
		System.out.println("Count of White Spaces : " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo obj = new Demo();
//		System.out.println("----Array Programs----");
//		
//		System.out.println("Enter the size of array :");
//		int size = sc.nextInt();
//		
//		int [] array = new int[size];
//		System.out.println("Enter the array elements : ");
//		for(int i = 0; i < size; i++) {
//			array[i] = sc.nextInt();
//		}
//		
//		obj.reverseArray(array);
		
		String str = " D ip ak";
		obj.checkCase(str);
		obj.reverseString(str);
		obj.removeWhiteSpace(str);

	}

}
