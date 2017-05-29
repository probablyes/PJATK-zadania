# Uruchamianie kodów w w¹tkach i koñczenie w¹tków

Zbudowaæ klasê Letters, która pos³u¿y do równoleglego uruchamiania kodów, wypisuj¹cych co sekundê litery podane w napisie przekazanym do konstruktora klasy.
Po stworzeniu obiektu klasy Letters w metodzie main(...) klasy Main wystartowaæ wszystkie w¹tki, w których maj¹ byæ wypisywane podane litery.
Po wstrzymaniu dzia³ania metody main(...) na 5 sekund - zakoñczyæ dzia³anie wszystkich kodów, wypisuj¹cych litery.  

Uruchomienie poni¿szego programu:  
```java
    public class Main {

      public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads()) System.out.println(t.getName());
        /*<- tu uruchomiæ 
             wszystkie kody w w¹tkach 
         */

        Thread.sleep(5000);

        /*<- tu trzeba zapisaæ
           fragment, który koñczy dzia³anie kodów, wypisuj¹cych litery 
        */
        System.out.println("\nProgram skoñczy³ dzia³anie");
      }

    }
```
powinno (w tej postaci) wypisaæ:  
Thread A  
Thread B  
Thread C  
Thread D  
  
(po 5 sekundach)   
Program skoñczy³ dzia³anie  
  
Natomiast po uzupe³nieniu kodu w miejscah wskazanych przez /*<-   */ - coœ w rodzaju:  
  
Thread A  
Thread B  
Thread C  
Thread D  
ACDBDBACACDBCBDA  
Program skoñczy³ dzia³anie.  
  
Uwaga 1: modyfikacje klasy Main s¹ dopuszczalne tylko w miejscach wskazanych przez /*<- */  
Uwaga 2: nie wolno stosowaæ System.exit  
Uwaga 3: warto przy definiowaniu metody run() zastosowaæ lambda-wyra¿enie  


