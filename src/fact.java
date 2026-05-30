package vpn1;

public class fact {
	int facto(int n) {
	if(n==0) {
	return 0;
	}else {
	return facto(n)*facto(n-1);
	  }
	public static void main(String[] args) {
	 fact f =new fact(10);
	 f.facto(10);

	}

}
