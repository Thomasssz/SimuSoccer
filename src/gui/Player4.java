package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import data.Team;

public class Player4 extends JFrame{
	private String name = "4";
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Caractéristique");
	private JTextArea h;

	public Player4() {
		
		this.setTitle("Joueur 4");
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

}
