package patterns;

public class NumberStarPattern {

	public static void main(String[] args) {
		System.out.println("---Number star Parttern----");
		int temp = 1;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j <= temp) {
					System.out.print(" " + j);
				}else {
					System.out.print(" " + "&");
				}
				
			}
			temp++;
			System.out.println();
		}
		
		
		System.out.println("----------------------------");

		
		System.out.println("----Triangle----");
		int temp2 = 1;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j == 1 || j == temp2) {
					System.out.print("* " + "");
				}else if(i == 10){
					System.out.print("* " + "");
				}else {
					System.out.print("  ");
				}
			}
			temp2++;
			System.out.println();
		}
	}

}
