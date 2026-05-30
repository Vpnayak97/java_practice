import java.util.*;
public class setts {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
	
		int arr1[]= {4,5,3,8,2,5,5};
		for(int i=0;i<arr1.length;i++) {
			a.add(arr1[i]);
		}
		Set<Integer> b=new HashSet<>(a);
	for(Integer i:b) {
	System.out.println(i+" "+Collections.frequency(a,i));
}}
}