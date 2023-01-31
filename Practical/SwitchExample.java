import java.util.Scanner;

class SwitchExample{
	
	public void calc_grade(String grade){
		switch(grade){
			
		case "A":
		System.out.println("100-80");
		break;
		
		case "B":
		System.out.println("80-60");
		break;
		
		case "C":
		System.out.println("60-40");
		break;
		
		case "D":
		System.out.println("40-35");
		break;
		
		case "F":
		System.out.println("FAIL...35-0");
		break;
		
		default:
		System.out.println("Error...Invalid");
		}
	}
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Grade: ");
			String grade = sc.next();
			grade  = grade.toUpperCase();
			SwitchExample obj = new SwitchExample();
			obj.calc_grade(grade);
			
		}
	}
	
