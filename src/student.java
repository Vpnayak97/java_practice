package vpn1;
public class student {
	String Rollno;
	String name;
	String classroom;
	String section;
	int marks;
	String gender;
	student(String Rollno,String name,String classroom,String section,int marks,String gender){
	this.Rollno=Rollno;
	this.name=name;
	this.classroom=classroom;
	this.section=section;
    this.marks=marks;
	this.gender=gender;
	}
	void display(String inputPassword) {
	    String correctPassword = "123@456"; 
	    if (correctPassword==inputPassword) {
	        System.out.println("Access granted");
	        System.out.println(Rollno + "\n" + name + "\n" + classroom + "\n" + section + "\n" + marks + "\n" + gender);
	    } else {
	        System.out.println("Access denied");
	    }
	}
	void update(String Rollno,String name) {
		this.Rollno=Rollno;
		this.name=name;
	}
	public static void main(String[] args) {
		student s1=new student("24cs182","vishnu","A03","C",500,"MALE");
		s1.display("123");
		System.out.println("After updation\n");
		s1.update("24cs181","vineeth");
		s1.display("123@456");
}
	}