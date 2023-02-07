class RBI{
    int getInterestRate()
	{
	     return 0;
	}
}
class SBI extends RBI{
	int getInterestRate()
	{
	     System.out.println("Interest_Rate: 9");
		 return 9;
	}
}
class PNB extends RBI{
	int getInterestRate()
	{
	    System.out.println("Interest_Rate: 10");
		return 10;
	}

}
class ICICI extends RBI{
	int getInterestRate()
	{
	    System.out.println("Interest_Rate: 12");
		return 12;
	}
}

class ExampleOverride{
	public static void main(String args[]){
		SBI sbi = new SBI();
		sbi.getInterestRate();
		
		PNB pnb=new PNB();
		pnb.getInterestRate();
		
		ICICI ic=new ICICI();
		ic.getInterestRate();
	}
}