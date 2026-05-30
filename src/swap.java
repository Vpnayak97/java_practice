import java.util.Collections;
import java.util.Vector;

public class swap {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(40);
		v.add(60);
		v.add(80);
		v.add(70);
		v.add(199);
		System.out.println(v);
		Collections.swap(v,1,6);
		System.out.println("When the 1st postions is swaped with the 6th one ");
		System.out.println(v);
	}
}
