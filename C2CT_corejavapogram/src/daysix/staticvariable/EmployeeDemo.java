package daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e = new Employee("GURU", 150);
		System.out.println(e);
		
		e = new Employee("praveen", 321);
		System.out.println(e);

	}

}
