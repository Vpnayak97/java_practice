import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queue {

		public static void main(String[] args) {
			PriorityQueue <Integer>  s=new PriorityQueue<>(Comparator.reverseOrder());
	s.add(100);
	s.add(10);
	s.offer(20);
	s.add(40);
	s.offer(60);
	s.add(80);
	s.offer(70);
	s.add(199);
System.out.println(s);



	}

}
