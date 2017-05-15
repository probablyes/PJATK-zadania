# Definiowanie w�asnych obiekt�w iterowalnych

Ci�g Collatza (znany te� jako �hailstone sequence� lub ci�g Ulama) to ci�g liczb naturalnych rozpoczynaj�cy si� od dowolnej liczby a0, kt�rego kolejne wyrazy obliczane s� wed�ug zasady  

![alt text](https://wikimedia.org/api/rest_v1/media/math/render/svg/6e406fc6c9c5a2b4f8a857069aa9c440c9fcbe7b "wzor ciagu")
  
Istnieje hipoteza, �e taki ci�g zawsze dojdzie do liczby 1 (i potem b�dzie ju� periodyczny: 1,4,2,1,4,2,1,4,...). Zosta�a ona sprawdzona a� do astronomicznie wielkich liczb, ale do tej pory nie uda�o si� jej udowodni�.  
Na przyk�ad, je�li rozpoczniemy od liczby 5, otrzymamy ci�g [5,16,8,4,2,1,...], a rozpoczynaj�c od 7 otrzymamy ju� ci�g d�u�szy: [7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1,...].  
Zadanie polega na stworzeniu klasy Hailstone, kt�rej obiekty reprezentuj� pojedynczy ci�g Collatza. Konstruktor pobiera liczb� startow� (a0), o kt�rej mo�na za�o�y�, �e zawsze b�dzie wi�ksza od 1. Sam obiekt jest iterowalny, czyli implementuje interfejs Iterable i w ka�dej iteracji zwraca kolejne elementy ci�gu, poczynaj�c od warto�ci startowej. Iteracja powinna ko�czy� si� po zwr�ceniu, jako ostatniego elementu, liczby 1.
Implementacja klasy Hailstone
mo�e zawiera� statyczn� klas� wewn�trzn�, je�li b�dzie potrzebna;  
nie mo�e tworzy� �adnych tablic, ani u�ywa� �adnych kolekcji z bibliotek Jawy.  
Utworzon� klas� przetestuj za pomoc� nast�puj�cego programu:  

```java

 Main.java
public class Main {
    public static void main(String... args) {
        int ini = 77031, count = -1, maxel = 0;
        Hailstone hailstone = new Hailstone(ini);
        for (int h : hailstone) {
            if (h > maxel) maxel = h;
            ++count;
        }
        System.out.println(ini + " " + count + " " + maxel);
    }
}
```
Powinien on wypisa�, w jednej linii, oddzielone spacjami, trzy liczby: warto�� startow� (ini; w tym przyk�adzie 77031), ilo�� krok�w wykonanych do osi�gni�cia jedynki (count), oraz najwi�kszy wyraz tego ci�gu (maxel). Na przyk�ad dla warto�ci startowej 10, ci�g, a� do uzyskania jedynki, zawiera�by elementy [10 5 16 8 4 2 1], a zatem trzy liczby, kt�re wtedy wypisa�by program mia�yby warto�ci 10 6 16.