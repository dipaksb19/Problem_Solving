package tableofanynumber;
// program to print table
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		System.out.println("---Table---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		System.out.println("Table :");
		for(int i = 1; i <= 10; i++) {
			int mul = num * i;
			System.out.println(mul);
		}
	}

}
