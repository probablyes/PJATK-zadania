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
   }
}