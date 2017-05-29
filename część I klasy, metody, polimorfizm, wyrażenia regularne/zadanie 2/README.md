# Wyszukiwanie w pliku
Mamy klasê Main:

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
Stworzyæ klasê Finder która wyszuka w tekœcie liczbê napisów "wariant" oraz liczbê instrukcji "if". Uwaga! Liczymy tylko instrukcje w dzia³aj¹cym kodzie, nie w komentarzu czy nazwie zmiennej, przyk³adowo instrukcje:  
int pif = 8;   
//if (true) int a = 9;  
  
Nie mog¹ byæ liczone.
