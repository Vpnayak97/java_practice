package vpn1;


import java.util.Scanner;
import java.util.Arrays;
public class stringprint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String arr1=sc.nextLine();
		char str1[]=arr1.toCharArray();
		System.out.print("Enter the string ");
		String arr2=sc.nextLine();
		char str2[]=arr2.toCharArray();
		 Arrays.sort(str1);
		 Arrays.sort(str2);
		 
		 if(Arrays.equals(str1,str2))
			 System.out.println("anagrm");
		 else
			 System.out.println("not a anagram");
		
		}
}
