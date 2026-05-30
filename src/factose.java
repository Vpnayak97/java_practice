package vpn1;
import java.util.Scanner;
public class factose {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<num;i++) {
	if(num%i==0) {
		System.out.println(i);
		sum=sum+i;
	}
		}
		
	if(sum==num) {
			System.out.println("Thats a perfect number ");
	}
		
}	
}