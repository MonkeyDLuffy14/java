
class Car{
	public void display(){
		System.out.println("Parent class: Car");
	}
}
class Type extends Car{
	public void model(){
		System.out.println("Car type: Maruti");
	}
}

class Engine extends Type{
	public void print(){
		System.out.println("Engine: V8bjs2");
	}
}
class MultilevelExample{
	public static void main(String args[]){
	Engine e=new Engine();
	e.display();
	e.model();
	e.print();
}
}