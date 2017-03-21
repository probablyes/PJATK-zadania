# Zadanie 4

Wczytaæ tekst z pliku {usenhome}/textforwords.txt i policzyæ liczbê wsyt¹pieñ poszczególnych s³ów. Do zliczania wyst¹pieñ przygotowaæ klasê CountWords w taki sposób, aby nastêpuj¹cy program, zapisany w pliku Main.java: 

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

wyprowadzi³ w kolejnych wierszach kolejne s³owa (w kolejnoœci ich wystêpowania w pliku) z nastêpuj¹c¹ po spacji liczb¹ ich wyst¹pieñ. Na przyk³ad dla tekstu z pliku: 
abc def abc ghi def

na konsoli winniœmy zobaczyæ nastêpuj¹ce wiersze: 
  
abc 2   
def 2   
ghi 1   

Uwagi: 
1. Pliku Main.java nie wolno modyfikowaæ. 2. Nazwa i umiejscowienie (katalog) pliku z tekstem s¹ obowi¹zkowe 3. S³owa - to ci¹gi znaków rozdzielone bia³ymi znakami i/lub znakami interpunkcji 