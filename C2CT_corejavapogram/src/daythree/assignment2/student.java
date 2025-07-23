package daythree.assignment2;
import java.util.*;

public class student {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		
		System.out.println("Enter the name :");
		String name=S.next();
		System.out.println("Enter the Address :");
		String address=S.next();
		System.out.println("Enter the phone number :");
		int phone=S.nextInt();
		System.out.println("Enter the Sales Amount :");
		int smt=S.nextInt();
		
		Members m1= new Members();
		m1.setName(name);
		m1.setAddress(address);
		m1.setPhone(phone);
		m1.setSmt(smt);
		System.out.println(m1);
		
		Commission c1=new Commission();
		c1.commissioncalc(m1);
		if(m1.getCom()!=0.0) {
		System.out.println("after commission");
		System.out.println(m1);
		}
	}

}
