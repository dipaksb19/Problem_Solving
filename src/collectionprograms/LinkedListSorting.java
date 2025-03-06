package collectionprograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSorting {
	
	
	// Function to sort linked list
	
	public List<Integer> sort(List<Integer> list){
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					list.set(i, list.get(i) + list.get(j));
					list.set(j, list.get(i) - list.get(j));
					list.set(i, list.get(i) - list.get(j));
				}
			}
		}
		
		return list;
		
	}
	
	
	//Prime Number Program In list
	
	public List<Integer> primeNumber(List<Integer> list){
		List<Integer> result = new LinkedList<>();
		for(int i = 0; i < list.size(); i++) {
			Integer ele = list.get(i);
			int flag = 0;
			for(int j = 2; j < ele; j++) {
				
				if(ele % j == 0) {
					flag++;
				}
			}
			
			if(flag == 0) {
				result.add(list.get(i));
			}
		}
		System.out.println("Prime Number list is : ");
		return result;
		
	}
	

	//Max and Min of Linked List
	public void maxMin(List<Integer> list){
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
			
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		
		System.out.println("Maximum Element : " + max);
		System.out.println("Minimum Element : " + min);
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("----Sorting with Linked List----");
		LinkedListSorting obj = new LinkedListSorting();
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(2);
		list.add(5);
		list.add(100);
		list.add(7);
		list.add(40);
		list.add(111);
		
		System.out.println("Original Linked List : " + list);
		
		//System.out.println("After Sorting : " + obj.sort(list));
		
		//System.out.println(obj.primeNumber(list));
		
		obj.maxMin(list);

	}

}
