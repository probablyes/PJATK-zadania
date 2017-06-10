package zad4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

class TextEditor{

	private Font font = new Font("Dialog", Font.BOLD, 14);
	private JTextArea text = new JTextArea();
	private String msg = "";
	private String dom = "Koszykowa 10 00-222 Warszawa";
	private String szkola = "aleja Waszyngtona 10/2 02-122 Warszawa";
	private String praca = "plac Grzybowski 12/4 02-444 Warszawa";
	
	public TextEditor() throws FileNotFoundException{
		
		JMenuBar menuBar;
		JMenu file, edit, options;
		JFrame frame = new JFrame();
		frame.setTitle("bez tytułu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		text.setText("Wpisz coś...");
		text.setFont(font);
		JScrollPane sp = new JScrollPane(text);
		sp.setPreferredSize(new Dimension(500,500));

		//Create the menu bar.
		menuBar = new JMenuBar();

		file = this.jm("File");
		menuBar.add(file);
		edit = this.jm("Edit");
		menuBar.add(edit);
		options = this.jm("Options");
		menuBar.add(options);
		
		//read a file
		ActionListener open = (e -> {
			 String approveButt = "Otwarcie pliku";
			 JFileChooser fc = new JFileChooser(new File(".")); // dialog plikowy
			 int retVal = fc.showDialog(null, approveButt);
			 msg = "";
             if (retVal == JFileChooser.APPROVE_OPTION){
            	 try (Scanner sc = new Scanner(fc.getSelectedFile())){
            		 while(sc.hasNextLine()){
            			msg = msg + sc.nextLine() + "\n"; 
           			    frame.setTitle(fc.getSelectedFile().toString());
            		 }
            	 }catch (Exception ex){
            		 ex.printStackTrace();
            	 }
             }
             text.setText(msg);
               
		});
		JMenuItem openfile = this.mi("Open", null, 'o', "control O");
		openfile.addActionListener(open);
		file.add(openfile);
		file.addSeparator();
		//save file
		ActionListener save = (e -> {
			if(frame.getTitle().equals("bez tytułu")){
				String approveButt = "Zapisz";
				 JFileChooser fc = new JFileChooser(new File(".")); // dialog plikowy
				 int retVal = fc.showDialog(null, approveButt);
	             if (retVal == JFileChooser.APPROVE_OPTION){
	            	 try (BufferedWriter bf = new BufferedWriter(new FileWriter(fc.getSelectedFile()))){
	     				bf.write(text.getText());
	     				frame.setTitle(fc.getSelectedFile().toString());
	     			}catch (Exception ex){
	     				ex.printStackTrace();
	     			}          	      
	            }              
			}else{
				try (BufferedWriter bf = new BufferedWriter(new FileWriter(frame.getTitle()))){
     				bf.write(text.getText());
     			}catch (Exception ex){
     				ex.printStackTrace();
     			}      
			}
		});
		
		JMenuItem savefile = this.mi("Save", null, 's', "control S");
		savefile.addActionListener(save);
		file.add(savefile);
		file.addSeparator();
		//save as
		ActionListener saveas = (e -> {
			 String approveButt = "Zapisz";
			 JFileChooser fc = new JFileChooser(new File(".")); // dialog plikowy
			 int retVal = fc.showDialog(null, approveButt);
             if (retVal == JFileChooser.APPROVE_OPTION){
            	 try (BufferedWriter bf = new BufferedWriter(new FileWriter(fc.getSelectedFile()))){
	     			bf.write(text.getText());
     				frame.setTitle(fc.getSelectedFile().toString());
     			}catch (Exception ex){
     				ex.printStackTrace();
     			}          	      
            }              
		});
		
		JMenuItem saveasfile = this.mi("Save us...", null, 'a', "control A");
		saveasfile.addActionListener(saveas);
		file.add(saveasfile);
		file.addSeparator();
        JSeparator sep = new JSeparator(SwingConstants.HORIZONTAL);
        sep.setBackground(Color.red);
        file.add(sep);
		file.addSeparator();
		JMenuItem exitfile = this.mi("Exit", null, 'x', "control O");
		//exit program
		ActionListener exit = e -> {
			String[] opcje =  { "Zamknij", "Anuluj"};
			int rc = JOptionPane.showOptionDialog(
			           null,                      
			           "Czy na pewno chcesz zamknąć program?",          
			           "Zamykanie",   
			           JOptionPane.DEFAULT_OPTION, 
			           JOptionPane.QUESTION_MESSAGE,
			           null,                        
			           opcje,                       
			           opcje[1]);                  

			if(rc == 0) {
				System.exit(0);
			}else {
				JOptionPane.getRootFrame().dispose();  
			}
		};
		exitfile.addActionListener(exit);
		file.add(exitfile);

		JMenu adresy = this.jm("Adresy");
		JMenuItem praca = this.mi("Praca", null, 'p', "control shift P");
		praca.addActionListener(this.addAdress("praca"));
		JMenuItem szkola = this.mi("Szkoła", null, 's', "control shift S");
		szkola.addActionListener(this.addAdress("szkola"));
		JMenuItem dom = this.mi("Dom", null, 'd', "control shift D");
		dom.addActionListener(this.addAdress("dom"));
		adresy.add(praca);
		adresy.addSeparator();
		adresy.add(szkola);
		adresy.addSeparator();
		adresy.add(dom);
		edit.add(adresy);	

		options.add(this.colors("Foreground"));
		options.add(this.colors("Background"));
		
		JMenu fontSize = this.jm("Font Size");
		int size = 8;
		for (int i = 0; i < 9; i++) {
			JMenuItem jm = this.mi(size + " pts", null, -1, null);
			jm.addActionListener(this.fontSize(size));
			fontSize.add(jm);
			fontSize.addSeparator();
			size += 2;
		}
		options.add(fontSize);
		
		frame.add(sp);
		frame.setJMenuBar(menuBar);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	public JMenuItem mi(String t, Icon i, int mnemo, String accel) {
		 JMenuItem mi = new JMenuItem(t, i);  
		 mi.setMnemonic(mnemo);               
		 mi.setAccelerator(KeyStroke.getKeyStroke(accel)); 
		 return mi;
		}
	
	public JMenu jm(String name){
		JMenu menu = new JMenu(name);
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
		        "This menu does nothing");
		return menu;
	}
	
	public JMenu colors(String name){
		Color colors[] = {Color.blue, Color.yellow, Color.orange, Color.red, Color.white, Color.black, Color.green};
		Icon[] icons = { new IconA(colors[0]), 
			      new IconA(colors[1]), 
			      new IconA(colors[2]), 
			      new IconA(colors[3]),
			      new IconA(colors[4]), 
			      new IconA(colors[5]), 
			      new IconA(colors[6]), 
	
			  };
		JMenu background = this.jm(name);
		JMenuItem items[] = {this.mi("Blue", icons[0], -1, null),
		this.mi("Yellow", icons[1], -1, null),
		this.mi("Orange", icons[2], -1, null),
		this.mi("Red", icons[3], -1, null),
		this.mi("White", icons[4], -1, null),
		this.mi("Black", icons[5], -1, null),
		this.mi("Green", icons[6], -1, null)};
		
		for (int i = 0; i < items.length; i++) {
			items[i].addActionListener(this.setColor(i, name));
			background.add(items[i]);
			background.addSeparator();
		}
		return background;
		
	}
	
	public ActionListener fontSize(int size){
		ActionListener listener = (e -> {
				font = new Font("Dialog", Font.BOLD, size);
				text.setFont(font);
			});
		return listener;
	}
	
	public ActionListener addAdress(String name){
		ActionListener listener = (e -> {
			if (name.equals("dom")){
				text.insert(dom, text.getCaretPosition());
			}else if(name.equals("szkola")){
				text.insert(szkola, text.getCaretPosition());
			}else if(name.equals("praca")){
				text.insert(praca, text.getCaretPosition());
			}		
		});
	return listener;
	}
	
	public ActionListener setColor(int a, String type){
		Color colors[] = {Color.blue, Color.yellow, Color.orange, Color.red, Color.white, Color.black, Color.green};
		ActionListener listener;
		if(type.equalsIgnoreCase("Foreground")){
			listener = (e ->{
				text.setForeground(colors[a]);
			});
		}else{
			listener = (e ->{
				text.setBackground(colors[a]);
			});
		}
		return listener;
	}
	
	
}
	