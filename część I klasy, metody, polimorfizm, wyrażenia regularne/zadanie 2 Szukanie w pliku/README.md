# Wyszukiwanie w pliku
Mamy klas� Main:

```java
public class Main {

  public static void main(String ... args) throws Exception  {
    String fname  = System.getProperty("user.home")+"/Test.java";
    Finder finder = new Finder(fname);
    int nif = finder.getIfCount();
    int nwar = finder.getStringCount("wariant");
    System.out.println("Liczba instrukcji if: " + nif);
    System.out.println("Liczba napisow wariant: " + nwar);
  }
}
```
Stworzy� klas� Finder kt�ra wyszuka w tek�cie liczb� napis�w "wariant" oraz liczb� instrukcji "if". Uwaga! Liczymy tylko instrukcje w dzia�aj�cym kodzie, nie w komentarzu czy nazwie zmiennej, przyk�adowo instrukcje:  
int pif = 8;   
//if (true) int a = 9;  
  
Nie mog� by� liczone.
