package stringprograms;

public class StringVowelsConsonents {
	
	public void countConsonentsandVowels(String str) {
		int vowels = 0;
		int consonents = 0;
		int blank = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U' ) {
					vowels++;
				}else {
					consonents++;
				}
				
			}else if(Character.isWhitespace(c)) {
				blank++;
			}
		}
		System.out.println("Given String is : " + str);
		System.out.println("Vowels : " + vowels + ", Consonets : " + consonents + ", Blank : " + blank);
		
	}

	public static void main(String[] args) {
		StringVowelsConsonents obj = new StringVowelsConsonents();
		System.out.println("----Counting vowels and  Consonents----");
		
		//1st Way,
		String str = "Dipak Santosh Bhide";
		obj.countConsonentsandVowels(str);
		
		
		// 2nd Way to find, but is is not giving consonents in correct way
		String str1 = "Automation";
		int vowels = 0;
		int cons = 0;
		for(char c : str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c) != -1) {
				vowels++;
			}else if(Character.isLetter(c)) {
				cons++;
			}
		}
	System.out.println("VOwels : " + vowels + " ,Consonents : " + cons);

	}

}
