class bank{
	void interest() {
	System.out.println("The bank gives good interest ");
}}
class sbi extends bank{
	void interest() {
		System.out.println("The bank gives 7 % interest ");
	}
}
class HDFC extends bank{
	void interest() {
		System.out.println("The bank gives 8 % interest ");
	}}
class IDFC extends bank{
	void interest() {
		System.out.println("The bank gives 8.5 % interest ");
	}}
public class bankinterest {
	public static void main(String[] args) {
		bank b;
	 b=new bank();
	   b.interest();	
	 b=new sbi();
	  b.interest();
	 b=new HDFC();
	    b.interest();
	 b=new IDFC();
	  b.interest();
 
   

}
	}
