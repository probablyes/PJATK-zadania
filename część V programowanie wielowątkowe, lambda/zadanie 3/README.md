# Zrealizowaæ klasyczny problem wspó³bie¿noœci Producent - Konsument za pomoc¹:  
  
a. (8p) Koordynacji w¹tków przy u¿yciu schematu wait-notify  
b. (3p) Blokuj¹cych kolejek (ArrayBlockingQueue, ...)  
Producent produkuje produkty i umieszcza je w buforze, a konsument pobiera je stamt¹d w kolejnoœci ich umieszczania.  
  
Szczegó³y:  
  
Produkty s¹ liczbami ca³kowitymi wygenerowanymi (wyprodukowanymi) losowo przez producenta.  
  
Bufor jest obiektem klasy Buffer zawieraj¹cej miêdzy innymi metody int get() - pobieraj¹c¹ liczbê z bufora i put(int n) - wstawiaj¹c¹ liczbê do bufora.   Bufor ma ograniczon¹ pojemnoœæ. W danej chwili dostêp do bufora mo¿e mieæ albo producent, albo konsument.  
  
Producent jest obiektem klasy Producer (np. implementuj¹cej Runnable). Konstruktor Producer(Buffer b) tworzy nowy obiekt - producent, którego zadaniem jest produkowanie i umieszczanie produktu w buforze b. Przedefiniowana metoda run() zawiera nieskoñzon¹ pêtlê: 1. Generuje losowo jedn¹ liczbê ca³kowit¹; 2. Umieszcza j¹ w buforze za pomoc¹ metody put(int) lub czeka na zwolnienie miejsca w przypadku pe³ngo bufora; 3. Zasypia na losowy wybrany czas z przedzia³u od 0 do 2s.   
  
Konsument jest obiektem klasy Consumer (np. implementuj¹cej Runnable). Konstruktor Consumer(Buffer b) tworzy nowy obiekt - konsument,   którego zadaniem jest pobieranie produktu z bufora b i jego konsumowanie. Przedefiniowana metoda run() zawiera nieskoñczon¹ pêtlê: 1. Pobiera jedn¹ liczbê z bufora za pomoc¹ metody int get() lub czeka na now¹ liczbê w przypadku pustego bufora; 2. Konsumuje liczbê, czyli wyprowadza j¹ na konsolê; 3. Zasypia na losowy wybrany czas z przedzia³u od 0 do 2s.
  
Testowanie:  
  
1. Utworzyæ obiekt klasy Buffer  
2. Utworzyæ obiekty klas Producer, Consumer oraz uruchomiæ w¹tki symuluj¹ce dzia³anie producenta oraz konsumenta na danym buforze,   
3. Program zakoñczy dzia³anie po okreœlonym czasie 15s.  
  
W trakcie dzia³ania, program powinien wyprowadzaæ na zewn¹trz jak najwiêcej informacji, aby mo¿na by³o œledziæ jego przebieg.