package gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import data.Player;
import data.Team;

public class Player15 extends JFrame {
	private String name = "15";
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Caractéristique");
	private JTextArea h;

	private static ArrayList<Player> team2 = new ArrayList<Player>();

	public Player15(ArrayList<Player> player_team) {

		team2 = player_team;

		this.setTitle("Joueur 15");
		this.setSize(500, 500);
		h = new JTextArea(10, 50);
		h.setText(toString(name));

		panel.add(label);
		panel.add(h);

		this.setContentPane(panel);
	}

	public String toString(String name) {

		String result = "";
		for (int i = 0; i < team2.size(); i++) {
			if (team2.get(i).getName().equals(name)) {
				result = team2.get(i).toString();
			}
		}
		return result;
	}

}
