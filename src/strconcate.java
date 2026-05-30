package vpn1;

import java.util.Scanner;

public class strconcate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String str=sc.nextLine();
		System.out.println("The string is "+str);
		System.out.print("Enter the string ");
		String str1=sc.nextLine();
		System.out.println("The string is "+str1);
		System.out.println(str1.concat(str));

	}

}
