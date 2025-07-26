package daysix.usingfinal;

public class FinalMethodClassTest extends FinalMethodClass{
	FinalMethodClassTest()
	{
		System.out.println("This inheritance cant access declare method of other class if defined final!!");
		
	}
	
	public static void main(String[] args)
	{
		FinalMethodClassTest fmct = new FinalMethodClassTest();
		fmct.show();
	}
}
