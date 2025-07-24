package dayfive.hierarchicalinheritance;

public class Hierachical_INTDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("GURU", "PONDY");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("NARUTO", "LEAF-VILLAGE", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Adarsh patel", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	

	}

}
