# Zadanie 4

Wczyta� tekst z pliku {usenhome}/textforwords.txt i policzy� liczb� wsyt�pie� poszczeg�lnych s��w. Do zliczania wyst�pie� przygotowa� klas� CountWords w taki spos�b, aby nast�puj�cy program, zapisany w pliku Main.java: 

```java
import java.util.'; 
	public class Main { 
	public static void main(String[] args) throws Exception {
				String fname = System.getProperty("user.home") + "/textforwords.txt"; 
				CountWords cw = new CountWords(fname);
				List<String> result = cw.getResult(); 
				for (String wordRes : result) { 
				System.out.println(wordRes); 				
```

wyprowadzi� w kolejnych wierszach kolejne s�owa (w kolejno�ci ich wyst�powania w pliku) z nast�puj�c� po spacji liczb� ich wyst�pie�. Na przyk�ad dla tekstu z pliku: 
abc def abc ghi def

na konsoli winni�my zobaczy� nast�puj�ce wiersze: 
  
abc 2   
def 2   
ghi 1   

Uwagi: 
1. Pliku Main.java nie wolno modyfikowa�. 2. Nazwa i umiejscowienie (katalog) pliku z tekstem s� obowi�zkowe 3. S�owa - to ci�gi znak�w rozdzielone bia�ymi znakami i/lub znakami interpunkcji 