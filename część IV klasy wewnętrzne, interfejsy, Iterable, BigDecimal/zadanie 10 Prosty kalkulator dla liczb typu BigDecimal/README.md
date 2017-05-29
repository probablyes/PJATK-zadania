# Napisa� prosty kalkulator dla liczb typu BigDecimal.
Obliczenia maj� by� podawane jako argumenty wiersza polece� w postaci:  
  
liczba1 op liczba2  

gdzie op jeden ze znak�w +,- (minus), * (mno�enie), / (dzielenie), a  pomi�dzy liczba1, op i liczba2 wyst�puje jeden lub wi�cej bia�ych znak�w.  

Obliczenia zrealizowa� w klasie Calc jako metod� String doCalc(String cmd), zwracaj�ca  napisow� reprezentacj� wyniku (uzyskanej liczby) lub napis "Invalid command to calc", je�li wyst�pi� jakiekolwiek b��dy.  
  
Nast�puj�ca  klasa Main:  
```java
public class Main {
  
  public static void main(String[] args) {
    Calc c = new Calc();
    String wynik = c.doCalc(args[0]);
    System.out.println(wynik);
  }
}
```

po uruchomieniu winna wyprowadzi� na konsol� wynik obliczenia (np. jesli podano jako argument wiersza polece� 
 "1 / 2" , to wynikiem powinine by� napis 0.5.  

Je�li liczba wynikowa nie ma dok�adnej reprezentacji (jak np. wynik dzielenia 1/3), to wynik powinien by� pokazany z dok�adno�ci� co najmniej 7 miejsc dziesi�tnych.  

Uwaga 1: klasy Main nie wolno modyfikowa� i musi ona prawid�owo dzia�a�.  
  
**Uwaga 2:** w  zadnej z klas programu nie wolno u�ywa� instrukcji if,  ani switch, ani operatora warunkowego, ani instrukcji for, ani isntrukcji while.  



