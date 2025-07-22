package entityclassassignment2;

public class productDetails {

	public static void main(String[] args) {
		    product p1=new product();
		    p1.setPid(101);
	    	p1.setItem("brush");
			p1.setPrice("15"); 
			
			System.out.println("customer id :"+p1.getPid());
			System.out.println(" item :"+p1.getItem());
			System.out.println(" price :"+p1.getPrice());
			System.out.println(p1); 
			
			
	  
	        product p2=new product();
		    p2.setPid(102);
	    	p2.setItem("toothpaste");
			p2.setPrice("30"); 
			
			System.out.println("customer id :"+p2.getPid());
			System.out.println(" item :"+p2.getItem());
			System.out.println(" price :"+p2.getPrice());
			System.out.println(p2); 
			
			
			product p3=new product();
			p3.setPid(103);
	    	p3.setItem("biscuit");
			p3.setPrice("40"); 
			
			System.out.println("customer id :"+p3.getPid());
			System.out.println(" item :"+p3.getItem());
			System.out.println(" price :"+p3.getPrice());
			System.out.println(p3);  
	}

}
