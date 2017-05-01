package zad2;

public abstract class Kwiat {

	protected int ilosc;
	protected String nazwa;
	protected String kolor;
	
	public Kwiat(int ilosc){
		this.ilosc = ilosc;
	}
	
	public String getNazwa() {
		return nazwa;
	}

	public String getKolor() {
		return kolor;
	}
	
	public int getIlosc(){
		return ilosc;
	}

}
