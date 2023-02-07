class Animal{ //parent class
	
	void bark()  //non static method
	{
		System.out.println("Animal Is Barking");
	}
}

class Dog extends Animal{   //child class
	void bark(){            //method overrided
		System.out.println("Dog is Barking");
	}
}


class OverridingExample{
	public static void main(String args[]){
		Dog d = new Dog();
		d.bark();          //override bark method
		
		Animal a = new Animal();
		a.bark();         //dynamic dispatch
	}
}
