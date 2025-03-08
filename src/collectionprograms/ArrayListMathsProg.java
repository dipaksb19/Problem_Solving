package collectionprograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListMathsProg {
	
	// Checking armstrong or not
	public void armstrongList(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			
			Integer num = list.get(i);
			int temp1 = num;
			int temp2 = num;
			int flag = 0;
			
			while(temp1 != 0) {
				flag++;
				temp1 = temp1 / 10;
			}
		
			int result = 0;
			while(temp2 != 0) {
				int digit = temp2 % 10;
				
				int mul = 1;
				for(int j = 1; j <= flag; j++) {
					mul = mul * digit;
				}
				result = result + mul;
				temp2 = temp2 / 10;
			}
			
			if(result == num) {
				System.out.println(num + " is a Armstrong Number");
			}else {
				System.out.println(num + " is Not Armstrong Number");
			}
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println("\t ----ArrayList Maths Program----");
		Scanner sc = new Scanner(System.in);
		ArrayListMathsProg obj = new ArrayListMathsProg();
		
		List<Integer> list = new ArrayList<Integer>();
		
		// Inserting elements by loop
		System.out.println("Insert Elements : ");
		for(int i = 0; i <= 10; i++) {
			Integer num = 0;
			list.add(i, num = sc.nextInt());
		}
		System.out.println(list);
		
		obj.armstrongList(list);

	}

}
