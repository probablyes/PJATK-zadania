
# Zadanie 7. Œpiewacy z klas¹ abstrakcyjn¹  
Zdefiniowaæ klasê abstrakcyjn¹ Spiewak reprezentuj¹c¹ œpiewaków. Ka¿dy œpiewak posiada nazwisko oraz numer startowy (np. w konkursie talentów), nadany automatycznie przy tworzeniu obiektu. Klasa Spiewak powinna posiadaæ m.in. konstruktor Spiewak(String nazwisko) oraz nastêpuj¹ce metody:  
  
a. abstrakcyjn¹: abstract String spiewaj(), która docelowo zwraca tekst œpiewany przez œpiewaka w konkursie.  
b. public String toString() zwracaj¹c¹ informacjê o œpiewaku.  
c. statyczn¹:... najglosniej(...) przyjmuj¹c¹ tablicê obiektów/œpiewaków oraz zwracaj¹c¹ obiekt/œpiewaka, w którego œpiewanym tekœcie znajduje siê najwiêcej du¿ych liter (patrz. metodê spiewaj()).  
   
W metodzie main klasy testuj¹cej Main:  
  
a. stworzyæ kilka (co najmniej 3) obiektów/œpiewaków poprzez u¿ycie **anonimowych klas wewnêtrznych** rozszerzaj¹cych klasê Spiewak. U¿ycie tych klas polega na podawaniu tego, co œpiewak ma œpiewaæ w konkursie.  
b. stworzyæ tablicê œpiewaków sk³adaj¹c¹ siê z obiektów z punktu a.  
c. testowaæ metodê najglosniej(...) z klasy Spiewak.  

Stworzyæ klasê Spiewak w taki sposób, aby nastêpuj¹ca metoda main z klasy Main: 
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

wyprowadzi³a prawid³ow¹ informacjê dok³adnie jak poni¿ej:  
  
(1) Carrey: oooooooooooo  
(2) Houston: a4iBBiii  
(3) Madonna: aAa  
    
(2) Houston: a4iBBiii  
  
Wa¿ne: Kod klas Main utworzony przez generator mo¿e (i musi) byæ zmieniony tylko w miejscach zaznaczonych na zielono. Inne modyfikacje tego kodu nie s¹ dopuszczalne i bêd¹ skutkowaæ uzyskaniem 0 punktów.