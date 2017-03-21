/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package Zad2;

import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.*;
import java.util.Map.Entry;


public class CountWords {
	
	private String path;
	
	public CountWords(String zrodlo){
		path = zrodlo;
	}
	
	public List<String> getResult() throws Exception{
		
		HashMap<String, Integer> map = new HashMap<>();	
		ArrayList<String> lista = new ArrayList<>();
		
		FileReader fis = new FileReader(path);
	    StreamTokenizer st = new StreamTokenizer(fis);
	    int t;
	    while((t = st.nextToken()) != StreamTokenizer.TT_EOF){
	    	if(t==StreamTokenizer.TT_WORD){
	    		 lista.add((st.sval.toString()));	
	    	}
	    }			
	    List<String> wynik = new ArrayList<>();
	    for (int i = 0; i < lista.size(); i++) {
	    	String word = lista.get(i);
	    	map.put(word,(Integer) map.getOrDefault(word, 0) + 1);
	    	if(!wynik.contains(word)){
	    		wynik.add(word);
	    	}
		}
	    
	   for (Entry<String, Integer> entry : map.entrySet()) {
		      for (int i = 0; i < wynik.size(); i++) {
				if(entry.getKey() == wynik.get(i)){
					wynik.set(i, wynik.get(i) + " " + entry.getValue());
				}
			}
		}
		return wynik;
	}
}  