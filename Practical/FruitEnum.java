
enum Fruits
{
	APPLE,
	BANANA,
	CHERRY,
	MANGO;
}

class FruitEnum{
	public static void main(String args[]){
		Fruits fru=Fruits.MANGO;
		switch(fru){
			case APPLE:System.out.println("I am Apple");
			           break;
					   
			case BANANA:System.out.println("I am Banana");
			           break;
					   
			case CHERRY:System.out.println("I am Cherry");
			           break;
					   
			case MANGO:System.out.println("I am Mango");
			           break;
					   
		}
	}
}