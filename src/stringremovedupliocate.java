package vpn1;
import java.util.Scanner;
import java.util.Arrays;

public class stringremovedupliocate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String str1=sc.nextLine();
		String res="";
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(res.indexOf(ch)==-1) 
				res=res+ch;		
		}
		System.out.println(res);
			
		}
}