package zad2;

import java.util.ArrayList;
import java.util.Map.Entry;

public abstract class ZbioryKwiatow {

	protected String wlasciciel;
	protected ArrayList<Kwiat> lista;
	
	public ZbioryKwiatow(){
		lista = new ArrayList<Kwiat>();
	}
	
	public ArrayList<Kwiat> getZbior(){
		return lista;
	}
	
	public abstract String toString();

}
