package daythree.assignment2;

public class Commission {
	public void commissioncalc(Members m1) {
		if(m1.getSmt() < 30000) {
			m1.setCom(0);
			System.out.println("have a gud day,No Commission");
		
		}
		else {
			if(m1.getSmt() >= 100000) {
				m1.setCom(m1.getSmt() * 10/100);
		    }
			if(m1.getSmt() >= 50000 && m1.getSmt() < 100000) {
				m1.setCom(m1.getSmt() * 5/100);
			}
			if(m1.getSmt() >=30000  && m1.getSmt() <50000) {
				m1.setCom(m1.getSmt() * 3/100);
			}
		}
		
	}

}
