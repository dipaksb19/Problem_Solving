package collectionpractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionProg {
	
	
	
	public void sortArray(ArrayList<Integer> array) {
		int index = array.size() - 2;
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 8; j++) {
				if(array.get(i) > array.get(j)) {
					array.set(i, array.get(i) + array.get(j));
					array.set(j, array.get(i) - array.get(j));
					array.set(i, array.get(i) - array.get(j));
				}
			}
		}
		System.out.println(array);
		System.out.println("\nSecond Max of Array : " + array.get(index));
	}
	
	//Method to find repeated elements
	public void repeatedElements(LinkedList<Integer> list) {
		
		for(int i = 0; i < list.size(); i++){
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					list.set(i, list.get(i) + list.get(j));
					list.set(j, list.get(i) - list.get(j));
					list.set(i, list.get(i) - list.get(j));
				}
			}
		}
		System.out.println("Sorted list : " + list);
		dublicate(list);
	}
	
	public void dublicate(LinkedList<Integer> list) {
		LinkedList<Integer> result = new LinkedList<>();
		Integer num = 0;
		int flag = 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i - 1) == list.get(i)) {
				flag++;
				if(flag == 1) {
					num = list.get(i);
					result.add(num);
					num = 0;
				}
				
			}else {
				flag = 0;
			}
		}
		System.out.println("Dublicate Elements : "+ result);
	}

	public static void main(String[] args) {
		// Sorting by collections
		CollectionProg obj = new CollectionProg();
		System.out.println("\t----Sorting Problems in Collections----");
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(10);
		array.add(20);
		array.add(1);
		array.add(34);
		array.add(12);
		array.add(0);
		array.add(101);
		array.add(50);
		System.out.println("Entered Elements : ");
		System.out.println(array);
		
		
		System.out.println("Sorted ArrayList without using method (ASC/ DESC):");
		obj.sortArray(array);
		
		System.out.println("---------------------------------------");
		//Linked list
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(20);
		list.add(13);
		list.add(20);
		list.add(12);
		list.add(10);
		list.add(13);
		list.add(13);
		System.out.println("Entered Elements : \n" + list);
		obj.repeatedElements(list);


	}

}
