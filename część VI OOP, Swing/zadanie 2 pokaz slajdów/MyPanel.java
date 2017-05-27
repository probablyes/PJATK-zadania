package zad2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JPanel;

class MyPanel extends JPanel {

	protected static Image img;
	protected boolean loaded = false;
	protected static int width;
	protected static int height; 
	protected static boolean loadImg = true;
	protected static boolean lackOfImg;
	
	public MyPanel(String elem){
		setPreferredSize(new Dimension(400, 400));
		loadImage(elem);	
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
			if (img != null && loadImg){
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}else if ((img == null && loadImg) || (lackOfImg && img == null)){
				g.setColor(Color.red);
			    g.setFont(new Font("Arial", Font.BOLD, (int) Main.fontSize));
			    FontMetrics fm = g.getFontMetrics();
			    	int x = ((getWidth() - fm.stringWidth("Brak obrazka")) / 2);
		            int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
			    g.drawString("Brak obrazka", x, y);
			}else if (!loadImg){		
				g.setColor(Color.red);
			    g.setFont(new Font("Arial", Font.BOLD, (int) Main.fontSize));
			    FontMetrics fm = g.getFontMetrics();
			    	int x = ((getWidth() - fm.stringWidth("Koniec prezentacji")) / 2);
		            int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
			    g.drawString("Koniec prezentacji", x, y);
			}
	}
	
	protected void loadImage(String elem){
			if(elem.endsWith("jpg") || elem.endsWith("jpeg") || elem.endsWith("gif") || elem.endsWith("png")){
				img = Toolkit.getDefaultToolkit().getImage(elem);
				MediaTracker mt = new MediaTracker(this);
				mt.addImage(img, 1);
				try {
					mt.waitForID(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				width = img.getWidth(this);
				height = img.getHeight(this);
				if(width != -1 && width != 0 && height != -1 && height != 0){
					setPreferredSize(new Dimension(width, height));
				}else{
					setPreferredSize(new Dimension(400, 400));
				}
			}else{
				img = null;
			}
			Main.i++;
			
	}
	
	
	
	
	
	
}
