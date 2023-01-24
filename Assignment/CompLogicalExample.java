class CompLogicalExample{ //class opening
	
	int x = 20, y = 30, z = 17;
    
	public void comparisonOp(){ //non static method
		System.out.println("********Comparison Operator*****");
		System.out.println("x equal to y: "+ (x==y));
		System.out.println("x not equal to y: "+ (x!=y));
		System.out.println("x greater then y: "+ (x>y));
		System.out.println("x is less then y: "+ (x<y));
		System.out.println("x greater then equal to y: "+ (x>=y));
		System.out.println("x is less then equal to y: "+ (x<=y));
		System.out.println("x is eligible for driving(>18)? "+ (x>18));
		System.out.println("z is eligible for driving(>18)? "+ (z>18));
		
	}
	public void logicalOp(){  //nonstatic method
		System.out.println(" ");
	    System.out.println("********Logical Operator*****");
		System.out.println("x>y&&x<y using And Operator: "+ (x>y&&x<y));
		System.out.println("x>y&&x<y using OR Operator: "+ (x>y||x<y));
		System.out.println("Negation: "+ (!(x>y)));
		System.out.println("Bitwise And(5&7): "+ (5&7));
		System.out.println("Bitwise OR(5|7): "+ (5|7));
		
	}
	public void ternary(){
		int s = x>y?x:y;
		System.out.println("Ternary Operator");
		System.out.println("x>y?x:y ="+s);
	}
	
	public static void main(String args[]){
		CompLogicalExample obj = new CompLogicalExample();//Object creation
		System.out.println("x: "+obj.x);
	    System.out.println("y: "+obj.y);
		System.out.println("y: "+obj.z);
		obj.comparisonOp();//invoke method
		obj.logicalOp();//invoke method
		obj.ternary();//invoke method
		
	}
} //class closing