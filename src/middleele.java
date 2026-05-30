import java.util.ArrayList;
import java.util.Scanner;


public class middleele {

	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			s.add(sc.nextInt());
		}
		System.out.println(s);
		int mid=s.size()/2;
		System.out.println(s.get(mid));
	}

}
