package vpn1;

import java.util.Random;
import java.util.Scanner;

public class aray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size  ");
		int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter elements  ");
for(int i=0;i<n;i++) {
	num[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++) {
sum=sum+num[i];
}
System.out.print("The sum is "+sum);


	}

}
