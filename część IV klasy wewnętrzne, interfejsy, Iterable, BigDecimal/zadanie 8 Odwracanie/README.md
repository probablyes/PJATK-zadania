# Odwracanie

Zdefiniowa� interfejs Reversible z jedn� metod� Reversible reverse() i zaimplementowa� j� w klasach ReversibleString i ReversibleDouble.  
Metoda reverse dla String�w odwraca napis, a dla liczb - odwraca liczb� (czyli z napisu kot robi tok a z liczby 3 robi 0.3333).  
Metoda zwraca Reversible z aktualn� (odwr�con�) warto�ci�.  
  
Zapewni� by nast�puj�cy program wykona� si� prawid�owo i da� pokazane wyniki:  

```java  
      public class ReverseTest {
      
        public static void main(String[] args) {
        
              Reversible[] revers = new Reversible[] {
                  new ReversibleString("Kot"),
                  new ReversibleDouble(2),
                  new ReversibleDouble(3),
                  new ReversibleString("Pies"),
                  new ReversibleString("Ala ma kota i psa"),
                  new ReversibleDouble(10),
              };

              System.out.println("Normalne:");
              for (Reversible r : revers) {
                System.out.println(r);
              }

              for (Reversible r : revers) {
                r.reverse();
              }

              System.out.println("Odwr�cone:");
              for (Reversible r : revers) {
                System.out.println(r);
              }

              System.out.println("Przywr�cone i zmienione:");
              for (Reversible r : revers) {
                 /*<-  co tu trzeba napisa� */
              }
            }
          }
```
  
Wynik:  
Normalne:  
Kot  
2.0  
3.0  
Pies  
Ala ma kota i psa  
10.0  
Odwr�cone:  
toK  
0.5  
0.3333333333333333  
seiP  
asp i atok am alA  
0.1  
Przywr�cone i zmienione:  
Tekst Kot  
12.0  
13.0  
Tekst Pies  
Tekst Ala ma kota i psa  
20.0  
  
Uwaga: kod klasy ReverseTest mo�e (i musi)  by� zmieniony tylko w miejscu zaznaczonym na zielono. Inne modyfikacje pliku nie s� dopuszczalne i skutkuj� otrzymaniem zera punkt�w.