package arrayprograms;

public class PracticeArray {
	int i = 0;
	int min = Integer.MAX_VALUE;
	
	 int min(int [] arr) {
		if(i == arr.length - 1) {
			return min;
		}else {
			if( min > arr[i]) {
				min = arr[i];	
			}
			i++;
			min(arr);
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("---Array Programs---");
		PracticeArray obj = new PracticeArray();
		int [] arr = {23,45,78,9,12,4567,2,55};
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					arr[i] = arr[i] + arr[j];
//					arr[j] = arr[i] - arr[j];
//					arr[i] = arr[i] - arr[j];
//				}
//			}
//		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("-----------");
		System.out.print("Minimum : " + obj.min(arr));
		

	}

}
