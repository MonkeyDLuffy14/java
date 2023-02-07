
abstract class Shape{
	
	int width=10;
	int height=5;
	Shape(){
		
	}
	abstract void draw();
	void display()
	{
		System.out.println("Shape Non-abstract method ");
	}
}

class Triangle extends Shape{
	void draw()
	{
		System.out.println("Drawing triangle");
	}
}

class Square extends Shape{
	void draw()
	{
		System.out.println("Drawing square");
	}
}


class AbstractionExample{
	public static void main(String args[]){
		Triangle tri = new Triangle();
		Square sq = new Square();
		
		tri.draw();
		tri.display();
		
		sq.draw();
	}
}