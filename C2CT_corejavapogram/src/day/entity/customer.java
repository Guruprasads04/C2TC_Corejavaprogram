package day.entity;

public class customer {
	
	private int cid;
	private String cname;
	private String city;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

		
	

}
