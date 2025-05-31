package stringprograms;

public class RemoveSpecialChar {
	// input : $ja!va$&st%ar
	// Output : javastar

	public static void main(String[] args) {
		
		String str = "$ja!va$&st%ar";
		
		//Approch - 1 (replaceAll() Method)  regular expression
		String newstr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newstr);
		
		
		
	}

}
