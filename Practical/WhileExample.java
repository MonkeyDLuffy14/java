import java.util.Scanner;
class WhileExample{
	
	public void calc(int s){
		int i=1;
		while(i<=10){
			System.out.println(s + " x "+ i +" = "+ (s*i)); 
			i++;
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