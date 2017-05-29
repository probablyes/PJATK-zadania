# Definiowanie w³asnych obiektów iterowalnych

Ci¹g Collatza (znany te¿ jako „hailstone sequence” lub ci¹g Ulama) to ci¹g liczb naturalnych rozpoczynaj¹cy siê od dowolnej liczby a0, którego kolejne wyrazy obliczane s¹ wed³ug zasady  

![alt text](https://wikimedia.org/api/rest_v1/media/math/render/svg/6e406fc6c9c5a2b4f8a857069aa9c440c9fcbe7b "wzor ciagu")
  
Istnieje hipoteza, ¿e taki ci¹g zawsze dojdzie do liczby 1 (i potem bêdzie ju¿ periodyczny: 1,4,2,1,4,2,1,4,...). Zosta³a ona sprawdzona a¿ do astronomicznie wielkich liczb, ale do tej pory nie uda³o siê jej udowodniæ.  
Na przyk³ad, jeœli rozpoczniemy od liczby 5, otrzymamy ci¹g [5,16,8,4,2,1,...], a rozpoczynaj¹c od 7 otrzymamy ju¿ ci¹g d³u¿szy: [7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1,...].  
Zadanie polega na stworzeniu klasy Hailstone, której obiekty reprezentuj¹ pojedynczy ci¹g Collatza. Konstruktor pobiera liczbê startow¹ (a0), o której mo¿na za³o¿yæ, ¿e zawsze bêdzie wiêksza od 1. Sam obiekt jest iterowalny, czyli implementuje interfejs Iterable i w ka¿dej iteracji zwraca kolejne elementy ci¹gu, poczynaj¹c od wartoœci startowej. Iteracja powinna koñczyæ siê po zwróceniu, jako ostatniego elementu, liczby 1.
Implementacja klasy Hailstone
mo¿e zawieraæ statyczn¹ klasê wewnêtrzn¹, jeœli bêdzie potrzebna;  
nie mo¿e tworzyæ ¿adnych tablic, ani u¿ywaæ ¿adnych kolekcji z bibliotek Jawy.  
Utworzon¹ klasê przetestuj za pomoc¹ nastêpuj¹cego programu:  

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
Powinien on wypisaæ, w jednej linii, oddzielone spacjami, trzy liczby: wartoœæ startow¹ (ini; w tym przyk³adzie 77031), iloœæ kroków wykonanych do osi¹gniêcia jedynki (count), oraz najwiêkszy wyraz tego ci¹gu (maxel). Na przyk³ad dla wartoœci startowej 10, ci¹g, a¿ do uzyskania jedynki, zawiera³by elementy [10 5 16 8 4 2 1], a zatem trzy liczby, które wtedy wypisa³by program mia³yby wartoœci 10 6 16.