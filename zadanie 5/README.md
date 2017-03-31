# Zadanie 5

Zdefiniowaæ klasy z poni¿szego programu:  

```
public class Test {

    public static void main(String[] args) {
    
        Muzyk[] muzycy = {new Pianista("Jan", 1.5),	// Imie, czas wystapienia (w godz.)
                       	  new Flecista("Adam", 1),
                          new Perkusista("Sebastian", 0.5)};
	for (Muzyk m : muzycy)
	    System.out.println("Muzyk: " + m.imie() + '\n' +
			       "Instrument: " + m.instrument() + '\n' +
                               "Czas wyst¹pienia: " + m.czas() + " godz. " + '\n' +
                               "Stawka godzinowa: " + m.stawka() + '\n');
	
	System.out.println(Muzyk.maxHonorarium(muzycy));	// muzyk otrzymuj¹cy najwy¿sze honorarium za wystêp
	 
    }
}

```  
w taki sposób, aby otrzymaæ w wyniku nastêpuj¹cy wydruk:  

Muzyk: Jan

Instrument: fortepian

Czas wyst¹pienia: 1.5 godz. 

Stawka godzinowa: 500  

Muzyk: Adam

Instrument: flet

Czas wyst¹pienia: 1.0 godz. 

Stawka godzinowa: 250  

Muzyk: Sebastian

Instrument: bêben

Czas wyst¹pienia: 0.5 godz. 

Stawka godzinowa: 600  

Jan, czas = 1.5 godz., stawka = 500  

Uwaga: nale¿y wykorzystaæ klasê abstrakcyjn¹, metody instrument() i stawka() musz¹ byæ wywo³ywane polimorficznie. 
Uwaga: utworzonej przez generator projektów klasy Test nie wolno zmieniaæ.