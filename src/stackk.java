import java.util.*;
public class stackk {

	public static void main(String[] args) {
		Stack s=new Stack();
s.add(100);
s.add(10);
s.add(20);
s.add(40);
s.add(60);
s.add(80);
s.add(70);
s.add(199);

System.out.println(s);
s.push(100);
System.out.println(s);
s.peek();

s.pop();
System.out.println(s);

	}

}
