package zad1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

	MyPanel(){
		setPreferredSize(new Dimension(400, 400));
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		int width = getWidth();
        int height = getHeight();
		
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, width-1, height-1);
        g.drawLine(0, height-1, width-1, 0);
        
	}
	
}
