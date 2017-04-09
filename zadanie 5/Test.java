/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad1;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {

    Muzyk[] muzycy = {  new Pianista("Jan", 1.5), // Imie, czas wystepu (w godz.)
                        new Flecista("Adam", 1),
                        new Perkusista("Sebastian", 0.5)
                     };
    for (Muzyk m : muzycy)
      System.out.println("Muzyk: " + m.imie() + '\n' +
                         "Instrument: " + m.instrument() + '\n' +
                         "Czas wystapienia: " + m.czas() + " godz. " + '\n' +
                         "Stawka godzinowa: " + m.stawka() + '\n');

    System.out.println(Muzyk.maxHonorarium(muzycy));  // muzyk otrzymujacy najwyzsze honorarium za wystep
    
    int array[] = {-1, 0 , 1, 2};
    int array2[] = new int [array.length];
    for (int i = 0; i < array.length-1; i++) {
		array2[i] = array[i+1] - array[i];
	}
    //System.out.println(Arrays.toString(array2));
    int counter = 0;
    for (int i = 0; i < array2.length-1; i++) {
		if(array2[i]==array2[i+1]){
			counter++;
		}
	}
    //System.out.println("counter " + counter);
    if(counter==array2.length-2){
    	System.out.println("Arytmetyczny");
    }else{
    	System.out.println("Nie jest arytmetyczny");
    }
    
    char tab[][] = {{'X','X','X'}, 
    				  {' ','O','O'},
    				  {' ','O','O'}};
    
    System.out.println(tab[1][1]);
    
  }
}