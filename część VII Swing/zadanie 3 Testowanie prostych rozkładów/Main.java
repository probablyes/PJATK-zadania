/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {
	  
	  JFrame jf = new JFrame();
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JButton button = new JButton();
	  button.setPreferredSize(new Dimension(500, 500));
	  button.setText("Click me!!!!!!! Please I will change my color");
	  Color green = new Color(0, 128, 0);
	  Color maroon = new Color(128, 0, 0);
	  Color yellow = new Color(255, 255, 0);	
	  Color colors[] = {green, maroon, yellow};
	  
	  button.addActionListener(new ActionListener(){
		
		int counter = 0;
		  
		@Override
		public void actionPerformed(ActionEvent e) {
			button.setBackground(colors[counter]);
			counter++;
			if (counter == colors.length){
				counter = 0;
			}
		}
	  });
	  
	  jf.add(button);
	  jf.pack();
	  jf.setLocationRelativeTo(null);
	  jf.setVisible(true);
	  
  }
}
