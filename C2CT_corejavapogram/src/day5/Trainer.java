package day5;

public class Trainer extends Person{
	private String session;
	private String desigmn;
	private String batchno;
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trainer( int pid, String name, String city,String session, String desigmn, String batchno) {
		super(pid,name,city);
		this.session = session;
		this.desigmn = desigmn;
		this.batchno = batchno;
	}

	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesigmn() {
		return desigmn;
	}
	public void setDesigmn(String desigmn) {
		this.desigmn = desigmn;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	@Override
	public String toString() {
		return "Trainer [trainer id: "+super.getPid() +" ,trainer name:"+super.getName()+" ,trainer city:"+super.getCity()+ ", session: "+ session + ", desigmn: " + desigmn + ", batchno: " + batchno + "]";
	}
	

	

}
