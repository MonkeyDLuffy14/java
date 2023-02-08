
enum TrafficSignal
{
	RED("STOP"),
	GREEN("GO"),
	YELLOW("SLOW DOWN");
	String action;
	public String getAction(){
		return action;
	}
	
	TrafficSignal(String action)
	{
		this.action = action;
	}
}


class TestEnum{
	public static void main(String args[]){
		TrafficSignal ts=TrafficSignal.YELLOW;
		System.out.println(ts.getAction());
   }	   
}