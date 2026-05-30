import java.util.*;
public class arrraydequee {

	public static void main(String[] args) {
		ArrayDeque <Integer> a=new ArrayDeque<>();
		a.add(100);
		a.add(10);
		a.add(20);
		a.add(40);
		a.add(60);
		a.add(80);
		a.add(70);
		a.add(199);
		System.out.println(a);
		a.remove();
	a.removeFirst();
		a.removeLast();
		a.poll();
		a.pollFirst();
		a.pollLast();
	}

}
