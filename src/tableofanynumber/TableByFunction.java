package tableofanynumber;
// Printing the table by function
import java.util.Scanner;
public class TableByFunction {
	
	
	public void Table(int num) {
		for(int i = 1; i <=10; i++){
			int result = num * i;
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		System.out.println("---Printing the Table---x");
		Scanner sc = new Scanner(System.in);
		TableByFunction obj = new TableByFunction();
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		System.out.println("Table :");
		obj.Table(num);

	}

}
