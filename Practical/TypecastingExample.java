class TypecastingExample{
	
	public static void main(String args[]){
		//Widening
		int x = 890;
		long z = x; //automaitically convert int to long
		System.out.println(x);
		System.out.println(z);
		double y = x; //automaitically convert int to double
		System.out.println(y);
		
		//Narrowing
		double a = 879.45;
		int b = (int)a; //manually convert double to int
		System.out.println(a);
		System.out.println(b);
	}
}