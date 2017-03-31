Kwiaciarnia (uwaga: niezbêdny do wykonania tego zadania  materia³  zawiera punkt o polimorfizmie w wyk³adzie, dotycz¹cym programowania obiektowego)

Napisaæ aplikacjê, która symuluje zakupy w kwiaciarni "samoobs³ugowej".
W kwiaciarni s¹ kwiaty, kwiaty maj¹ swoje nazwy oraz kolory. Ceny kwiatów znajduj¹ siê w cenniku.
Do kwiaciarni przychodz¹ klienci. Klienci maj¹ imiona oraz dysponuj¹ jakimœ zasobem pieniêdzy. Wybieraj¹ kwiaty i umieszczaj¹ je na wózku sklepowym. Nastêpnie p³ac¹ za zawartoœæ wózka i przepakowuj¹ j¹ do pude³ka (jakiegoœ pude³ka na kwiaty :-).

Aplikacja wymaga zdefiniowania kilku klas i umiejêtnego ich u¿ycia, w taki sposób by nastêpuj¹cy program dzia³a³ poprawnie.

       public class FloristsTest {
          // definicja metody sumowania wartosci kwiatów o podanym kolorze 
          static int valueOf(Box box, String color) {
               /*<- tu trzeba wpisac kod metody */
          }

          public static void main(String[] args) {
            // Kwiaciarnia samoobs³ugowa
            // ustalenie cennika
            PriceList pl = PriceList.getInstance();
            pl.put("ró¿a", 10.0);
            pl.put("bez", 12.0);
            pl.put("piwonia", 8.0);

            // Przychodzi klient janek. Ma 200 z³
            Customer janek = new Customer("Janek", 200);

            // Bierze ró¿ne kwiaty: 5 ró¿, 5 piwonii, 3 frezje, 3 bzy
            janek.get(new Rose(5));
            janek.get(new Peony(5));
            janek.get(new Freesia(3));
            janek.get(new Lilac(3));

            // Pewnie je umieœci³ na wózku sklepowyem
            // Zobaczmy co tam ma
            ShoppingCart wozekJanka = janek.getShoppingCart();
            System.out.println("Przed p³aceniem " + wozekJanka);

            // Teraz za to zap³aci...
            janek.pay();

            // Czy przypadkiem przy p³aceniu nie okaza³o siê,
            // ¿e w koszu s¹ kwiaty na które nie ustalono jeszcze ceny?
            // W takim arzie zosta³yby usuniête z wózka i Janek nie p³aci³by za nie
            // Równie¿ mo¿e mu zabrakn¹c pieniêdzy, wtedy te¿ kwaity s¹ odk³adane.

            System.out.println("Po zap³aceniu " + janek.getShoppingCart());

            // Ile Jankowi zosta³o pieniêdzy? 
            System.out.println("Jankowi zosta³o : " + janek.getCash() + " z³");

            // Teraz jakos zapakuje kwiaty (mo¿e do pude³ka)
            Box pudelkoJanka = new Box(janek);
            janek.pack(pudelkoJanka);

            // Co jest teraz w wózku Janka...
            // (nie powinno ju¿ nic byæ)
            System.out.println("Po zapakowaniu do pude³ka " + janek.getShoppingCart());

            // a co w pude³ku
            System.out.println(pudelkoJanka);

            // Zobaczmy jaka jest wartoœæ czerwonych kwiatów w pude³ku Janka
            System.out.println("Czerwone kwiaty w pude³ku Janka kosztowa³y: "
                + valueOf(pudelkoJanka, "czerwony"));

            // Teraz przychodzi Stefan
            // ma tylko 60 z³
            Customer stefan = new Customer("Stefan", 60);

            // Ale nabra³ kwiatów nieco za du¿o jak na tê sumê
            stefan.get(new Lilac(3));
            stefan.get(new Rose(5));

            // co ma w wózku
            System.out.println(stefan.getShoppingCart());

            // p³aci i pakuje do pude³ka
            stefan.pay();
            Box pudelkoStefana = new Box(stefan);
            stefan.pack(pudelkoStefana);

            // co ostatecznie uda³o mu siê kupiæ
            System.out.println(pudelkoStefana);
            // ... i ile zosta³o mu pieniêdzy
            System.out.println("Stefanowi zosta³o : " + stefan.getCash() + " z³");
          }
        }
Program ten wyprowadzi na konsolê:
Przed p³aceniem Wózek w³asciciel Janek
ró¿a, kolor: czerwony, iloœæ 5, cena 10.0
piwonia, kolor: czerwony, iloœæ 5, cena 8.0
frezja, kolor: ¿ó³ty, iloœæ 3, cena -1.0
bez, kolor: bia³y, iloœæ 3, cena 12.0
Po zap³aceniu Wózek w³asciciel Janek
ró¿a, kolor: czerwony, iloœæ 5, cena 10.0
piwonia, kolor: czerwony, iloœæ 5, cena 8.0
bez, kolor: bia³y, iloœæ 3, cena 12.0
Jankowi zosta³o : 74.0 z³
Po zapakowaniu do pude³ka Wózek w³asciciel Janek -- pusto
Pude³ko w³asciciel Janek
ró¿a, kolor: czerwony, iloœæ 5, cena 10.0
piwonia, kolor: czerwony, iloœæ 5, cena 8.0
bez, kolor: bia³y, iloœæ 3, cena 12.0
Czerwone kwiaty w pude³ku Janka kosztowa³y: 90
Wózek w³asciciel Stefan
bez, kolor: bia³y, iloœæ 3, cena 12.0
ró¿a, kolor: czerwony, iloœæ 5, cena 10.0
Pude³ko w³asciciel Stefan
bez, kolor: bia³y, iloœæ 3, cena 12.0
Stefanowi zosta³o : 24.0 z³


Uwaga: kod tego programu mo¿na zmienic tylko w miejscu zaznaczonym na zielono.


Dodawanie do  programu nowych rodzajów kwiatów  ma byc bardzo ³atwe.
Przy dodaniu nowego rodzaju kwiatów nie wolno modyfikowaæ ¿adnych innych klas programu.
Wymagania dodatkowe:
nale¿y wykorzystaæ klasy abstrakcyjne i polimorfizm
nale¿y zminimalizowaæ kod klas ShoppingCart i Box
nale¿y zdefiniowaæ klasê PriceList jako singleton (mo¿emy mieæ zawsze tylko jeden cennik)
Wa¿ne uwagi. 
W kwiaciarni mog¹ byæ kwiaty, których zapomniano dodaæ do cennika. Wtedy przy p³aceniu s¹ one usuwane z naszego wózka.
Mo¿e siê okazaæ, ¿e klient nie dysponuje odpowiedni¹ kwot¹ pieniêdzy aby zap³aciæ za ca³¹ zawartoœæ wó¿ka. Wtedy z wózka usuwane s¹ kwiaty, za które klient nie mo¿e zap³aciæ (ale nie pojedyñczo, tylko w kompletach np. po stefan.get(new Lilac(3)) usuwane s¹ te trzy bzy na które Stefan nie ma pieniêdzy).
Warto zwróciæ uwagê na odpowiednio zdefiniowanie metody toString() w niektórych klasach.

I na koniec: nie przejmujemy siê tym, ¿e np. ró¿e mog¹ mieæ wiele kolorów. Dla uproszczenia przyjêliœmy, ¿e ró¿e s¹ czerwone itd.

