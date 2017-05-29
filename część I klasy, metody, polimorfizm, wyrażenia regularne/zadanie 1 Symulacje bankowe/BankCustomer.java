package Zad1;

public class BankCustomer {

	private Account konto;
	private Person osoba;
	
	public BankCustomer(Person p) {
		this.osoba = p;
		konto = new Account();
	}
	
	public Account getAccount(){
		return konto;

	}
	
	public String toString(){
		return "Klient: " + this.osoba.getImie() + " stan konta " + this.konto.getStan();
	}
	
}