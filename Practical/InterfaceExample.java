
interface Vehicle
{
	String name="Pulsar_Bike";
	void ride();
	default void sell()
	{
		System.out.println("default method");
	}
	static void repair()
	{
		System.out.println("static method");
	}
}
class Bike implements Vehicle
{
	public void ride()
	{
		System.out.println("Riding..!!");
	}
}


class InterfaceExample{
	public static void main(String[] args){
		Vehicle v = new Bike();
		v.ride();
		v.sell();
		Vehicle.repair();
	}
}