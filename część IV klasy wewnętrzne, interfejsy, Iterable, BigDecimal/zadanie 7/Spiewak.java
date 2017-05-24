/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Spiewak {
	
	protected String nazwisko;
	protected int numerStartowy;
	protected String glos;
	protected int liczbaLiter;
	
	
	public Spiewak(String imie){
		this.nazwisko = imie;
	}
	
	public abstract String spiewaj();
	
	public String toString(){
		return this.spiewaj();
	}
	
	public static String najglosniej(Spiewak[] tab){
		for (int i = 0; i < tab.length; i++) {
			int counter = 0;
			Pattern p = Pattern.compile("[A-Z]");
			Matcher m = p.matcher(tab[i].glos);
			while(m.find()){
				counter++;
			}
			tab[i].liczbaLiter = counter;
			}

		Arrays.sort(tab, (a, b) -> {			
			return a.liczbaLiter - b.liczbaLiter;			
		}); 
		
		String s = "(" + tab[0].numerStartowy + ") " + tab[0].nazwisko + tab[0].glos; 
		return s;
		
		
	}
	
	
}
