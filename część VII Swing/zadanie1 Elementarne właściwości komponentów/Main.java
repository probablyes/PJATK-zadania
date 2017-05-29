/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {
	public static void main(String[] args) {
  
		 JFrame jf = new JFrame();
		 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JTextArea text = new JTextArea();
		 text.setText("U mnie działa");
		 text.setFont(new Font("Dialog", Font.BOLD, 14));
		 text.setBackground(Color.BLUE);
		 text.setForeground(Color.YELLOW);
		 JScrollPane sp = new JScrollPane(text);
		 sp.setPreferredSize(new Dimension(500,500));
		 
		 
		 jf.add(sp);
		 jf.pack();
		 jf.setLocationRelativeTo(null);
		 jf.setVisible(true);
		


	}
}
