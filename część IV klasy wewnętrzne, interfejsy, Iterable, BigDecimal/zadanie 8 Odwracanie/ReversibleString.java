package zad2;

public class ReversibleString implements Reversible {
	
	protected String nazwa;

	public ReversibleString(String string) {
		nazwa = string;
	}

	@Override
	public Reversible reverse() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nazwa);
		nazwa = sb.reverse().toString();
		return this;
	}
	
	public String toString(){
		return nazwa;
	}
	
}
