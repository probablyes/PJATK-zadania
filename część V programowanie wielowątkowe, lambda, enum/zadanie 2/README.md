# Uruchamianie i zatrzymywanie r�wnoleg�ego dzia�ania kod�w  

Zbudowa� klas� StringTask, symuluj�ca d�ugotrwa�e obliczenia, tu polegaj�ce na konkatenacji napisow.  
Konstruktor klasy otrzymuje jako argument napis do powielenia oraz liczb� oznaczaj�c� ile razy ten napis ma by� powielony.  
Klasa winna implementowa� interfejs Runnable, a w jej metodzie run() wykonywane jest powielenia napisu, przy czym to powielenia ma si� odbywac za pomoca operatora '+' stosowanego wobec zmiennych typu String (to w�a�nie d�ugotrwa�a operacja). U�ycie '+' jest warunkiem obowi�zkowe.  
  
Obiekt klasy StringTask traktujemy jako zadanie, kt�re mo�e si� wykonywa� r�wnolegle z innymi.  
Mo�liwe stany zadania to:  
CREATED  - zadanie utworzone, ale nie zacz�o si� jeszcze wykonywa�,  
RUNNING - zadanie si� wykonuje w odrebnym w�tku  
ABORTED - wykonanie zadania zosta�o przerwane  
READY - zadanie zako�czy�o si� pomy�lnie i sa gotowe wyniki.  
W klasie StringTask zdefiniowa� metody:  
  public String getResult()  - zwracaj�c� wynik konkatenacji  
  public TaskState getState()  - zwracaj�c� stan zadania  
  public void start() - uruchamiaj�c� zadanie w odr�bnym watku  
  public void abort() - przerywaj�c� wykonanie kodzu zadania i dzia�anie watku  
  public boolean isDone()  - zwracaj�ca true, je�li wykonanie zadania si� zako�czy�o normalnie lub przez przerwanie, false w przeciwnym razie  
Poni�szy kod program:  
```java
public class Main {

  public static void main(String[] args) throws InterruptedException {
    StringTask task = new StringTask("A", 70000);
    System.out.println("Task " + task.getState());
    task.start();
    if (args.length > 0 && args[0].equals("abort")) { 
    /*<- tu zapisa� kod  przerywaj�cy dzia�anie tasku po sekundzie 
         i uruchomic go w odr�bnym w�tku
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

uruchominy bez argumentu powinien wyprowadzi� co� w rodzaju:  
Task CREATED  
R.R.R.R.R.R.R.R.R. ... ready.  
Task READY  
70000  
  
a uruchomiony z argumentem "abort" mo�e wyprowadzi�:  
Task CREATED  
R. ... aborted.  
Task ABORTED  
31700  
   
Uwaga 1. Plik Main.java mo�e by� modyfikowany tylko w miejscu oznaczonym /*<- */  
Uwaga 2. Nie wolno uzywac metody System.exit(...)

