package daySeven.overriding.covarient;
import daySeven.overriding.covarient.student;

public class CovariantOverridingDemo {

	

	public class CovarinntOverridingDemo {
		public static void main(String[] args) throws CloneNotSupportedException {
			// Original student
			student student1 = new student(1, "MBA", "GURU");
			student1.printData();

			// Clone student with covariant return
			student student2 = student1.clone();
			student2.setName("Sachin");
			student2.setRollNo(2);
			student2.printData();
		}
	}

}
