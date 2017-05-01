package zad2;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Customer{

	protected String imie;
	protected double pieniadze;
	protected double ileZaplacil;
	protected ShoppingCart sc = new ShoppingCart();
	protected Box box;
	protected ArrayList<Kwiat> kwiatyKlienta = new ArrayList<>();
	
	public Customer(String s, int i) {
		imie = s;
		pieniadze = i;
	}
	
	public void get(Kwiat k){
		sc.getZbior().add(k);
	}
//!!!
	public ShoppingCart getShoppingCart() {
		sc.wlasciciel = this.imie;
		return sc;
	}
	
	public void pay(){
		ArrayList<Double> kwoty = new ArrayList<>();
		for (int i = 0; i < this.sc.getZbior().size(); i++) {
			if(!PriceList.getInstance().hm.containsKey(this.sc.getZbior().get(i).getNazwa())){
				this.sc.getZbior().remove(i);
			}
		}
		for (Entry<String, Double> entry : PriceList.getInstance().hm.entrySet()){
			for (int j = 0; j < this.sc.getZbior().size(); j++) {
			if(this.sc.getZbior().get(j).getNazwa() == (entry.getKey())){
				int a = 0;
					for (int i = 0; i < this.sc.getZbior().size(); i++) {
						if(this.sc.getZbior().get(i).getNazwa()==entry.getKey()){
							a = i;
						}
					}
					ileZaplacil = ileZaplacil + (entry.getValue()*(this.sc.getZbior().get(a).getIlosc()));
					kwoty.add((entry.getValue()*(this.sc.getZbior().get(a).getIlosc())));
				}
			}
		}
		
		while(ileZaplacil>pieniadze){
			this.sc.getZbior().remove(this.sc.getZbior().size()-1);
			kwoty.remove(kwoty.size()-1);
			ileZaplacil = ileZaplacil - kwoty.get(kwoty.size()-1);
		}
		
		this.pieniadze = pieniadze - ileZaplacil;
		}
	
	public double getCash(){
		return pieniadze;
	}

	public void pack(Box pudelkoJanka) {
		for (int i = 0; i < this.sc.getZbior().size(); i++) {
			pudelkoJanka.getZbior().add(this.sc.getZbior().get(i));
		}
		this.sc.getZbior().clear();
	}

}


