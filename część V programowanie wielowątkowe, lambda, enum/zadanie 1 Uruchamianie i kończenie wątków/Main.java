/**
 *
s *  @author Lebieda Dawid S14921
 *
 */

package zad1;


public class Main {

  public static void main(String[] args) throws InterruptedException {
    Letters letters = new Letters("ABCD");
    for (Thread t : letters.getThreads()) System.out.println(t.getName());
    Thread.sleep(1);
    for (Thread t : letters.getThreads()){
    	t.start();
    }

    Thread.sleep(5000);
    letters.setIsTrue(false);
   
    System.out.println("\nProgram skończył działanie");
 
  }

}
