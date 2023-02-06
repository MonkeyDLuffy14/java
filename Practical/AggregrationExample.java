class Idproof{
	int inum;
	String city;
	String state;
	int pincode;
	String dob;

        	Idproof(int inum, String city, String state, int pincode,String dob){
				this.inum = inum;
				this.city = city;
				this.state = state;
				this.pincode = pincode;
				this.dob = dob;
		 }
}

class Student {
	int id;
	String name;
	String emailid;
	long contact;
	Idproof idp;  //has a relationship ,  gave an reference of Idproof class
	
	Student(int id,String name, String emailid,long contact,Idproof idp){
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.contact = contact;
		this.idp = idp;
	}
	public void show(){
		System.out.println(id+""+name+""+emailid+""+contact);
		System.out.println(idp.inum+""+idp.city+""+idp.state+""+idp.pincode+""+idp.dob);
	}
}

class AggregrationExample{
	public static void main(String args[]){
		
		Idproof i = new Idproof(101,"mumbai","mh",87656,"22-2-12");
		Idproof i1 = new Idproof(101,"hyd","hy",6789,"21-1-11");
		Idproof i2 = new Idproof(101,"delhi","ncr",2347,"12-5-13");
		
		Student s = new Student(1,"ram","ram@gmail.com",987656789,i);
		Student s1 = new Student(2,"jam","jam@gmail.com",345666789,i1);
		Student s2 = new Student(3,"sham","sham@gmail.com",345676789,i2);
		
		s.show();
		s1.show();
		s2.show();
		
	}
}
