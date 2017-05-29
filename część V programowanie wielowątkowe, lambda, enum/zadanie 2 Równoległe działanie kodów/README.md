# Uruchamianie i zatrzymywanie równoleg³ego dzia³ania kodów  

Zbudowaæ klasê StringTask, symuluj¹ca d³ugotrwa³e obliczenia, tu polegaj¹ce na konkatenacji napisow.  
Konstruktor klasy otrzymuje jako argument napis do powielenia oraz liczbê oznaczaj¹c¹ ile razy ten napis ma byæ powielony.  
Klasa winna implementowaæ interfejs Runnable, a w jej metodzie run() wykonywane jest powielenia napisu, przy czym to powielenia ma siê odbywac za pomoca operatora '+' stosowanego wobec zmiennych typu String (to w³aœnie d³ugotrwa³a operacja). U¿ycie '+' jest warunkiem obowi¹zkowe.  
  
Obiekt klasy StringTask traktujemy jako zadanie, które mo¿e siê wykonywaæ równolegle z innymi.  
Mo¿liwe stany zadania to:  
CREATED  - zadanie utworzone, ale nie zaczê³o siê jeszcze wykonywaæ,  
RUNNING - zadanie siê wykonuje w odrebnym w¹tku  
ABORTED - wykonanie zadania zosta³o przerwane  
READY - zadanie zakoñczy³o siê pomyœlnie i sa gotowe wyniki.  
W klasie StringTask zdefiniowaæ metody:  
  public String getResult()  - zwracaj¹c¹ wynik konkatenacji  
  public TaskState getState()  - zwracaj¹c¹ stan zadania  
  public void start() - uruchamiaj¹c¹ zadanie w odrêbnym watku  
  public void abort() - przerywaj¹c¹ wykonanie kodzu zadania i dzia³anie watku  
  public boolean isDone()  - zwracaj¹ca true, jeœli wykonanie zadania siê zakoñczy³o normalnie lub przez przerwanie, false w przeciwnym razie  
Poni¿szy kod program:  
```java
public class Main {

  public static void main(String[] args) throws InterruptedException {
    StringTask task = new StringTask("A", 70000);
    System.out.println("Task " + task.getState());
    task.start();
    if (args.length > 0 && args[0].equals("abort")) { 
    /*<- tu zapisaæ kod  przerywaj¹cy dzia³anie tasku po sekundzie 
         i uruchomic go w odrêbnym w¹tku
    */
    }
    while (!task.isDone()) {
      Thread.sleep(500);
      switch(task.getState()) {
        case RUNNING: System.out.print("R."); break;
        case ABORTED: System.out.println(" ... aborted."); break;
        case READY: System.out.println(" ... ready."); break;
        default: System.out.println("uknown state");
      }
      
    }
    System.out.println("Task " + task.getState());
    System.out.println(task.getResult().length());
  }

}

```

uruchominy bez argumentu powinien wyprowadziæ coœ w rodzaju:  
Task CREATED  
R.R.R.R.R.R.R.R.R. ... ready.  
Task READY  
70000  
  
a uruchomiony z argumentem "abort" mo¿e wyprowadziæ:  
Task CREATED  
R. ... aborted.  
Task ABORTED  
31700  
   
Uwaga 1. Plik Main.java mo¿e byæ modyfikowany tylko w miejscu oznaczonym /*<- */  
Uwaga 2. Nie wolno uzywac metody System.exit(...)

