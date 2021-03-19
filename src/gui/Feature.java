package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Player;
import data.Team;

public class Feature extends JFrame {
	
	private static ArrayList<Player> players1 = new ArrayList<Player>();
	private static ArrayList<Player> players2 = new ArrayList<Player>();

	GridLayout grid = new GridLayout(3, 4);

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
	private JPanel panel = new JPanel();
	private JLabel equipe1 = new JLabel("Team 1 : ");
	private JLabel equipe2 = new JLabel("Team 2 : ");

	public Feature(ArrayList<Player> play1, ArrayList<Player>play2) {
		
		players1 = play1 ;
		players2 = play2 ;
		
		JFrame frame = new JFrame();
		frame.setTitle("Characteristics of the players");
		frame.setSize(450, 450);
		frame.setContentPane(panel);
		JPanel team1 = new JPanel();
		JPanel team2 = new JPanel();
		team1.setLayout(grid);
		team2.setLayout(grid);

		j1.setBackground(Color.CYAN);
		j2.setBackground(Color.CYAN);
		j3.setBackground(Color.CYAN);
		j4.setBackground(Color.CYAN);
		j5.setBackground(Color.CYAN);
		j6.setBackground(Color.CYAN);
		j7.setBackground(Color.CYAN);
		j8.setBackground(Color.CYAN);
		j9.setBackground(Color.CYAN);
		j10.setBackground(Color.CYAN);
		j11.setBackground(Color.CYAN);
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

		j1.addActionListener(new ActionPlayer1());
		j2.addActionListener(new ActionPlayer1());
		j3.addActionListener(new ActionPlayer1());
		j4.addActionListener(new ActionPlayer1());
		j5.addActionListener(new ActionPlayer1());
		j6.addActionListener(new ActionPlayer1());
		j7.addActionListener(new ActionPlayer1());
		j8.addActionListener(new ActionPlayer1());
		j9.addActionListener(new ActionPlayer1());
		j10.addActionListener(new ActionPlayer1());
		j11.addActionListener(new ActionPlayer1());
		j12.addActionListener(new ActionPlayer1());
		j13.addActionListener(new ActionPlayer1());
		j14.addActionListener(new ActionPlayer1());
		j15.addActionListener(new ActionPlayer1());
		j16.addActionListener(new ActionPlayer1());
		j17.addActionListener(new ActionPlayer1());
		j18.addActionListener(new ActionPlayer1());
		j19.addActionListener(new ActionPlayer1());
		j20.addActionListener(new ActionPlayer1());
		j21.addActionListener(new ActionPlayer1());
		j22.addActionListener(new ActionPlayer1());

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
	//	panel.add(match);

		frame.setVisible(true);

	}

	private class ActionPlayer1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == j1) {
			Player1 player = new Player1(players1, "1");
			player.setVisible(true);
			}
			else if(e.getSource() == j2) {
				Player1 player = new Player1(players1, "2");
				player.setVisible(true);
			}
			else if(e.getSource() == j3) {
				Player1 player = new Player1(players1, "3");
				player.setVisible(true);
			}
			else if(e.getSource() == j4) {
				Player1 player = new Player1(players1, "4");
				player.setVisible(true);
			}
			else if(e.getSource() == j5) {
				Player1 player = new Player1(players1, "5");
				player.setVisible(true);
			}
			else if(e.getSource() == j6) {
				Player1 player = new Player1(players1, "6");
				player.setVisible(true);
			}
			else if(e.getSource() == j7) {
				Player1 player = new Player1(players1, "7");
				player.setVisible(true);
			}
			else if(e.getSource() == j8) {
				Player1 player = new Player1(players1, "8");
				player.setVisible(true);
			}
			else if(e.getSource() == j9) {
				Player1 player = new Player1(players1, "9");
				player.setVisible(true);
			}
			else if(e.getSource() == j10) {
				Player1 player = new Player1(players1, "10");
				player.setVisible(true);
			}
			else if(e.getSource() == j11) {
				Player1 player = new Player1(players1, "11");
				player.setVisible(true);
			}
			else if(e.getSource() == j12) {
				Player1 player = new Player1(players2, "12");
				player.setVisible(true);
			}
			else if(e.getSource() == j13) {
				Player1 player = new Player1(players2, "13");
				player.setVisible(true);
			}
			else if(e.getSource() == j14) {
				Player1 player = new Player1(players2, "14");
				player.setVisible(true);
			}
			else if(e.getSource() == j15) {
				Player1 player = new Player1(players2, "15");
				player.setVisible(true);
			}
			else if(e.getSource() == j16) {
				Player1 player = new Player1(players2, "16");
				player.setVisible(true);
			}
			else if(e.getSource() == j17) {
				Player1 player = new Player1(players2, "17");
				player.setVisible(true);
			}
			else if(e.getSource() == j18) {
				Player1 player = new Player1(players2, "18");
				player.setVisible(true);
			}
			else if(e.getSource() == j19) {
				Player1 player = new Player1(players2, "19");
				player.setVisible(true);
			}
			else if(e.getSource() == j20) {
				Player1 player = new Player1(players2, "20");
				player.setVisible(true);
			}
			else if(e.getSource() == j21) {
				Player1 player = new Player1(players2, "21");
				player.setVisible(true);
			}
			else if(e.getSource() == j22) {
				Player1 player = new Player1(players2, "22");
				player.setVisible(true);
			}
		}
	}


	public static void main(String[] args) {

		ArrayList<Player> team1 = new ArrayList<Player>();
		ArrayList<Player> team2 = new ArrayList<Player>();
		
		Team blue = new Team("1", team1, "blue");
		Team red = new Team("2", team2, "red");

		blue.createteams(blue);
		red.createteams(red);

		team1 = blue.getPlayers();
		team2 = red.getPlayers();
		
		new Feature(team1,team2);
	}
	
	
}
