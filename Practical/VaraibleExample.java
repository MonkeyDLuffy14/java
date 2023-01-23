class VaraibleExample{
	
	static int num = 55; //static
	long num1 = 7887654; //instance
	public void display(){ //nonstatic method
		char a = 'M'; //local
		double num2 = 45.355;
		System.out.println("local variable value : " +a);// printing local variable
		System.out.println("local variable value : " +num2);
		
	}
	
	public static void calc(){
		double a = 29.3;
		double b = 35.2;
		double res = a*b;
		System.out.println("Result is : " +res);
	}
	
	public static void main(String args[]){
		VaraibleExample obj = new VaraibleExample(); //object creation
		obj.display(); //invoke nonstatic method with obj
		calc(); //invoke static method
		System.out.println("Instance variable value : " + obj.num1); //calling instance variable
		System.out.println("Static variable value : " +VaraibleExample.num); //calling static variable
		
	}
	

}