package zad1;

public class Flecista extends Muzyk{
	
	String instrument = "Flet";
	double stawka = 250;

	public Flecista(String imię, double czasWystępu) {
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
