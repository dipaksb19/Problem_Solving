package numbersproblem;
// This class is for revising and practicing the problem of this package
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		System.out.println("---Finding Maximum Element of Array---");
		
		int array [] = {1,100,3,4,515,45,6,7,8,93,10};
		
		int max = 1;
		int second = 0;
		for(int i = 0; i < array.length; i++) { 
			
			if(array[i] > max) {
				
				max = array[i];
			}
			
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] > second && second < max) {
				second = array[i];
				
			}
		}
		System.out.println("Greater number is :" + max);
		System.out.println("Second greater : " + second);
		
	}
}
