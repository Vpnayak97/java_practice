import java.util.Scanner;

public class conut2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
		int num2=num;
		int rev=0,i=0;
		int count=0;
		int step=0;
		while(num%10==0) {
		   num=num/10;
		   count++;
		}
		System.out.println(count);

	}

}
