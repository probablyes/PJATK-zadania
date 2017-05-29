/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad1;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){

		@Override
		public String spiewaj() {
			this.numerStartowy = 1;
			this.glos = ": oooooooooooo";
			return "(" + numerStartowy +") "+ this.nazwisko + glos;
		}
      
    };

    Spiewak s2 = new Spiewak("Houston"){

		@Override
		public String spiewaj() {
			this.numerStartowy = 2;
			this.glos = ": a4iBBiii";
			return "(" + numerStartowy +") "+ this.nazwisko + glos;
		}
   
    };

    Spiewak s3 = new Spiewak("Madonna"){

		@Override
		public String spiewaj() {
			this.numerStartowy = 3;
			this.glos =  ": aAa";
			return "(" + numerStartowy +") "+ this.nazwisko + glos;
		}

    };

    Spiewak sp[] = {s1, s2, s3};
    
    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
