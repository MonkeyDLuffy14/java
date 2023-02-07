class OverloadingExample{
	
	
	public void add(int x,int y){
		System.out.println("Addition of int: "+ x+y);
		
	}
	public void add(float x,float y){
		System.out.println("Addition of int: "+ x+y);
	}
	
	public static void(String args[]){
		OverloadingExample obj = new OverloadingExample();
		obj.add(2,3);
		obj.add(2.3,4.3);
	}
}