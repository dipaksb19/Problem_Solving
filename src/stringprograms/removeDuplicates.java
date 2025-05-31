package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		System.out.println("\t----Remove Duplicate Characters From String----");
		String str = "Programming";
		
		
		//Approch - 1 - Using Java 8
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println("After Removing Duplicates : " + sb1);
		
		//Approch - 2 - Using IndexOf method provided by string class
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			int idx = str.indexOf(ch, i+1);
			if(idx == -1) {
				sb2.append(ch);
			}
		}
		System.out.println("After Removing Duplicates : " + sb2);
		
		//Approch - 3 - Using character array to remove duplicates
		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			boolean repated = false;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					repated = true;
					break;
				}
			}
			if(!repated) {
				sb3.append(arr[i]);
			}
		}
		System.out.println("After Removing Duplicates : " + sb3);
		
		// Approch - 4 - by using set interface
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for(int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(Character c : set) {
			sb4.append(c);
		}
		System.out.println("After Removing Duplicates : " + sb4);

	}

}
