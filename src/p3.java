package vpn1;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z') {
	System.out.println("The chartcter is uppper case");}
else if(ch>='a' && ch<='z'){
	System.out.println("The chartcter is lower  case");
}
else if(ch>='0' && ch<='9') {
	System.out.println("The chartcter is number ");
}
else {
	System.out.println("The chartcter is a symbol ");
}
	}

}
