package vpn1;

public class sumnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4986576;
int num2=num;
int rev=0,i=0;
while(num!=0) {
	i=num%10;
	rev=rev*10+i;
   num=num/10;
}
System.out.print(rev);
	
if(rev==num2) {
	System.out.print("its palindrome");
	
}
else {
	System.out.println("its not palindrome");
}
} 
}