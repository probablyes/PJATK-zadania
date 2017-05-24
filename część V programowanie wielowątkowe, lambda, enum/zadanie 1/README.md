# Uruchamianie kod�w w w�tkach i ko�czenie w�tk�w

Zbudowa� klas� Letters, kt�ra pos�u�y do r�wnoleglego uruchamiania kod�w, wypisuj�cych co sekund� litery podane w napisie przekazanym do konstruktora klasy.
Po stworzeniu obiektu klasy Letters w metodzie main(...) klasy Main wystartowa� wszystkie w�tki, w kt�rych maj� by� wypisywane podane litery.
Po wstrzymaniu dzia�ania metody main(...) na 5 sekund - zako�czy� dzia�anie wszystkich kod�w, wypisuj�cych litery.  

Uruchomienie poni�szego programu:  
```java
    public class Main {

      public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads()) System.out.println(t.getName());
        /*<- tu uruchomi� 
             wszystkie kody w w�tkach 
         */

        Thread.sleep(5000);

        /*<- tu trzeba zapisa�
           fragment, kt�ry ko�czy dzia�anie kod�w, wypisuj�cych litery 
        */
        System.out.println("\nProgram sko�czy� dzia�anie");
      }

    }
```
powinno (w tej postaci) wypisa�:  
Thread A  
Thread B  
Thread C  
Thread D  
  
(po 5 sekundach)   
Program sko�czy� dzia�anie  
  
Natomiast po uzupe�nieniu kodu w miejscah wskazanych przez /*<-   */ - co� w rodzaju:  
  
Thread A  
Thread B  
Thread C  
Thread D  
ACDBDBACACDBCBDA  
Program sko�czy� dzia�anie.  
  
Uwaga 1: modyfikacje klasy Main s� dopuszczalne tylko w miejscach wskazanych przez /*<- */  
Uwaga 2: nie wolno stosowa� System.exit  
Uwaga 3: warto przy definiowaniu metody run() zastosowa� lambda-wyra�enie  


