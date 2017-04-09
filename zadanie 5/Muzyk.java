package zad1;

import java.util.Arrays;

public abstract class Muzyk {

	protected String imię;
	protected double czas;
	
	
	public Muzyk(String imię, double czasWystępu){
		this.imię = imię;
		this.czas = czasWystępu;
	}


	public String imie() {
		return imię;
	}


	public double czas() {
		return czas;
	}
	
	public abstract String instrument();


	public abstract double stawka();
	
	public static String maxHonorarium(Muzyk arr[]){
		double tab[] = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tab[i] = arr[i].stawka()*arr[i].czas;
		}
		Arrays.sort(tab);
		
		String s = null;
		for (int i = 0; i < arr.length; i++) {
			if((tab[tab.length-1]/arr[i].czas())==arr[i].stawka()){
				s = arr[i].imię + ", czas = " 
						+ arr[i].czas + " godz., stawka = " 
						+ arr[i].stawka() ;
			
			}
		}
		return s;
		
	}

	

	
}
