import java.util.Scanner;
class UseDelimiterExample{
	public static void main(String args[]){
		/*Scanner sc=new Scanner("Ramesh is a bad booy");
		sc.useDelimiter("is");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}*/
		Scanner s=new Scanner("Ramesh  is a  bad booy");
		s.useDelimiter("\\s");
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}
}