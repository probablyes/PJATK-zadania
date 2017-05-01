package zad3;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>{
	
	private int liczbaStartowa;
	private int poczatek;
	private int counter;
	
	public Hailstone(int ls){
		if(ls>1){
			liczbaStartowa = ls;
		}else{
			System.out.println("Podaj liczbę większą od 1");
		}
		poczatek = ls;
		int licznik = 1;
		
		while(poczatek!=1){
			if(poczatek%2 == 0){
	            poczatek=poczatek/2;
	            licznik++;
	        }else{
	            poczatek=(3*poczatek)+1;
	            licznik++;
	        }
		}
		counter = licznik;
	}
	

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){

			@Override
			public boolean hasNext() {			
				if(counter>0){
					return true;
				}else{
					return false;
				}
			}

			@Override
			public Integer next() {
				if(hasNext()){
					if(liczbaStartowa%2 == 0){
			            liczbaStartowa=liczbaStartowa/2;
			        }else{
			            liczbaStartowa=(3*liczbaStartowa)+1;
			        }
				};
				counter--;
                return liczbaStartowa;
			}	
		};
	}
}
