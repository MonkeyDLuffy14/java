class ArithematicExample{
	
	public void calc(){
		int a = 20;
		int b = 30;
		System.out.println("Addition: "+ (a+b));
		System.out.println("Subtraction: "+ (a-b));
		System.out.println("Multiplication: "+ (a*b));
		System.out.println("Division: "+ (a/b));
		System.out.println("Modulus: "+ (a%b));
		
	}
	public static void main(String args[]){
		ArithematicExample obj = new ArithematicExample();
		obj.calc();
	}
	
}