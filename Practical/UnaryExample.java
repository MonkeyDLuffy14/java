class UnaryExample{
	
	public void calcIncrement(){
		int x = 10;              //print //x
		System.out.println("x++ :"+ x++); //10      11
		System.out.println("x++ :"+ x++); //11      12
		System.out.println("++x :"+ ++x); //13      13
		System.out.println("++x :"+ x++); //13      14
		System.out.println("x :"+x);   //14      14
		
	}
	
	public void calcDecrement(){
		int x = 10;              //print   //x
		System.out.println("x-- :" +x--); //10        9
		System.out.println("x-- :" +x--); //9         8
		System.out.println("--x :" +--x); //7         7
		System.out.println("--x :" +--x); //6         6
		System.out.println("x-- :" +x--); //6         5
		System.out.println("x :" +x);   //5
	}
	
	public static void main(String args[]){
		UnaryExample id = new UnaryExample(); //object cration
		id.calcIncrement();//invoke the object
		id.calcDecrement();//invoke the object
		
	}
}