# Prosty edytor  
  
Stworzy� prosty edytor tekstu z opcjami umieszczonymi w menu rozwijalnym   
  
File   
    Open - otwiera plik wybrany w dialogu wyboru plik�w i wczytuje plik do edytora  
    Save - zapisuje zawarto�� edytora do bie��cego pliku (je�li nie ma pliku, to dialog wyboru plik�w)  
    Save As... zapisuje zawarto�� do pliku wybranego z dialogu  
    Exit   - zamkni�cie okna i zako�czenie dzia�ania aplikacji   
  
Edit   
   Adresy   
        Dom      - dopisuje do edytora w miejscu kursora adres domowy   
        Szko�a    - dopisuje do edytora w miejscu kursora adres szko�y   
        Firma     - dopisuje do edytora w miejscu kursora adres s�u�bowy  
  
Options   
    Foreground     - zmienia kolor pisma na wybran� opcj�   
           kolor1   
           ...   
           kolorN   
    Background    - zmienia kolor t�a na wybran� opcj�   
          kolor1   
          ...   
          kolorN   
    Font size          - zmienia rozmiar pisma na wybran� opcj�   
                8   
              10   
               ...   
              24  
  
Zapewni�:  
  
mnemoniki i akceleratory dla opcji Open, Save, Save As..., Exit, Dom, Szko�a, Firma  
pokazywanie kolor�w w opcjach wyboru koloru (t�a i pierwszego planu) w postaci kolorowych k�ek  
pokazywanie nazwy edytowanego pliku na pasku tytu�u (je�lie nie ma pliku - "bez tytu�u"),  
dialog wyboru pliku ma si� otwiera� w ostatnio odwiedzonym katalogu; na pocz�tku ma to by� bie��cy katalog.  
  
Przyk�ad realizacji.   
   
  
Wygl�d edytora - menu File (warto zwr�ci� uwag� na separator - czerwon� kresk� - jak j� zrobi�???)   
  
Po otwarciu menu Adresy (jak wida� wcze�niej zosta� wczytany plik - jego nazwa jest na pasku tytu�u; zauwa�my te�, �e wsz�dzie opcje menu s� "wypuk�e" - maj� kszta�t przycisk�w - jak to zrobi� ?):  

Po wyborze opcji szko�a widoczny dopisany tekst z adresem )zostal dopisany w miejscu kursora - jak to zrobi�?). Otwarte menu Background (menu Foreground jest takie samo):  

 Otwarte menu Font size :  

Uwagi:  
  
�atwe umieszczenie kolor�w = w�asna klasa implementuj�ca Icon  
nale�y napisa� kilka metod uniwersalnych (np. tworz�ce opcje menu z zadanymi charakterystykami), w przeciwnym razie kod b�dzie du�y i s�abo czytelny
