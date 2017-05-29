# Napisaæ prosty kalkulator dla liczb typu BigDecimal.
Obliczenia maj¹ byæ podawane jako argumenty wiersza poleceñ w postaci:  
  
liczba1 op liczba2  

gdzie op jeden ze znaków +,- (minus), * (mno¿enie), / (dzielenie), a  pomiêdzy liczba1, op i liczba2 wystêpuje jeden lub wiêcej bia³ych znaków.  

Obliczenia zrealizowaæ w klasie Calc jako metodê String doCalc(String cmd), zwracaj¹ca  napisow¹ reprezentacjê wyniku (uzyskanej liczby) lub napis "Invalid command to calc", jeœli wyst¹pi¹ jakiekolwiek b³êdy.  
  
Nastêpuj¹ca  klasa Main:  
```java
public class Main {
  
  public static void main(String[] args) {
    Calc c = new Calc();
    String wynik = c.doCalc(args[0]);
    System.out.println(wynik);
  }
}
```

po uruchomieniu winna wyprowadziæ na konsolê wynik obliczenia (np. jesli podano jako argument wiersza poleceñ 
 "1 / 2" , to wynikiem powinine byæ napis 0.5.  

Jeœli liczba wynikowa nie ma dok³adnej reprezentacji (jak np. wynik dzielenia 1/3), to wynik powinien byæ pokazany z dok³adnoœci¹ co najmniej 7 miejsc dziesiêtnych.  

Uwaga 1: klasy Main nie wolno modyfikowaæ i musi ona prawid³owo dzia³aæ.  
  
**Uwaga 2:** w  zadnej z klas programu nie wolno u¿ywaæ instrukcji if,  ani switch, ani operatora warunkowego, ani instrukcji for, ani isntrukcji while.  



