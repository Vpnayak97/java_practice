	import java.util.*;
public class maping {

	public static void main(String[] args) {
	Map<Integer,String> a=new Hashtable<>();
 System.out.println(a.getClass());
 
 a.put(1,"mango");
 a.put(2,"orange");
 a.put(3,"apple");
 a.put(4,"banana");
 a.put(5,"guava");
 a.put(6,"pinapple");
 System.out.println(a);
 a.putIfAbsent(2, "grapes"); //wont update just adds if it is not present 
a.replace(1, "graphes");
System.out.println((a.get(1)));
	}

}
