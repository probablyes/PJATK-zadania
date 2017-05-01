package zad2;

public class ReversibleDouble implements Reversible {
	
	protected double liczba;

	public ReversibleDouble(double i) {
		liczba = i;
	}

	@Override
	public Reversible reverse() {
		this.liczba = 1/liczba;
		return this;
	}
	
	public String toString(){
		return "" + liczba;
	}

	public double getLiczba(){
		return liczba;
	}
}
