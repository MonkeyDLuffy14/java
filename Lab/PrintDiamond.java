//Write a program to print an diamond star pattern using loop
/*  *
   ***
  *****
 *******
  *****
   ***
    *  */
class PrintDiamond{  //Open new class
	
	public void display(){  //non-static method
		int n=6;
		for(int i=1; i<=n; i++){   //upper-diamond 
			for(int k=n-i; k>=1; --k){  //for loop condition for spacing
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){  //for loop condition for printing
				System.out.print("*");
			}
		System.out.println("");
		}
		for(int i=n-1; i>=1; --i){  //lower-diamond
			for(int k=n-i; k>=1; --k){ //for loop condition for spacing
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){  //for loop condition for printing 
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	public static void main(String args[]){ //main entry
		PrintDiamond obj = new PrintDiamond(); //creation of object
		obj.display();  //invoking the object
	}
}