# Odwracanie

Zdefiniowaæ interfejs Reversible z jedn¹ metod¹ Reversible reverse() i zaimplementowaæ j¹ w klasach ReversibleString i ReversibleDouble.  
Metoda reverse dla Stringów odwraca napis, a dla liczb - odwraca liczbê (czyli z napisu kot robi tok a z liczby 3 robi 0.3333).  
Metoda zwraca Reversible z aktualn¹ (odwrócon¹) wartoœci¹.  
  
Zapewniæ by nastêpuj¹cy program wykona³ siê prawid³owo i da³ pokazane wyniki:  

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

              System.out.println("Odwrócone:");
              for (Reversible r : revers) {
                System.out.println(r);
              }

              System.out.println("Przywrócone i zmienione:");
              for (Reversible r : revers) {
                 /*<-  co tu trzeba napisaæ */
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
Odwrócone:  
toK  
0.5  
0.3333333333333333  
seiP  
asp i atok am alA  
0.1  
Przywrócone i zmienione:  
Tekst Kot  
12.0  
13.0  
Tekst Pies  
Tekst Ala ma kota i psa  
20.0  
  
Uwaga: kod klasy ReverseTest mo¿e (i musi)  byæ zmieniony tylko w miejscu zaznaczonym na zielono. Inne modyfikacje pliku nie s¹ dopuszczalne i skutkuj¹ otrzymaniem zera punktów.