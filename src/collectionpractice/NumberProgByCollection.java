package collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class NumberProgByCollection {

	//Prime Number Function
	public void checkPrime(List<Integer> list) {
		
		for(int j = 0; j < list.size(); j++){
			int flag = 0;
			Integer num =   list.get(j);
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					flag++;
				}
			}
			if(flag == 0) {
				System.out.println("Number is Prime : " + num);
			}else {
				System.out.println("Number is Not Prime : " + num);
			}
		}
	}

	
	// Armstrong Number
	public void checkArmstrong(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			Integer num = list.get(i);
			Integer temp1 = num;
			Integer temp2 = num;
			int length = 0;
			while(temp1 != 0) {
				length++;
				temp1 = temp1 / 10;
			}
			
			Integer result = 0;
			while(temp2 != 0) {
				Integer digit = temp2 % 10;
				Integer mul = 1;
				for(int j = 1; j <= length; j++) {
					mul = mul * digit;
				}
				result = result + mul;
				temp2 = temp2 / 10;
			}
		
			if(result.equals(num)) {
				System.out.println("The " + num + " is Armstrong Number");
			}else {
				System.out.println("The " + num + " is Not Armstrong Number");
			}
		}
	}
	
	public void checkPalindrome(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			Integer num = list.get(i);
			Integer temp1 = num;
			Integer temp2 = num;
			Integer result = 0;
			while(temp1 != 0) {
				Integer digit = temp1 % 10;
				result = result * 10 + digit;
				temp1 = temp1 / 10;
			}
			
			if(result.equals(num)) {
				System.out.println("The " + num + " is Palindrome Number");
			}else {
				System.out.println("The " + num + " is Not Palindrome Number");
			}
		}
	}
	
	
	public static void main(String[] args) {
		NumberProgByCollection obj = new NumberProgByCollection();
		System.out.println("----Prime Number by collection----");
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(717);
		list.add(371);
		list.add(90);
		list.add(153);
		list.add(161);
		list.add(100);
		
		System.out.println("Original List is : " + list);
		obj.checkPrime(list);
		
		System.out.println("Armstrong Numbers : ");
		obj.checkArmstrong(list);
		
		System.out.println("Palindrome Numbers : ");
		obj.checkPalindrome(list);
//		System.out.println("numbers : ");
//		for(Integer num : list) {
//			obj.checkPrime(num);
//		}
		
	
		
		
		
		

	}

}
