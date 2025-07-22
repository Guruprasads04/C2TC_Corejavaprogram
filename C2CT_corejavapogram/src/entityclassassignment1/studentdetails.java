package entityclassassignment1;

public class studentdetails {

	public static void main(String[] args) {
		student s1= new student();
		s1.sid=1;
		s1.sname="guruprasad";
		s1.dept="CSE";
	    System.out.println("student details");
	    System.out.println("student id:"+s1.sid);
	    System.out.println("student id:"+s1.sname);
	    System.out.println("student id:"+s1.dept);
		
	    System.out.println("-----------------------------\n");
	    student s2= new student();
		s2.sid=7;
		s2.sname="Salman";
		s2.dept="ECE";
	    System.out.println("student details");
	    System.out.println("student id:"+s2.sid);
	    System.out.println("student id:"+s2.sname);
	    System.out.println("student id:"+s2.dept);
		
	    System.out.println("-----------------------------\n");
	    student s3= new student();
		s3.sid=4;
		s3.sname="arunbalaji";
		s3.dept="EEE";
	    System.out.println("student details");
	    System.out.println("student id:"+s3.sid);
	    System.out.println("student id:"+s3.sname);
	    System.out.println("student id:"+s3.dept);
		
	}

}
