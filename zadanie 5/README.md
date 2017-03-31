# Zadanie 5

Zdefiniowa� klasy z poni�szego programu:  

```
public class Test {

    public static void main(String[] args) {
    
        Muzyk[] muzycy = {new Pianista("Jan", 1.5),	// Imie, czas wystapienia (w godz.)
                       	  new Flecista("Adam", 1),
                          new Perkusista("Sebastian", 0.5)};
	for (Muzyk m : muzycy)
	    System.out.println("Muzyk: " + m.imie() + '\n' +
			       "Instrument: " + m.instrument() + '\n' +
                               "Czas wyst�pienia: " + m.czas() + " godz. " + '\n' +
                               "Stawka godzinowa: " + m.stawka() + '\n');
	
	System.out.println(Muzyk.maxHonorarium(muzycy));	// muzyk otrzymuj�cy najwy�sze honorarium za wyst�p
	 
    }
}

```  
w taki spos�b, aby otrzyma� w wyniku nast�puj�cy wydruk:  

Muzyk: Jan

Instrument: fortepian

Czas wyst�pienia: 1.5 godz. 

Stawka godzinowa: 500  

Muzyk: Adam

Instrument: flet

Czas wyst�pienia: 1.0 godz. 

Stawka godzinowa: 250  

Muzyk: Sebastian

Instrument: b�ben

Czas wyst�pienia: 0.5 godz. 

Stawka godzinowa: 600  

Jan, czas = 1.5 godz., stawka = 500  

Uwaga: nale�y wykorzysta� klas� abstrakcyjn�, metody instrument() i stawka() musz� by� wywo�ywane polimorficznie. 
Uwaga: utworzonej przez generator projekt�w klasy Test nie wolno zmienia�.