package collectionpractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackPrograms {

	public static void main(String[] args) {
		System.out.println("----Stack Practice Programs----");
		
		Stack<String> colors = new Stack<>();
		colors.push("Red");
		System.out.println("Colors Present in the List : " + colors);
		colors.push("White");
		System.out.println("Colors Present in the List : " + colors);
		colors.push("Blue");
		System.out.println("Colors Present in the List : " + colors);
		colors.push("Pink");
		colors.push("Voilate");
		colors.push("Green");
		System.out.println("Colors Present in the List : " + colors);
		
//		colors.pop();
//		System.out.println("Colors Present in the List : " + colors);
//		colors.pop();
//		System.out.println("Colors Present in the List : " + colors);
//		colors.pop();
//		System.out.println("Colors Present in the List : " + colors);
//		colors.pop();
//		colors.pop();
//		System.out.println("Colors Present in the List : " + colors);
		
		System.out.println("Size is : " + colors.size());
		System.out.println("Capacity is : " + colors.capacity());
		colors.push("Black");
		colors.push("Yellow");
		colors.push("purple");
		colors.push("maroon");
		
		System.out.println("Size is : " + colors.size());
		System.out.println("Capacity is : " + colors.capacity());
		
		System.out.println("---------------------------------------");
		
		List<String> sub = new LinkedList<>();
		sub.add("java");
		sub.add("Python");
		sub.add("CPP");
		sub.add("DSA");
		sub.add("Networking");
		System.out.println("Subject List : " + sub);
		System.out.println("Colors List : " + colors);
		
		colors.removeAllElements();
		System.out.println(colors.addAll(sub));
		System.out.println("Colors List elements : " + colors);
		

	}

}
