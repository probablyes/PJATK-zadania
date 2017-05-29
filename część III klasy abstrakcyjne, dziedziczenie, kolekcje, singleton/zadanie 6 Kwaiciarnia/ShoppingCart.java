package zad2;

import java.util.ArrayList;
import java.util.Map.Entry;

class ShoppingCart extends ZbioryKwiatow {
	
	public ShoppingCart(){
		lista = new ArrayList<Kwiat>();
	}
	
	public String toString(){
		String s = "Wózek właściciel " + wlasciciel ;
		if(this.lista.size()==0){
			return s + " -- pusto";
		}else{
			for (int i = 0; i < lista.size(); i++) {
				if(PriceList.getInstance().hm.containsKey(lista.get(i).getNazwa())){
					s = s + "\n" + (lista.get(i).getNazwa() + ", kolor: " + lista.get(i).getKolor() + ", ilość " + lista.get(i).ilosc
							+ ", cena " + PriceList.getInstance().hm.get(lista.get(i).getNazwa()));
				}else{
					s = s + "\n" + (lista.get(i).getNazwa() + ", kolor: " + lista.get(i).getKolor() + ", ilość " + lista.get(i).ilosc
							+ ", cena " + -1);
				}
			}
		return s;
		}
	}
}	
	