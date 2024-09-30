package comparablecomparatorcodedecode;

import java.util.Arrays;

public class whycomparableandcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {5,9,1,10};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(5, "John");
		empArr[1] = new Employee(9, "Amit");
		empArr[2] = new Employee(10, "Paul");
		empArr[3] = new Employee(1, "Ame");
		
		Arrays.sort(empArr, Employee.NameComparator);
		
		System.out.println(Arrays.toString(empArr));

	}

}
