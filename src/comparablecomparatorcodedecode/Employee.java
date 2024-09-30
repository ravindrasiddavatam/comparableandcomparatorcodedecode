package comparablecomparatorcodedecode;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[id = "+ id +" ,name= "+ name + " ]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			 return e1.getName().compareTo(e2.getName());
		}
	};


}
