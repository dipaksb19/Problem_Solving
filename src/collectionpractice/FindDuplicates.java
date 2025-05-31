package collectionpractice;

import java.util.LinkedList;

public class FindDuplicates {
	public void findDuplicates(LinkedList<Integer> list) {
		LinkedList<Integer> result = new LinkedList<>();
		int flag = 1;
		Integer num = 0;
		int exist = 0;
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					for(int k = 0; k < result.size(); k++) {
						if(list.get(i) == result.get(k)) {
							exist++;
							break;
						}
					}
					if(exist == 0) {
						num = list.get(i);
						flag++;
					}
					exist = 0;
				}
			}
			if(num != 0) {
				result.add(num);
				System.out.println(num + "=  Repeated " + flag + " Times");
				num = 0;
				flag = 1;
			}		
		}
	}

	public static void main(String[] args) {
		System.out.println("\n----Finding Duplicates----");
		
		FindDuplicates obj = new FindDuplicates();
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(10);
		list.add(1);
		list.add(8);
		list.add(100);
		list.add(70);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		
		System.out.println("Original List : \n" + list);
		obj.findDuplicates(list);
		

	}

}
