package arrayprograms;
import java.util.Scanner;
public class MaxElementOfArray {

	public static void main(String[] args) {
		System.out.println("\t---Fid the max element from array---");
		Scanner sc = new Scanner(System.in);
		
		 //int num [] = {1,2,8,25,10,4,15};
		int num[] = new int[10];
		 int max = 0;
		 
		 System.out.println("Enter numbers in Array : ");
		 for(int i = 0; i< num.length; i++) {
			 System.out.println("Enter the number : ");
			 num[i] = sc.nextInt();
		 }
		 for(int i = 0; i< num.length; i++){
			 if(num[i] > max) {
				 max = num[i];
			 }
		 }
		 System.out.println("Maximum Element is : "+ max);

	}

}
