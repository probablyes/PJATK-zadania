/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Calc {
	
	public String doCalc(String cmd){
		try{
			//wyciagam znak
			String replace = cmd.replaceAll("\\d|\\.|\\,", " ");
			replace = replace.trim();  //0.33333/321
			cmd = cmd.trim();
			String liczby[] = cmd.split("\\/|\\*|-|\\+| ");
			BigDecimal liczba1 = new BigDecimal(liczby[0].trim());
			BigDecimal liczba2 = new BigDecimal(liczby[liczby.length-1].trim());
			Map<String, BigDecimal> hm = new HashMap<>();
			//wykonuje dzialania
			BigDecimal mnozenie = liczba1.multiply(liczba2);
			MathContext mc = new MathContext(25, RoundingMode.HALF_UP);
			BigDecimal dzielenie = liczba1.divide(liczba2, mc);
			BigDecimal dodawanie = liczba1.add(liczba2);
			BigDecimal odejmowanie = liczba1.subtract(liczba2);
			//wrzucam do mapy
			hm.put("*", mnozenie);
			hm.put("/", dzielenie);
			hm.put("+", dodawanie);
			hm.put("-", odejmowanie);
			//wybieram odpowiedni
			BigDecimal wynik = hm.get(replace);
			wynik = wynik.stripTrailingZeros();
			cmd = wynik.toString();
		}catch(Exception ex){
			cmd = "Invalid command to calc";
		}
		return cmd;
	}
	
}  
