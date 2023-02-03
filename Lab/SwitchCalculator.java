import java.util.Scanner; //importing Scanner class
class SwitchCalculator{ //open new class
	
	public void calc(int a,int b,int x){  //non static method
		int n = a;
		int m = b;
		
		switch(x){  //switch condition
			case 1:
			System.out.println("Addition of two Number: "+ (a+b));
			break;
			
			case 2:
			int s = 0;
			if(a>b){
				s = a-b;
				System.out.println("Subtraction of two Number: "+ s);
			}
			else{
				s = b-a;
				System.out.println("Subtraction of two Number: "+ s);
			}
			break;
			
			case 3:
			int e = n*m;
			System.out.println("Multiplication of two Number: "+ (a*b));
			break;
			
			case 4:
			if(b==0){
				System.out.println("Denominator cannot be zero");
			}
			else{
				System.out.println("Division of two Number: "+ (a/b));
			}
			break;
			
			default:
			System.out.println("Invalid Input..!!");
		}
	}
	public static void main(String args[]){  //main entry
		Scanner sc = new Scanner(System.in);  //Scanner object
		System.out.println("Enter 1st Number: ");
		int n1=sc.nextInt();                   //taking 1st num
		System.out.println("Enter 2nd Number: ");
		int n2=sc.nextInt();                   //taking 2nd num
		System.out.println("Select Number for Your choice of Operation: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        int n3=sc.nextInt();                   //taking choice of op
        SwitchCalculator obj=new SwitchCalculator();  //class object
        obj.calc(n1,n2,n3);  //invoke a method
		
		
	}
}