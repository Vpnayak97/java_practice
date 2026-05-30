	import java.util.*;
public class linkedlist {


		public static void main(String[] args) {
			LinkedList s=new LinkedList();
	s.add(100);
	s.add(10);
	s.add(20);
	s.add(40);
	s.add(60);
	s.add(80);
	s.add(70);
	s.add(199);

	System.out.println(s);
	s.addFirst(67);
	System.out.println(s);
	s.addLast(89);
	System.out.println(s);
s.remove();
s.removeFirst();
s.removeLast();
System.out.println(s);
System.out.println(s.get(1));
System.out.println(s.getFirst());
System.out.println(s.getLast());


		}

	}
