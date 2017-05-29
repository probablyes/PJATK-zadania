# Prosty edytor  
  
Stworzyæ prosty edytor tekstu z opcjami umieszczonymi w menu rozwijalnym   
  
File   
    Open - otwiera plik wybrany w dialogu wyboru plików i wczytuje plik do edytora  
    Save - zapisuje zawartoœæ edytora do bie¿¹cego pliku (jeœli nie ma pliku, to dialog wyboru plików)  
    Save As... zapisuje zawartoœæ do pliku wybranego z dialogu  
    Exit   - zamkniêcie okna i zakoñczenie dzia³ania aplikacji   
  
Edit   
   Adresy   
        Dom      - dopisuje do edytora w miejscu kursora adres domowy   
        Szko³a    - dopisuje do edytora w miejscu kursora adres szko³y   
        Firma     - dopisuje do edytora w miejscu kursora adres s³u¿bowy  
  
Options   
    Foreground     - zmienia kolor pisma na wybran¹ opcjê   
           kolor1   
           ...   
           kolorN   
    Background    - zmienia kolor t³a na wybran¹ opcjê   
          kolor1   
          ...   
          kolorN   
    Font size          - zmienia rozmiar pisma na wybran¹ opcjê   
                8   
              10   
               ...   
              24  
  
Zapewniæ:  
  
mnemoniki i akceleratory dla opcji Open, Save, Save As..., Exit, Dom, Szko³a, Firma  
pokazywanie kolorów w opcjach wyboru koloru (t³a i pierwszego planu) w postaci kolorowych kó³ek  
pokazywanie nazwy edytowanego pliku na pasku tytu³u (jeœlie nie ma pliku - "bez tytu³u"),  
dialog wyboru pliku ma siê otwieraæ w ostatnio odwiedzonym katalogu; na pocz¹tku ma to byæ bie¿¹cy katalog.  
  
Przyk³ad realizacji.   
   
  
Wygl¹d edytora - menu File (warto zwróciæ uwagê na separator - czerwon¹ kreskê - jak j¹ zrobiæ???)   
  
Po otwarciu menu Adresy (jak widaæ wczeœniej zosta³ wczytany plik - jego nazwa jest na pasku tytu³u; zauwa¿my te¿, ¿e wszêdzie opcje menu s¹ "wypuk³e" - maj¹ kszta³t przycisków - jak to zrobiæ ?):  

Po wyborze opcji szko³a widoczny dopisany tekst z adresem )zostal dopisany w miejscu kursora - jak to zrobiæ?). Otwarte menu Background (menu Foreground jest takie samo):  

 Otwarte menu Font size :  

Uwagi:  
  
³atwe umieszczenie kolorów = w³asna klasa implementuj¹ca Icon  
nale¿y napisaæ kilka metod uniwersalnych (np. tworz¹ce opcje menu z zadanymi charakterystykami), w przeciwnym razie kod bêdzie du¿y i s³abo czytelny
