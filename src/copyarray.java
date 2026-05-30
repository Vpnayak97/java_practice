import java.util.Scanner;

public class copyarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size  ");
		int n=sc.nextInt();
		int[] num1=new int[n];
		int[] num2=new int[n];
		int[] num3=new int[n+n];
		System.out.println("Enter elements of array 1 ");
		for(int i=0;i<n;i++) {
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of array 2 ");
		for(int i=0;i<n;i++) {
			num2[i]=sc.nextInt();
		}
		int i;
		int size3=n+n;
	for(i=0;i<n;i++) {
        num3[i]=num1[i];
}	
	for(i=0;i<n;i++) {
        num3[num1.length+i]=num2[i];
}	
System.out.println("final array 3  ");
for(i=0;i<size3;i++) {	System.out.println(num3[i]);
}}
}
