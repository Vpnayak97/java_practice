import java.util.Collections;
import java.util.Vector;

public class secondlarge {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(40);
		v.add(60);
		v.add(80);
		v.add(70);
		v.add(199);
		Collections.sort(v);
		System.out.println(v);
		System.out.println("The size "+v.size());
		System.out.println("The second large is "+v.get(v.size()-2));
	}

}
