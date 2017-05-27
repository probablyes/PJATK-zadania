/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad1;

import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {
	  
	  JFrame jf = new JFrame();
	  jf.setTitle("Diagonal");
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setVisible(true);
	  jf.setLocationRelativeTo(null);
	  
	  MyPanel pm = new MyPanel();
	  
	  jf.setContentPane(pm);
	  jf.pack();
	  
	  
  }
}
