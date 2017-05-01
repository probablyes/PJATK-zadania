package zad1;

public class Pianista extends Muzyk {
	protected String instrument = "Fortepian";
	protected double stawka = 500;

	public Pianista(String imię, double czasWystępu) {
		super(imię, czasWystępu);
	}
	
	
	public String instrument() {
		return instrument;
	}
	
	
	public double stawka() {
		return stawka;
}
}