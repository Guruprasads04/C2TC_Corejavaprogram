package entityclassassignment2;

public class productDetails {

	public static void main(String[] args) {
		 product p=new product();
		    p.setPid(101);
	    	p.setItem("brush");
			p.setPrice("15"); 
			
			System.out.println("customer id :"+p.getPid());
			System.out.println(" item :"+p.getItem());
			System.out.println(" price :"+p.getPrice());
			System.out.println(p); 
	}

}
