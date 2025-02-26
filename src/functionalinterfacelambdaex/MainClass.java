package functionalinterfacelambdaex;

public class MainClass {

	public static void main(String[] args) {
		Employee employee = () -> "Dipak Bhide";
		
		//calling 
		System.out.println(employee.getName());

	}

}
