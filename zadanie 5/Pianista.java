package zad1;

public class Pianista extends Muzyk {
	String instrument = "Fortepian";
	double stawka = 500;

	public Pianista(String imię, double czasWystępu) {
		super(imię, czasWystępu);
	}
	
	
	public String instrument() {
		// TODO Auto-generated method stub
		return instrument;
	}
	
	
	public double stawka() {
		// TODO Auto-generated method stub
		return stawka;
}
}