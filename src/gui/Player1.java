package gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import data.Player;
import data.Team;

public class Player1 extends JFrame {
	
	JPanel panel = new JPanel();
	JTextArea text = new JTextArea("salut");
	
	public Player1() {
		 
		  this.setTitle("Joueur 1");
		  this.setSize(500,500);
		
				 
		 
		  

		
		   panel.add(text);
		 
		  
	}
	
	public static void stat(){
		 Team.createteams();
		for(int i=0; i<Team.players1.size(); i++) {
			System.out.println(Team.players1.get(i));
		}
	}
	
	/*public static void parcoursListPlayer(ArrayList<Player> list) {

		for (Player p : list) {

			p.toString();
			System.out.println(p);

		}*/

}
