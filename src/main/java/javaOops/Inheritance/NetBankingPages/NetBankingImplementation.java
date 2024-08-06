package javaOops.Inheritance.NetBankingPages;

public abstract class NetBankingImplementation implements NetBanking {
	public void setUserName() {
		System.out.println("You can set you User Name.");
	}
	
	public void neft() {
		System.out.println("You can transfer money via NEFT.");
	}
	
	public void electricity() {
		System.out.println("Pay your electricity Bills.");
	}
	
	public void gas() {
		System.out.println("Book your gas cylinders online.");
	}
}
