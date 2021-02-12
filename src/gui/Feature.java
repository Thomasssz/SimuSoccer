package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
  
  
public class Feature extends JFrame {
     
   GridLayout grid = new GridLayout(3,4);
   

   JButton j1 = new JButton("joueur 1");
   JButton j2 = new JButton("joueur 2");
   JButton j3 = new JButton("joueur 3");
   JButton j4 = new JButton("joueur 4");
   JButton j5 = new JButton("joueur 5");
   JButton j6 = new JButton("joueur 6");
   JButton j7 = new JButton("joueur 7");
   JButton j8 = new JButton("joueur 8");
   JButton j9 = new JButton("joueur 9");
   JButton j10 = new JButton("joueur 10");
   JButton j11 = new JButton("joueur 11");
   JButton j12 = new JButton("joueur 12");
   JButton j13 = new JButton("joueur 13");
   JButton j14 = new JButton("joueur 14");
   JButton j15 = new JButton("joueur 15");
   JButton j16 = new JButton("joueur 16");
   JButton j17 = new JButton("joueur 17");
   JButton j18 = new JButton("joueur 18");
   JButton j19 = new JButton("joueur 19");
   JButton j20 = new JButton("joueur 20");
   JButton j21 = new JButton("joueur 21");
   JButton j22 = new JButton("joueur 22");
   
   public Feature() {
	   
	   JFrame frame = new JFrame();
	   frame.setTitle("Characteristics of the players");
	   frame.setSize(1000,1000);
	   JPanel panel = new JPanel();
	   frame.setContentPane(panel);
	   panel.setLayout(grid);
	   j1.setBackground(Color.BLUE);
	   
	   j1.addActionListener(new ActionJ());
	  
	  
	  panel.add(j1);
	  panel.add(j2);
	  panel.add(j3);
	  panel.add(j4);
	  panel.add(j5);
	  panel.add(j6);
	  panel.add(j7);
	  panel.add(j8);
	  panel.add(j9);
	  panel.add(j10);
	  panel.add(j11);
	 panel.add(j12);
	  panel.add(j13);
	  panel.add(j14);
	  panel.add(j15);
	  panel.add(j16);
	  panel.add(j17);
	  panel.add(j18);
	  panel.add(j19);
	  panel.add(j20);
	  panel.add(j21);
	  panel.add(j22);
	  
	   
	   
	   
	   
	   
	 
	   frame.setVisible(true);
	   
	   
   }
   
   private class ActionJ implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player1 player = new Player1();
			player.setVisible(true);
			
		}
	}
   
    public static void main(String[] args) {
    
         new Feature();
   }
}
