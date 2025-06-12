package collectionpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySortingArrayList {
	
	//List Sorting in ascending order
	public void sortAsc(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					list.set(i, list.get(i) + list.get(j));
					list.set(j, list.get(i) - list.get(j));
					list.set(i, list.get(i) - list.get(j));
				}
			}
		}
		System.out.println("ASC Sorted list is : " + list);
	}
	
	//LinkedList Descending order sorting
	public void sortDesc(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) < list.get(j)) {
					list.set(i, list.get(i) + list.get(j));
					list.set(j, list.get(i) - list.get(j));
					list.set(i, list.get(i) - list.get(j));
				}
			}
		}
		System.out.println("DESC Sorted list is : " + list);
	}

	public static void main(String[] args) {
		ArraySortingArrayList obj = new ArraySortingArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("----Array Sorting by Collections ArrayList----");
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the list elements : ");
		for(int i = 0; i < 8; i++) {
			list.add(i, sc.nextInt());
		}
		System.out.println("Input List is : " + list);
		
		obj.sortAsc(list);
		obj.sortDesc(list);

	}

}
