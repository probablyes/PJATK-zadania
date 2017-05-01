# Zrealizowa� klasyczny problem wsp�bie�no�ci Producent - Konsument za pomoc�:  
  
a. (8p) Koordynacji w�tk�w przy u�yciu schematu wait-notify  
b. (3p) Blokuj�cych kolejek (ArrayBlockingQueue, ...)  
Producent produkuje produkty i umieszcza je w buforze, a konsument pobiera je stamt�d w kolejno�ci ich umieszczania.  
  
Szczeg�y:  
  
Produkty s� liczbami ca�kowitymi wygenerowanymi (wyprodukowanymi) losowo przez producenta.  
  
Bufor jest obiektem klasy Buffer zawieraj�cej mi�dzy innymi metody int get() - pobieraj�c� liczb� z bufora i put(int n) - wstawiaj�c� liczb� do bufora.   Bufor ma ograniczon� pojemno��. W danej chwili dost�p do bufora mo�e mie� albo producent, albo konsument.  
  
Producent jest obiektem klasy Producer (np. implementuj�cej Runnable). Konstruktor Producer(Buffer b) tworzy nowy obiekt - producent, kt�rego zadaniem jest produkowanie i umieszczanie produktu w buforze b. Przedefiniowana metoda run() zawiera niesko�zon� p�tl�: 1. Generuje losowo jedn� liczb� ca�kowit�; 2. Umieszcza j� w buforze za pomoc� metody put(int) lub czeka na zwolnienie miejsca w przypadku pe�ngo bufora; 3. Zasypia na losowy wybrany czas z przedzia�u od 0 do 2s.   
  
Konsument jest obiektem klasy Consumer (np. implementuj�cej Runnable). Konstruktor Consumer(Buffer b) tworzy nowy obiekt - konsument,   kt�rego zadaniem jest pobieranie produktu z bufora b i jego konsumowanie. Przedefiniowana metoda run() zawiera niesko�czon� p�tl�: 1. Pobiera jedn� liczb� z bufora za pomoc� metody int get() lub czeka na now� liczb� w przypadku pustego bufora; 2. Konsumuje liczb�, czyli wyprowadza j� na konsol�; 3. Zasypia na losowy wybrany czas z przedzia�u od 0 do 2s.
  
Testowanie:  
  
1. Utworzy� obiekt klasy Buffer  
2. Utworzy� obiekty klas Producer, Consumer oraz uruchomi� w�tki symuluj�ce dzia�anie producenta oraz konsumenta na danym buforze,   
3. Program zako�czy dzia�anie po okre�lonym czasie 15s.  
  
W trakcie dzia�ania, program powinien wyprowadza� na zewn�trz jak najwi�cej informacji, aby mo�na by�o �ledzi� jego przebieg.