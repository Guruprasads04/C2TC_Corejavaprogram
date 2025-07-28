package day7.Polymorphism;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PLtraining p1=new PLtraining();
		p1.session("Full stack developer");
		p1=new JFS();
		p1.session("method overriding");
		p1=new python();
		p1.session("method overriding");
		
	}

}
