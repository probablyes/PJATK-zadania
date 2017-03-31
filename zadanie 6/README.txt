Kwiaciarnia (uwaga: niezb�dny do wykonania tego zadania  materia�  zawiera punkt o polimorfizmie w wyk�adzie, dotycz�cym programowania obiektowego)

Napisa� aplikacj�, kt�ra symuluje zakupy w kwiaciarni "samoobs�ugowej".
W kwiaciarni s� kwiaty, kwiaty maj� swoje nazwy oraz kolory. Ceny kwiat�w znajduj� si� w cenniku.
Do kwiaciarni przychodz� klienci. Klienci maj� imiona oraz dysponuj� jakim� zasobem pieni�dzy. Wybieraj� kwiaty i umieszczaj� je na w�zku sklepowym. Nast�pnie p�ac� za zawarto�� w�zka i przepakowuj� j� do pude�ka (jakiego� pude�ka na kwiaty :-).

Aplikacja wymaga zdefiniowania kilku klas i umiej�tnego ich u�ycia, w taki spos�b by nast�puj�cy program dzia�a� poprawnie.

       public class FloristsTest {
          // definicja metody sumowania wartosci kwiat�w o podanym kolorze 
          static int valueOf(Box box, String color) {
               /*<- tu trzeba wpisac kod metody */
          }

          public static void main(String[] args) {
            // Kwiaciarnia samoobs�ugowa
            // ustalenie cennika
            PriceList pl = PriceList.getInstance();
            pl.put("r�a", 10.0);
            pl.put("bez", 12.0);
            pl.put("piwonia", 8.0);

            // Przychodzi klient janek. Ma 200 z�
            Customer janek = new Customer("Janek", 200);

            // Bierze r�ne kwiaty: 5 r�, 5 piwonii, 3 frezje, 3 bzy
            janek.get(new Rose(5));
            janek.get(new Peony(5));
            janek.get(new Freesia(3));
            janek.get(new Lilac(3));

            // Pewnie je umie�ci� na w�zku sklepowyem
            // Zobaczmy co tam ma
            ShoppingCart wozekJanka = janek.getShoppingCart();
            System.out.println("Przed p�aceniem " + wozekJanka);

            // Teraz za to zap�aci...
            janek.pay();

            // Czy przypadkiem przy p�aceniu nie okaza�o si�,
            // �e w koszu s� kwiaty na kt�re nie ustalono jeszcze ceny?
            // W takim arzie zosta�yby usuni�te z w�zka i Janek nie p�aci�by za nie
            // R�wnie� mo�e mu zabrakn�c pieni�dzy, wtedy te� kwaity s� odk�adane.

            System.out.println("Po zap�aceniu " + janek.getShoppingCart());

            // Ile Jankowi zosta�o pieni�dzy? 
            System.out.println("Jankowi zosta�o : " + janek.getCash() + " z�");

            // Teraz jakos zapakuje kwiaty (mo�e do pude�ka)
            Box pudelkoJanka = new Box(janek);
            janek.pack(pudelkoJanka);

            // Co jest teraz w w�zku Janka...
            // (nie powinno ju� nic by�)
            System.out.println("Po zapakowaniu do pude�ka " + janek.getShoppingCart());

            // a co w pude�ku
            System.out.println(pudelkoJanka);

            // Zobaczmy jaka jest warto�� czerwonych kwiat�w w pude�ku Janka
            System.out.println("Czerwone kwiaty w pude�ku Janka kosztowa�y: "
                + valueOf(pudelkoJanka, "czerwony"));

            // Teraz przychodzi Stefan
            // ma tylko 60 z�
            Customer stefan = new Customer("Stefan", 60);

            // Ale nabra� kwiat�w nieco za du�o jak na t� sum�
            stefan.get(new Lilac(3));
            stefan.get(new Rose(5));

            // co ma w w�zku
            System.out.println(stefan.getShoppingCart());

            // p�aci i pakuje do pude�ka
            stefan.pay();
            Box pudelkoStefana = new Box(stefan);
            stefan.pack(pudelkoStefana);

            // co ostatecznie uda�o mu si� kupi�
            System.out.println(pudelkoStefana);
            // ... i ile zosta�o mu pieni�dzy
            System.out.println("Stefanowi zosta�o : " + stefan.getCash() + " z�");
          }
        }
Program ten wyprowadzi na konsol�:
Przed p�aceniem W�zek w�asciciel Janek
r�a, kolor: czerwony, ilo�� 5, cena 10.0
piwonia, kolor: czerwony, ilo�� 5, cena 8.0
frezja, kolor: ��ty, ilo�� 3, cena -1.0
bez, kolor: bia�y, ilo�� 3, cena 12.0
Po zap�aceniu W�zek w�asciciel Janek
r�a, kolor: czerwony, ilo�� 5, cena 10.0
piwonia, kolor: czerwony, ilo�� 5, cena 8.0
bez, kolor: bia�y, ilo�� 3, cena 12.0
Jankowi zosta�o : 74.0 z�
Po zapakowaniu do pude�ka W�zek w�asciciel Janek -- pusto
Pude�ko w�asciciel Janek
r�a, kolor: czerwony, ilo�� 5, cena 10.0
piwonia, kolor: czerwony, ilo�� 5, cena 8.0
bez, kolor: bia�y, ilo�� 3, cena 12.0
Czerwone kwiaty w pude�ku Janka kosztowa�y: 90
W�zek w�asciciel Stefan
bez, kolor: bia�y, ilo�� 3, cena 12.0
r�a, kolor: czerwony, ilo�� 5, cena 10.0
Pude�ko w�asciciel Stefan
bez, kolor: bia�y, ilo�� 3, cena 12.0
Stefanowi zosta�o : 24.0 z�


Uwaga: kod tego programu mo�na zmienic tylko w miejscu zaznaczonym na zielono.


Dodawanie do  programu nowych rodzaj�w kwiat�w  ma byc bardzo �atwe.
Przy dodaniu nowego rodzaju kwiat�w nie wolno modyfikowa� �adnych innych klas programu.
Wymagania dodatkowe:
nale�y wykorzysta� klasy abstrakcyjne i polimorfizm
nale�y zminimalizowa� kod klas ShoppingCart i Box
nale�y zdefiniowa� klas� PriceList jako singleton (mo�emy mie� zawsze tylko jeden cennik)
Wa�ne uwagi. 
W kwiaciarni mog� by� kwiaty, kt�rych zapomniano doda� do cennika. Wtedy przy p�aceniu s� one usuwane z naszego w�zka.
Mo�e si� okaza�, �e klient nie dysponuje odpowiedni� kwot� pieni�dzy aby zap�aci� za ca�� zawarto�� w�ka. Wtedy z w�zka usuwane s� kwiaty, za kt�re klient nie mo�e zap�aci� (ale nie pojedy�czo, tylko w kompletach np. po stefan.get(new Lilac(3)) usuwane s� te trzy bzy na kt�re Stefan nie ma pieni�dzy).
Warto zwr�ci� uwag� na odpowiednio zdefiniowanie metody toString() w niekt�rych klasach.

I na koniec: nie przejmujemy si� tym, �e np. r�e mog� mie� wiele kolor�w. Dla uproszczenia przyj�li�my, �e r�e s� czerwone itd.

