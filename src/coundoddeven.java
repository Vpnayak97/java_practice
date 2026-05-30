import java.util.Scanner;

public class coundoddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size  ");
		int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter elements  ");
for(int i=0;i<n;i++) {
	num[i]=sc.nextInt();
}
int countodd=0;
int counteven=0;
for(int i=0;i<n;i++) {
	if(num[i]%2==0) {
		counteven++;}
	else {
		countodd++;
	}}
	System.out.println("odd elements  "+countodd);
	System.out.println("even elements  "+counteven);

	}

}
