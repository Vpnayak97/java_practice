package vpn1;
class Bankaccount{
	private int balance=50000;
	void deposite(int amount) {
		balance=balance+amount;
	}
	void checkbalance() {
		System.out.println(balance);
	}
	void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("insufficient amount in account cant withdraw");
		}else {
			balance=balance-amount;
		}
	}
}
public class MainBank {

	public static void main(String[] args) {
		Bankaccount BA1=new Bankaccount();
		System.out.println("The balance :");
		BA1.checkbalance();
		BA1.deposite(10000);
		System.out.println("The balance after deposite of amount");
		BA1.checkbalance();
		BA1.withdraw(5000);
		System.out.println("The balance after withdraw of amount");
		BA1.checkbalance();
		
}
}
