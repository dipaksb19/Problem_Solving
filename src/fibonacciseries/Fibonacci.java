package fibonacciseries;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("---Fibonacci Series---");
		int num1 = 1;
		int num2 = 1;
		int add = 0;
		System.out.println(add);
		System.out.println(num1);
		for(int i = 1; i <= 10; i++) {
			add = num1 + num2;
			System.out.println(add);
			num2 = num1;
			num1 = add;
			
		}

	}

}
