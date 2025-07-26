package day5;

public class Student extends Person{
	private int uid;
	private String coursename;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Student [student id: "+super.getPid() +" student name:\"+super.getName()+\" ,trainer city:\"+super.getCity()+ uid=" + uid + ", coursename=" + coursename + "]";
	}
	public Student() {
		super();
	}
	public Student(int uid, String coursename) {
		super();
		this.uid = uid;
		this.coursename = coursename;
	}

	
	

}
