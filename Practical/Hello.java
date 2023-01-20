class My{
	public static void display(){ //static method
		System.out.println("Hi...");
	}
}
class Hello{ //start of main class
  public static void main(String args[]){
        System.out.println("Hello World");
		My.display();
	  }
}//end of main class