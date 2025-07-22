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
			
			
	  
	        product p1=new product();
		    p1.setPid(102);
	    	p1.setItem("toothpaste");
			p1.setPrice("30"); 
			
			System.out.println("customer id :"+p1.getPid());
			System.out.println(" item :"+p1.getItem());
			System.out.println(" price :"+p1.getPrice());
			System.out.println(p1); 
			
			
			product p1=new product();
			p1.setPid(103);
	    	p1.setItem("biscuit");
			p1.setPrice("40"); 
			
			System.out.println("customer id :"+p1.getPid());
			System.out.println(" item :"+p1.getItem());
			System.out.println(" price :"+p1.getPrice());
			System.out.println(p1);  
	}

}
