package collectionpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
public class LinkedListPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListPrograms obj = new LinkedListPrograms();
		System.out.println("----Linked List Program Practice----");
		
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(8);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(4);
		
		System.out.println("List is : " + list);

		Iterator<Integer> iterator = list.iterator();
		Integer num = 5;
		while(iterator.hasNext()) {
			System.out.println("Element : " + iterator.next());
			if(iterator.next() == num) {
				list.remove(iterator);
			}
			
		}
		
//		for(int i = 0; i < 5; i++){
//			if(list.get(i) > 5) {
//				System.out.println(list.get(i));
//			}
//		}

	}

}
