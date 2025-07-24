package dayfour.first_package;

public class Base {
		int varDefault=2;
		public int varPublic=4;
		private int varPrivate=6;
		protected int varProtected=7;
		void methodDefault()
		{
			System.out.println("Default access Base class");
			System.out.println("Default Variable : "+varDefault);
		}
		
		public void methodPublic()
		{
			System.out.println("Public access Base class");
			System.out.println("Public Variable : "+varPublic);
		}
		
		private void methodPrivate()
		{
			System.out.println("Private access Base class");
			System.out.println("Private Variable : "+varPrivate);
		}
		
		protected void methodProtected()
		{
			System.out.println("Protected access Base class");
			System.out.println("Protected Variable : "+varProtected);
		}
	}

