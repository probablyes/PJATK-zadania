/**
 *
 *  @author Lebieda Dawid S14921
 *
 */

package zad2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {
	
	static int time;
	static String path;
	static double fontSize;
	static List<String> list = new ArrayList<>();
	static int i = 0;


  public static void main(String[] args) {
  
	  path = args[0];
	  time = Integer.parseInt(args[1]);
	  fontSize = Double.parseDouble(args[2]);
	  
	  JFrame jf = new JFrame();
	  jf.setTitle("Pictures");
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setVisible(true);
	  jf.setLocation(200,100);;
	  
	  try(Stream<Path> paths = Files.walk(Paths.get(path))){
		  paths.forEach(filePath -> {
			  if(Files.isRegularFile(filePath)){
				  String result = filePath.toString();
				  list.add(result);
			  }
		  });
	  } catch (IOException e) {
		e.printStackTrace();
	  }
	  
	  if(list.size()==0){
		  MyPanel mp = new MyPanel("empty");
		  MyPanel.lackOfImg = true;
		  jf.add(mp);
		  jf.pack();
		  
	  }else{
		  MyPanel mp = new MyPanel(Main.list.get(0));
		  jf.add(mp);
		  jf.pack();
		  
		  Timer timer = new Timer(time*1000, e -> {
			 try{	
				 	if(i<=list.size()){
				 		mp.loadImage(list.get(i));
				 		mp.repaint();
				 		jf.setSize(MyPanel.width, MyPanel.height);
				 	}
				}catch (IndexOutOfBoundsException ex) {
					MyPanel.loadImg = false;
					mp.repaint();
				}		  
			 
		  });
		  timer.start();
	  }
	  
	  
  }
}
