package vpn1;

public class adamnumber {
	int adam(int n) {
		int sq1=n*n;
		int rev1=0;
		while(n!=0) {
		int rem=n%10;
			rev1=rev1+rem*10;
			n=n/10;
		}
		return rev1;
	}
	
	public static void main(String[] args) {
		adam ad=new adam();
		ad.adam(12);}
	}

