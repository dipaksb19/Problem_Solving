package problemsolvingpdf1;

public class ListNodeTest {
	
	// 4) Merge Two Sorted Lists: Merge two sorted linked lists and return it as a new sorted 
	//    list.
	
	// Method to display list
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Merge Two Sorted List in the Ordered format --->");
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		
		ListNodeSolution solution = new ListNodeSolution();
		ListNode mergedList = solution.mergeTwoLists(list1, list2);
		
		System.out.println("Merged Sorted List : ");
		ListNodeTest.printList(mergedList);

	}

}
