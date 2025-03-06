package arrayprograms;

//Alternate way of finding min max

public class MinMaxByRecursion {
	// To find Minimum Value
	int i = 0;
	int min = Integer.MAX_VALUE;
	
	public void min(int [] arr) {
		if( min > arr[i]) {
			min = arr[i];	
		}
		if(i == arr.length - 1) {
			System.out.println("Minimum is : " + min);
		}else {
			i++;
			min(arr);
		}
	}

	
	//To find Maximum Value
	 int j = 0;
	 int max = Integer.MIN_VALUE;
	 
	 public void max(int arr []) {
		 if(max < arr[j]) {
			 max = arr[j];
		 }
		 if(j == arr.length - 1) {
			 System.out.println("Maximum is : " + max);
		 }else {
			 j++;
			 max(arr);
		 }
	 }
	 
	public static void main(String[] args) {
		System.out.println("---Array Programs---");
		MinMaxByRecursion obj = new MinMaxByRecursion();
		int [] arr = {23,45,78,12,1,4,55};
		System.out.println("Given Array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		obj.min(arr);
		obj.max(arr);

	}

}
