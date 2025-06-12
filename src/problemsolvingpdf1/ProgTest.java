package problemsolvingpdf1;

import java.util.HashSet;
import java.util.Set;

public class ProgTest {

	public void stringLength(String str) {
		Set<Character> set = new HashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			set.add(c);
		}
		
		System.out.println("The length of string is : " + set.size());
	}
	
	public static void main(String[] args) {
		ProgTest obj = new ProgTest();
		String str = "HelloWWorlddi";
		obj.stringLength(str);
		

	}

}
