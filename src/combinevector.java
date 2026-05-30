import java.util.Vector;

public class combinevector {

	public static void main(String[] args) {
		Vector v1=new Vector();
		Vector v2=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(40);
		v1.add(60);
		v1.add(80);
		v1.add(70);
		v1.add(199);
		v2.add(76);
		v2.add(86);
		v2.add(67);
		v2.add(46);
		v2.add(96);
		v2.add(36);
		v2.add(75);
		v1.addAll(v2);
	System.out.println(v1);
		
	}

}
