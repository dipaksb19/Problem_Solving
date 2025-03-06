package collectionprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorting {
	
	//by function sorting list its working
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

	public static void main(String[] args) {
		ArrayListSorting obj = new ArrayListSorting();
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(10);
		list.add(2);
		list.add(20);
		list.add(50);
		list.add(12);
		list.add(100);

		System.out.println("Original List : " + list);
//		
//		for(int i = 0; i < list.size(); i++) {
//			for(int j = i + 1; j < list.size(); j++) {
//				if(list.get(i) > list.get(j)) {
//					list.set(i, list.get(i) + list.get(j));
//					list.set(j, list.get(i) - list.get(j));
//					list.set(i, list.get(i) - list.get(j));
//				}
//			}
//		}
		
		obj.sort(list);
		System.out.println("List after Swap : " + obj.sort(list));
	}

}
