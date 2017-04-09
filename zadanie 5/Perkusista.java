package zad1;

public class Perkusista extends Muzyk {
	String instrument = "Bęben";
	double stawka = 600;

	public Perkusista(String imię, double czasWystępu) {
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
