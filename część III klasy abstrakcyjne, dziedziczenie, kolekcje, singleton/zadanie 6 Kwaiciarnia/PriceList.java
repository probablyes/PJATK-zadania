package zad2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PriceList {
	
	protected HashMap<String, Double> hm = new HashMap<>();
	private static PriceList instance = null;
	
	private PriceList(){}
	
	public static PriceList getInstance(){
		if(instance==null){
			instance = new PriceList();
		}
		return instance;
	}

	public void put(String kwiat, double cena) {
		instance.hm.put(kwiat, cena);
	}
	
	
	
	

	
	
	
	
	
	
}
