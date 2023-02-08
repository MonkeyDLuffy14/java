
/*declare enum outside main class
enum Day  
{ 
   SUNDAY,
   MONDAY,
   TUESDAY,
   WEDNESDAY,
   THURSDAY,
   FRIDAY,
   SATURDAY;   
}*/
class EnumExample{
	enum Day  
	{ 
	   SUNDAY,
	   MONDAY,
	   TUESDAY,
	   WEDNESDAY,
	   THURSDAY,
	   FRIDAY,
	   SATURDAY;  
       Day()
       {
           System.out.println("I am the Private Constructor of Enum ");
       }		
	}
	public static void main(String args[]){
		Day d1=Day.THURSDAY;
		System.out.println(d1);
		System.out.println("Value of Tudesday is "+Day.valueOf("TUESDAY"));
		System.out.println("Index of Tudesday is "+Day.valueOf("TUESDAY").ordinal());
		for( Day d:Day.values()){
			System.out.println(d);
		}
	}
}