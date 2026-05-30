import java.util.Scanner;

public class harshad {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=num;
		int sum=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(num2%sum==0) {
			System.out.println("its a harshad number");

}}}