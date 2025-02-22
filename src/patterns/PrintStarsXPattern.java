package patterns;

public class PrintStarsXPattern {

	public static void main(String[] args) {
		System.out.println("---Printing Start's X---");
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 1) {
					System.out.print("* ");
				}else if(j == 9) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
