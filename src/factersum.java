package vpn1;

public class factersum {
	void fact(int n) {
		int sum=0;
		if(n==0) {
			System.out.print("enter a number greater than 0");
		}
		else if(n==1) {
		  System.out.println("the sum is 1 ");
		}
		else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
				sum=sum+i;
				System.out.println(sum);
			
				}		
				
			}
System.out.println("the sum is "+sum);
		}
		
	}
	public static void main(String[] args) {
		factersum f=new factersum();
		f.fact(6);
		

	}

}
