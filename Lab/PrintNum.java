//Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.
class PrintNum{ //open new class
	
	public void display(){  //non static method
		System.out.println("Number between (1-100) divisble by 5 and greater then 40: "); 
		for(int i=1; i<=100; i++){  //iterate num between 1 to 100
			if(i%5==0 && i>=40){    //condition to check number
				System.out.print(" "+i);
			}
		}
	}
	public static void main(String args[]){
		PrintNum obj = new PrintNum(); //create object
		obj.display(); //invoke object
	}
}