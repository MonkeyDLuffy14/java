import java.util.Scanner;
class ForExample{
	
	public void calc(int s){
		for(int i=1; i<=10; i++){
			System.out.println(s + " x "+ i +" = "+ (s*i)); 
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		ForExample obj = new ForExample();
		obj.calc(n);
	}
}