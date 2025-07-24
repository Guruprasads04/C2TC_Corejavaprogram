package dayfour.sec_package;
import dayfour.first_package.*;
public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.methodPublic();
		b1.varPublic = 80;
		b1.methodPublic();		

	}

}
