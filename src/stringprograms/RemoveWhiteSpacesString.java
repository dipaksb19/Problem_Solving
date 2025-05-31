package stringprograms;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
		
		String str = "  Di pak Bh i  de ";
		System.out.println(str);
		
		String newstr = str.trim(); // it is used to remove starting and ending white spaces of the string
		
		System.out.println(newstr);
		
		String newstr2 =  str.replaceAll("\\s", ""); // by using unicode of space we are replacing 
		System.out.println(newstr2);
		
		
		

	}

}
