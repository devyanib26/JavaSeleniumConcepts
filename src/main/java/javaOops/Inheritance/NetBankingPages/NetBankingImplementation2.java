package javaOops.Inheritance.NetBankingPages;

public abstract class NetBankingImplementation2 extends NetBankingImplementation {

	public void setPassword() {
		System.out.println("Set your password.");
	}

	public void resetPassword() {
		System.out.println("Reset your password.");
	}

	public void mobile() {
		System.out.println("Pay your mobile bills.");
	}
	
	public void mutualFunds() {
		System.out.println("Invest in mutual funds.");
	}
	
	public abstract void rtgs();


}
