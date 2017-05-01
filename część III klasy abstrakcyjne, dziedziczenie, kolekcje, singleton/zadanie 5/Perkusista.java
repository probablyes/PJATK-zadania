package zad1;

public class Perkusista extends Muzyk {
	protected String instrument = "Bęben";
	protected double stawka = 600;

	public Perkusista(String imię, double czasWystępu) {
		super(imię, czasWystępu);
	}
	public String instrument() {
		return instrument;
	}


	public double stawka() {
		return stawka;
	}	
	
}
