import java.util.Scanner; //import Scanner class from package util
class ConditionalExample{
	
	public void calc(int age){ //non static method
		if(age>=0 && age<=20){  //1st condition
			System.out.println("Age Group 0-20");
		}
		else if(age>=21 && age<=50){  //2nd condition
			System.out.println("Age Group 21-50");
		}
		else if(age>=51 && age<=80){  //3rd condition
			System.out.println("Age Group 51-80"); //3rd Condition
		}
		else{  //if all false then this
			System.out.println("Age is above 80");
		}
			
	}
	public void grade(int x){
		if(x>90 && x<100){
			System.out.println("Grade :A");
		}
		else if(x>75 && x<90){
			System.out.println("Grade :B");
		}
		else if(x>55 && x<75){
			System.out.println("Grade :C");
		}
		else if(x>35 && x<55){
			System.out.println("Grade :D");
		}
		else if(x<35 && x>0){
			System.out.println("Grade :Fail !!!");
		}
		else{
             System.out.println("Enter Proper Input");			
		}
	}

	
public static void main(String args[]){
	ConditionalExample obj=new ConditionalExample();  //create object 
	Scanner sc = new Scanner(System.in);   //create Scanner object
	System.out.println("Enter Your Age: ");
	int age = sc.nextInt();
	obj.calc(age); //invoke object
	System.out.println("Enter Your Marks :");
	int mark = sc.nextInt();
	obj.grade(mark);
	}
}
