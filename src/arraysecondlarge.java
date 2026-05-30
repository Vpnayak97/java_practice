import java.util.Scanner;

public class arraysecondlarge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size  ");
		int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter elements  ");
for(int i=0;i<n;i++) {
	num[i]=sc.nextInt();
}
int min=num[0];
int max=num[0];
for(int i=0;i<n-1;i++) {
	if(num[i]<num[i+1]) {
		min=num[i];
		max=num[i+1];
	}
	
}
System.out.println("The second largest is "+min);

	}

}
