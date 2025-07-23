package daythree.assignment2;

public class Members {
	
	private String name, address;
	private int phone, Smt;
	private double com;
	
	public double getCom() {
		return com;
	}
	public void setCom(double com) {
		this.com = com;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getSmt() {
		return Smt;
	}
	public void setSmt(int smt) {
		Smt = smt;
	}
	@Override
	public String toString() {
		return "Members [name=" + name + ", address=" + address + ", phone=" + phone + ", Sales_amt=" + Smt + ", com=" + com
				+ "]";
	}

}
