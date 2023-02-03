//Write a program to print Left down alphabet triangle pattern using loop
import java.util.Scanner;
class PrintAlphabet{
	
	public void display(int n){
		int alpha = 64;
		for(int i=n; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print((char)(alpha+j));
			}
			System.out.println("");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows :");
		int r = sc.nextInt();
		PrintAlphabet obj = new PrintAlphabet();
		obj.display(r);
	}
}