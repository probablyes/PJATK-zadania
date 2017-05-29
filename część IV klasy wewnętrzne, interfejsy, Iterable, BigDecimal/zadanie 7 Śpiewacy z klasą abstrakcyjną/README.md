
# Zadanie 7. �piewacy z klas� abstrakcyjn�  
Zdefiniowa� klas� abstrakcyjn� Spiewak reprezentuj�c� �piewak�w. Ka�dy �piewak posiada nazwisko oraz numer startowy (np. w konkursie talent�w), nadany automatycznie przy tworzeniu obiektu. Klasa Spiewak powinna posiada� m.in. konstruktor Spiewak(String nazwisko) oraz nast�puj�ce metody:  
  
a. abstrakcyjn�: abstract String spiewaj(), kt�ra docelowo zwraca tekst �piewany przez �piewaka w konkursie.  
b. public String toString() zwracaj�c� informacj� o �piewaku.  
c. statyczn�:... najglosniej(...) przyjmuj�c� tablic� obiekt�w/�piewak�w oraz zwracaj�c� obiekt/�piewaka, w kt�rego �piewanym tek�cie znajduje si� najwi�cej du�ych liter (patrz. metod� spiewaj()).  
   
W metodzie main klasy testuj�cej Main:  
  
a. stworzy� kilka (co najmniej 3) obiekt�w/�piewak�w poprzez u�ycie **anonimowych klas wewn�trznych** rozszerzaj�cych klas� Spiewak. U�ycie tych klas polega na podawaniu tego, co �piewak ma �piewa� w konkursie.  
b. stworzy� tablic� �piewak�w sk�adaj�c� si� z obiekt�w z punktu a.  
c. testowa� metod� najglosniej(...) z klasy Spiewak.  

Stworzy� klas� Spiewak w taki spos�b, aby nast�puj�ca metoda main z klasy Main: 
```java
public class Main {
    public static void main(String[] args)
    {
    	Spiewak s1 = new Spiewak("Carrey"){
          /*<-  kod */
        };
  
        Spiewak s2 = new Spiewak("Houston"){
          /*<-  kod */
        };
  
        Spiewak s3 = new Spiewak("Madonna"){
          /*<-  kod */
        };
  
        Spiewak sp[] = {s1, s2, s3};
  
        for (Spiewak s : sp)
            System.out.println(s);
        
        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}

```

wyprowadzi�a prawid�ow� informacj� dok�adnie jak poni�ej:  
  
(1) Carrey: oooooooooooo  
(2) Houston: a4iBBiii  
(3) Madonna: aAa  
    
(2) Houston: a4iBBiii  
  
Wa�ne: Kod klas Main utworzony przez generator mo�e (i musi) by� zmieniony tylko w miejscach zaznaczonych na zielono. Inne modyfikacje tego kodu nie s� dopuszczalne i b�d� skutkowa� uzyskaniem 0 punkt�w.