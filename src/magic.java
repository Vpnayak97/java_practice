package vpn1;

import java.util.Scanner;

public class magic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=num;
		int rev=0,i=0;
	    int sum=0;
		while(num!=0) {
			i=num%10;
			sum=sum+i;
			num=num/10;
		}
		System.out.println(sum);
		int sum2=sum;
		int i2;
		while(sum!=0) {
			i2=sum%10;
			rev=rev*10+i2;
		   sum=sum/10;
		   }
		System.out.println(rev);
int finaly=sum2*rev;
if(finaly==num2) {
	System.out.println("The given number is magical number ");
}
else {
	System.out.print("The given number is not magical number ");
}
}
}