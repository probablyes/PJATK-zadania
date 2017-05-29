package Zad1;

public class Account {

	private double stanKonta = 0;
	private static double rate;
	
	public void deposit(double stan){
			if(stan>0){
			stanKonta = stanKonta + stan;
			//return stanKonta;
			}else{
				System.out.println("Podaj wieksza kwote");
			}
	}
	
	public void transfer(Account k, double d){
		if(this.stanKonta>=d && d>0){
		k.stanKonta = k.stanKonta + d; 
		this.stanKonta = this.stanKonta - d;
		}else{
			System.out.println("Zła kwota");
		}
	}
	
	public void withdraw(double kwota){
		if(stanKonta>=kwota && kwota>0){								
			this.stanKonta = this.stanKonta - kwota;
		}else{
			System.out.println("Zła kwota");
		}
	}
	
	public double getStan(){
		return stanKonta;
	}
	
	public static void setInterestRate(double odsetki){
		if(odsetki>0){
		odsetki = odsetki * 0.01;
		rate = odsetki;
		}else{
			System.out.println("Odsetki muszą być większe od 0!");
		}
	}
	
	public void addInterest(){
		stanKonta = stanKonta + (stanKonta * rate);
	}
	

	
	
}
