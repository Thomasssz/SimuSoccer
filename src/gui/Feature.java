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
   

   private JButton j1 = new JButton("joueur 1");
   private JButton j2 = new JButton("joueur 2");
   private JButton j3 = new JButton("joueur 3");
   private JButton j4 = new JButton("joueur 4");
   private JButton j5 = new JButton("joueur 5");
   private JButton j6 = new JButton("joueur 6");
   private JButton j7 = new JButton("joueur 7");
   private JButton j8 = new JButton("joueur 8");
   private JButton j9 = new JButton("joueur 9");
   private JButton j10 = new JButton("joueur 10");
   private JButton j11 = new JButton("joueur 11");
   private JButton j12 = new JButton("joueur 12");
   private JButton j13 = new JButton("joueur 13");
   private JButton j14 = new JButton("joueur 14");
   private JButton j15 = new JButton("joueur 15");
   private JButton j16 = new JButton("joueur 16");
   private JButton j17 = new JButton("joueur 17");
   private JButton j18 = new JButton("joueur 18");
   private JButton j19 = new JButton("joueur 19");
   private JButton j20 = new JButton("joueur 20");
   private JButton j21 = new JButton("joueur 21");
   private JButton j22 = new JButton("joueur 22");
   private JButton match = new JButton("lancer le match");
   private JPanel panel = new JPanel();
   private JLabel equipe1 = new JLabel("Team 1 : ");
   private JLabel equipe2 = new JLabel("Team 2 : ");
   
   public Feature() {
	   
	   JFrame frame = new JFrame();
	   frame.setTitle("Characteristics of the players");
	   frame.setSize(450,450);
	   frame.setContentPane(panel);
	   JPanel team1 = new JPanel();
	   JPanel team2 = new JPanel();
	   team1.setLayout(grid);
	   team2.setLayout(grid);
	  
	  
	   j1.setBackground(Color.BLUE);
	   j2.setBackground(Color.BLUE);
	   j3.setBackground(Color.BLUE);
	   j4.setBackground(Color.BLUE);
	   j5.setBackground(Color.BLUE);
	   j6.setBackground(Color.BLUE);
	   j7.setBackground(Color.BLUE);
	   j8.setBackground(Color.BLUE);
	   j9.setBackground(Color.BLUE);
	   j10.setBackground(Color.BLUE);
	   j11.setBackground(Color.BLUE);
	   j12.setBackground(Color.RED);
	   j13.setBackground(Color.RED);
	   j14.setBackground(Color.RED);
	   j15.setBackground(Color.RED);
	   j16.setBackground(Color.RED);
	   j17.setBackground(Color.RED);
	   j18.setBackground(Color.RED);
	   j19.setBackground(Color.RED);
	   j20.setBackground(Color.RED);
	   j21.setBackground(Color.RED);
	   j22.setBackground(Color.RED);
	   
	   j1.addActionListener(new ActionJ());
	   j2.addActionListener(new ActionJ());
	   j3.addActionListener(new ActionJ());
	   j4.addActionListener(new ActionJ());
	   j5.addActionListener(new ActionJ());
	   j6.addActionListener(new ActionJ());
	   j7.addActionListener(new ActionJ());
	   j8.addActionListener(new ActionJ());
	   j9.addActionListener(new ActionJ());
	   j10.addActionListener(new ActionJ());
	   j11.addActionListener(new ActionJ());
	   j12.addActionListener(new ActionJ());
	   j13.addActionListener(new ActionJ());
	   j14.addActionListener(new ActionJ());
	   j15.addActionListener(new ActionJ());
	   j16.addActionListener(new ActionJ());
	   j17.addActionListener(new ActionJ());
	   j18.addActionListener(new ActionJ());
	   j19.addActionListener(new ActionJ());
	   j20.addActionListener(new ActionJ());
	   j21.addActionListener(new ActionJ());
	   j22.addActionListener(new ActionJ());
	   match.addActionListener(new ActionMatch());
	   
	   
	  team1.add(equipe1);
	  team1.add(j1);
	  team1.add(j2);
	  team1.add(j3);
	  team1.add(j4);
	  team1.add(j5);
	  team1.add(j6);
	  team1.add(j7);
	  team1.add(j8);
	  team1.add(j9);
	  team1.add(j10);
	  team1.add(j11);
	  
	  team2.add(equipe2);
	  team2.add(j12);
	  team2.add(j13);
	  team2.add(j14);
	  team2.add(j15);
	  team2.add(j16);
	  team2.add(j17);
	  team2.add(j18);
	  team2.add(j19);
	  team2.add(j20);
	  team2.add(j21);
	  team2.add(j22);
	  
	  panel.add(team1);
	  panel.add(team2);
	  panel.add(match);
	  
	   
	   
	   
	   
	   
	 
	   frame.setVisible(true);
	   
	   
   }
   
   private class ActionJ implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				Player1 player = new Player1();
				player.setVisible(true);
			
			
		}
	}
   
   private class ActionMatch implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				ChronometerGUI match = new ChronometerGUI("title");
				match.setVisible(true);
			
			
		}
	}
   
    public static void main(String[] args) {
    
         new Feature();
   }
}
