import java.util.Scanner;
public class searchele {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter size  ");
int n=sc.nextInt();
int[] num=new int[n];
System.out.println("Enter elements  ");
for(int i=0;i<n;i++) {
	num[i]=sc.nextInt();
}
System.out.println("Enter element to serach ");
int ele=sc.nextInt();
int test=0;
int pos=0;
for(int i=0;i<n;i++) {
	if(num[i]==ele) {
		test=1;
		pos=i;
		break;
	}
}if(test==1) {
   System.out.println("Enter element is found in  "+pos+" posistion");
	}
	else
	{
		System.out.println("Enter element is not found");
	}}}
