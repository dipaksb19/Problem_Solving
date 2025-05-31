package practice;

public class ArrayPrograms {
	
	public void checkDuplicate(int [] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		
		int flag = 1;
		int index = 0;
		System.out.println("Repeated elements are : ");
		for(int i = 1; i < array.length; i++) {
			if(array[i - 1] == array[i]) {
				index = i;
				flag++;
			}
			else if(flag != 1) {
				System.out.print(array[index] + " ");
				System.out.println("- Repeatation : " + flag);
				flag = 1;
				index = 0;
			}
		}
	}

	public static void main(String[] args) {
		ArrayPrograms obj = new ArrayPrograms();
		System.out.println("----Array Programs----");
		int [] array = {1,2,3,2,4,3,5,6,7,8,7,6,7,7,3};
		obj.checkDuplicate(array);
		

	}

}
