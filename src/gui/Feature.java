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
//	private JButton match = new JButton("lancer le match");
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
		j2.addActionListener(new ActionPlayer2());
		j3.addActionListener(new ActionPlayer3());
		j4.addActionListener(new ActionPlayer4());
		j5.addActionListener(new ActionPlayer5());
		j6.addActionListener(new ActionPlayer6());
		j7.addActionListener(new ActionPlayer7());
		j8.addActionListener(new ActionPlayer8());
		j9.addActionListener(new ActionPlayer9());
		j10.addActionListener(new ActionPlayer10());
		j11.addActionListener(new ActionPlayer11());
		j12.addActionListener(new ActionPlayer12());
		j13.addActionListener(new ActionPlayer13());
		j14.addActionListener(new ActionPlayer14());
		j15.addActionListener(new ActionPlayer15());
		j16.addActionListener(new ActionPlayer16());
		j17.addActionListener(new ActionPlayer17());
		j18.addActionListener(new ActionPlayer18());
		j19.addActionListener(new ActionPlayer19());
		j20.addActionListener(new ActionPlayer20());
		j21.addActionListener(new ActionPlayer21());
		j22.addActionListener(new ActionPlayer22());
	//	match.addActionListener(new ActionMatch());

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
			Player1 player = new Player1(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player2 player = new Player2(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player3 player = new Player3(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player4 player = new Player4(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player5 player = new Player5(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player6 player = new Player6(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player7 player = new Player7(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer8 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player8 player = new Player8(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer9 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player9 player = new Player9(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer10 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player10 player = new Player10(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer11 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player11 player = new Player11(players1);
			player.setVisible(true);
		}
	}

	private class ActionPlayer12 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player12 player = new Player12(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer13 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player13 player = new Player13(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer14 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player14 player = new Player14(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer15 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player15 player = new Player15(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer16 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player16 player = new Player16(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer17 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player17 player = new Player17(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer18 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player18 player = new Player18(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer19 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player19 player = new Player19(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer20 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player20 player = new Player20(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer21 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player21 player = new Player21(players2);
			player.setVisible(true);
		}
	}

	private class ActionPlayer22 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Player22 player = new Player22(players2);
			player.setVisible(true);
		}
	}

	/*private class ActionMatch implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ChronometerGUI match = new ChronometerGUI("Simu Soccer");
			match.setVisible(true);

		}
	} */

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
