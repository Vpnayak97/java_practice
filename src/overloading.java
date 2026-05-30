
class  calc {
	double area(double a,double b) {
		return a*b;
	}
	double area(double a,double b,double c) {
		return a*b*c;
		
	}
	double area(double a) {
		return a*Math.PI;
	}
}
public class overloading {

	public static void main(String[] args) {
calc c=new calc();
System.out.println(c.area(1,2)+" sqrs");
System.out.println(c.area(1,2,3)+" sqrs");
System.out.println(c.area(1.276578)+" sqrs");
	}
}
