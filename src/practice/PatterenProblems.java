package practice;

public class PatterenProblems {
	
	public void starPatternFirst() {
		System.out.println("1) Fisrt Star Pattern\n");
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
	public void starPatternTwo() {
		System.out.println("\n2) Second Star Pattern\n");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 10; j >= 1 + i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void starPatternThree() {
		System.out.println("\n3) Third Star Pattern\n");
		int flag = 9;
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j >= flag) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			flag--;
			System.out.println();
		}
	}
	
	public void starPatternFour() {
		System.out.println("\n4) Fourth Star Pattern\n");
		int flag = 1;
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j >= flag) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			flag++;
			System.out.println();
		}
	}
	
	public void starPatternSquare() {
		System.out.println("\n5) Fifth Star Pattern\n");
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(i == 1 || i == 9) {
					System.out.print("* ");
				}else if(j == 1 || j == 9) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void starDiamond() {
		
		System.out.println("\n6) Star Diamonds\n");
		
		int left = 5;
		int right = 5;
		for(int i = 1; i < 10; i++) {
			if(i<= 4) {
				for(int j = 1; j < 10; j++) {
					if(j >= left && j <= right) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
				left--;
				right++;
			}
			if(i>=5){
				for(int j = 1; j < 10; j++) {
					if(j >= left && j <= right) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
				
				left++;
				right--;
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\t ----Patteren Problems----\n");
		
		PatterenProblems obj = new PatterenProblems();
		obj.starPatternFirst();
		obj.starPatternTwo();
		obj.starPatternThree();
		obj.starPatternFour();
		obj.starPatternSquare();
		obj.starDiamond();

	}

}
