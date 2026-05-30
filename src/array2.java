package vpn1;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size  ");
		int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++) {
	num[i]=sc.nextInt();
}
int evencount=0,oddcount=0;
	for (int i = 0; i < n; i++) {
        if (num[i]%2==0) {
            evencount++;
        }
        if (num[i]%2!=0) {
          oddcount++;
      
        }} System.out.println("the evencount is  "+evencount);
System.out.println("the odd count is "+oddcount);

	}

}
