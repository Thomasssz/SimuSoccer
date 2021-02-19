package gui;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import data.Player;
import data.Team;

public class Player1 extends JFrame {
	
	private String name = "1";
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Caractéristique");
	private JTextArea h;

	public Player1() {
		
		this.setTitle("Joueur 1");
		this.setSize(500,500);
		h = new JTextArea(10,50);
		h.setText(toString(name));
		
		panel.add(label);
		panel.add(h);
		  
		 
		  this.setContentPane(panel);
	} 
	
	public String toString(String name) {
		Team.createteams();
		String result = "";
			for(int i = 0; i < Team.players1.size(); i++) { 
	    		if(Team.players1.get(i).getName().equals(name)) {
	    			result = Team.players1.get(i).toString();
	    		}
	    	}
			return result;
		}

	
	public Player recherchenom(String name) { 
    	for(int i = 0; i < Team.players1.size(); i++) { 
    		if(Team.players1.get(i).getName().equals(name)) {
    			return Team.players1.get(i);
    		}
    	}
    	return null;
	}

	
	public Player stat(String name){
		for(int i=0; i<Team.players1.size(); i++) {
			if(Team.players1.get(i).getName().equals(name)) {
    			return Team.players1.get(i) ;
    		}
		}
		return null;
	}
	
	/*public static void parcoursListPlayer(ArrayList<Player> list) {

		for (Player p : list) {

			p.toString();
			System.out.println(p);

		}*/

}
