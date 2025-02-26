package practice;

public class Demo {

	public static void main(String[] args) {
		System.out.println("---Demo for Pratiti---");
		
		String str = "Dipak";
		int flag = 0;
		//finding substrings
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				System.out.println();
				flag++;
			}
		}
		
		System.out.println(flag);

	}

}
