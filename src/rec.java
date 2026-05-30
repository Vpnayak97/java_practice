package vpn1;

public class rec {
	int n;
	rec(int n){
		this.n=n;
	}
	int sum1=0;
	 int count=0;
	 int sum() {
		count++;
		if(count==n+1) {
			System.out.println(sum1);
			return 0;
		}else
		{
			sum1=sum1+count;
			return sum();
		}
	}
	public static void main(String[] args) {
		rec r=new rec(10000);
		r.sum();
	}
	

}
