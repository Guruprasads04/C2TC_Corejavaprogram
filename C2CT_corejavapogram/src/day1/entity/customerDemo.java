package day1.entity;

public class customerDemo {

	public static void main(String[] args) {
		customer c1=new customer();
		c1.setCid(101);
		c1.setCname("GURU");
		c1.setCity("CHENNAI"); 
		System.out.println("customer id :"+c1.getCid());
		System.out.println("customer name :"+c1.getCname());
		System.out.println("customer city :"+c1.getCity());
		System.out.println(c1);
		
		customer c2=new customer();
		c2.setCid(101);
		c2.setCname("GURU");
		c2.setCity("CHENNAI");
		System.out.println(c2);
		
	}

}
