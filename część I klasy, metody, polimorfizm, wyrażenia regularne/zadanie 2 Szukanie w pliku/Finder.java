/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package Zad2;

import java.io.*;
import java.util.regex.*;

public class Finder {

	private String s;
	private String zrodlo;
	
	public Finder(String zrodlo) throws IOException{
		
		this.zrodlo = zrodlo;
	}
	
	public int getStringCount(String wzor) throws IOException{
		int counter = 0;
		BufferedReader br = new BufferedReader( new FileReader(zrodlo));
		while((s=br.readLine()) != null){
			Pattern p = Pattern.compile(wzor);
			Matcher m = p.matcher(s);
			while(m.find()) {
				counter++;
			}
		}
		return counter;		
	}
	
	public int getIfCount() throws IOException{
		int counter = 0;
		BufferedReader br = new BufferedReader(new FileReader(zrodlo));

		while((s=br.readLine()) != null){
			s = s.trim();
			if((s.startsWith("//")) || (s.startsWith("/*")) ||(s.startsWith("+"))|| 
				(s.endsWith("*/")) || (s.contains("String")) 
				|| (s.startsWith("\"")) || (s.startsWith("*"))){			
				counter = counter;
			}else{
				Pattern p = Pattern.compile(" *if *\\(([^\\(])+\\)");		
				Matcher m = p.matcher(s);
				while(m.find()){
					counter++;
				}				
			}
		}
		return counter;	
		}
	}   