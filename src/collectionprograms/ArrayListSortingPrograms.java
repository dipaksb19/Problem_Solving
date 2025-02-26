package collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSortingPrograms {
	
	
	/*
	 * Using Collections.sort()
	 * import java.util.Collections;
		Collections.sort(list);
	   
	   
	  Using collections.reverseOrder()
	  Collections.sort(list, Collections.reverseOrder());
      
       
      Using list.sort with lambda
      list.sort((a, b) -> a - b); // Ascending
      list.sort((a, b) -> b - a); // Descending
      
      Using java streams
      List<Integer> sortedList = list.stream()
                               .sorted()
                               .toList(); // Ascending
	  decending order using stream
	  List<Integer> sortedDescending = list.stream()
                                     .sorted((a, b) -> b - a)
                                     .toList();

*/
	
	
	
	
	// Quick Sort 
	public static void quickSort(List<Integer> list, int low, int high) {
	    if (low < high) {
	        int pivotIndex = partition(list, low, high);
	        quickSort(list, low, pivotIndex - 1);
	        quickSort(list, pivotIndex + 1, high);
	    }
	}

	public static int partition(List<Integer> list, int low, int high) {
	    int pivot = list.get(high);
	    int i = low - 1;
	    for (int j = low; j < high; j++) {
	        if (list.get(j) < pivot) {
	            i++;
	            int temp = list.get(i);
	            list.set(i, list.get(j));
	            list.set(j, temp);
	        }
	    }
	    int temp = list.get(i + 1);
	    list.set(i + 1, list.get(high));
	    list.set(high, temp);
	    return i + 1;
	}
	
	
	
	
	
	// Merge Sort 
	public static void mergeSort(List<Integer> list, int left, int right) {
	    if (left < right) {
	        int mid = (left + right) / 2;
	        mergeSort(list, left, mid);
	        mergeSort(list, mid + 1, right);
	        merge(list, left, mid, right);
	    }
	}

	public static void merge(List<Integer> list, int left, int mid, int right) {
	    List<Integer> leftList = new ArrayList<>(list.subList(left, mid + 1));
	    List<Integer> rightList = new ArrayList<>(list.subList(mid + 1, right + 1));

	    int i = 0, j = 0, k = left;
	    while (i < leftList.size() && j < rightList.size()) {
	        if (leftList.get(i) <= rightList.get(j)) {
	            list.set(k++, leftList.get(i++));
	        } else {
	            list.set(k++, rightList.get(j++));
	        }
	    }

	    while (i < leftList.size()) list.set(k++, leftList.get(i++));
	    while (j < rightList.size()) list.set(k++, rightList.get(j++));
	}

	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("---- Program to sort elements in ArrayList ----");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(50);
		list.add(2);
		list.add(100);
		
		System.out.println("Original List : " +  list);
		
		
		
		System.out.println("\n\t----Merge Sort----\n");
		
		
		
		
		System.out.println("\n\t---- Quick Sort ----\n");
		// Function calling
		
		
		
		
		System.out.println("\n\t----Insertion Sort----\n");
		for (int i = 1; i < list.size(); i++) {
		    int key = list.get(i);
		    int j = i - 1;

		    while (j >= 0 && list.get(j) > key) {
		        list.set(j + 1, list.get(j));
		        j--;
		    }
		    list.set(j + 1, key);
		}
		System.out.println("(Insrtion sort) Sorted : " + list);
		
		
		
		
		
		System.out.println("\n\t ----Selection Sort----\n");
		
		for(int i = 0; i < list.size(); i++) {
			int minindex = i;
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(minindex)) {
					minindex = j;
				}
			}
			int temp = list.get(minindex);
			list.set(minindex, list.get(i));
			list.set(i, temp);
			
		}
		System.out.println(list);
		
		
			
		
		
		
		
		System.out.println("\n\t---Buble Sort---\n");
		
		// sorting without third variable 
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					list.set(i, (list.get(i) + list.get(j)));
					list.set(j, (list.get(i) - list.get(j)));
					list.set(i, (list.get(i) - list.get(j)));
				}
			}
		}
		System.out.println("( Bubble Sort ) List After Sorting without third var : " + list);
		
		System.out.println("\n-------------------------------");
		
		// Sort by loop
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					Integer temp = list.get(j);
					list.set(j, list.get(i));
					list.set( i, temp);
				}
			}
		}
		System.out.print("( Bubble Sort ) Sorted list without function is : " + list);
		
			
		
		
		System.out.println("\n-------------------------------\n");
		
		//sorting with function
		int array[] = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		Arrays.sort(array);
		System.out.print("Sorted by sort function : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		

	}

}
