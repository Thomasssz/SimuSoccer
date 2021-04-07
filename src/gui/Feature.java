package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Player;
import data.Team;
import ihm.components.SportButton;
import ihm.components.SportLabel;

@SuppressWarnings("serial")
public class Feature extends JFrame {
	
	private static ArrayList<Player> players1 = new ArrayList<Player>();
	private static ArrayList<Player> players2 = new ArrayList<Player>();

	GridLayout grid = new GridLayout(3, 4);
	private JPanel contentPane,equipe_1,equipe_2=new JPanel();
	private SportButton jtest1 = new SportButton("");
	private SportButton jtest2 = new SportButton("");
	private SportButton j1 = new SportButton("Joueur 1");
	private SportButton j2 = new SportButton("Joueur 2");
	private SportButton j3 = new SportButton("Joueur 3");
	private SportButton j4 = new SportButton("Joueur 4");
	private SportButton j5 = new SportButton("Joueur 5");
	private SportButton j6 = new SportButton("Joueur 6");
	private SportButton j7 = new SportButton("Joueur 7");
	private SportButton j8 = new SportButton("Joueur 8");
	private SportButton j9 = new SportButton("Joueur 9");
	private SportButton j10 = new SportButton("Joueur 10");
	private SportButton j11 = new SportButton("Joueur 11");
	private SportButton j12 = new SportButton("Joueur 12");
	private SportButton j13 = new SportButton("Joueur 13");
	private SportButton j14 = new SportButton("Joueur 14");
	private SportButton j15 = new SportButton("Joueur 15");
	private SportButton j16 = new SportButton("Joueur 16");
	private SportButton j17 = new SportButton("Joueur 17");
	private SportButton j18 = new SportButton("Joueur 18");
	private SportButton j19 = new SportButton("Joueur 19");
	private SportButton j20 = new SportButton("Joueur 20");
	private SportButton j21 = new SportButton("Joueur 21");
	private SportButton j22 = new SportButton("Joueur 22");
	private SportLabel equipe1 = new SportLabel("Team 1 : ");
	private SportLabel equipe2 = new SportLabel("Team 2 : ");

	public Feature(ArrayList<Player> play1, ArrayList<Player>play2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600,650);
		setTitle("Characteristics of the players");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(28, 28, 28));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		players1 = play1 ;
		players2 = play2 ;
		
		

		j1.setBackground(new Color(0,0,255));
		j2.setBackground(new Color(0,0,255));
		j3.setBackground(new Color(0,0,255));
		j4.setBackground(new Color(0,0,255));
		j5.setBackground(new Color(0,0,255));
		j6.setBackground(new Color(0,0,255));
		j7.setBackground(new Color(0,0,255));
		j8.setBackground(new Color(0,0,255));
		j9.setBackground(new Color(0,0,255));
		j10.setBackground(new Color(0,0,255));
		j11.setBackground(new Color(0,0,255));
		jtest1.setBackground(new Color(0,0,255));
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
		jtest2.setBackground(Color.RED);

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
		
		equipe1=new SportLabel("Characteristics Equipe 1");
		equipe1.setBackground(new Color(28, 28, 28));
		equipe1.setPreferredSize(new Dimension(250,30));
		equipe1.setBounds(150,0,250,30);
		
		equipe_1=new JPanel();
		equipe_1.setPreferredSize(new Dimension(550,250));
		equipe_1.setBounds(25,40,550,250);
		Equipe_1();
		
		equipe2=new SportLabel("Characteristics Equipe 2");
		equipe2.setBackground(new Color(28, 28, 28));
		equipe2.setPreferredSize(new Dimension(250,30));
		equipe2.setBounds(150,300,250,30);
		
		
		equipe_2=new JPanel();
		equipe_2.setPreferredSize(new Dimension(550,250));
		equipe_2.setBounds(25,340,550,250);
		Equipe_2();
		
		contentPane.add(equipe1);
		contentPane.add(equipe_1);
		contentPane.add(equipe2);
		contentPane.add(equipe_2);

		setVisible(true);

	}
	
	public void Equipe_1() {
		equipe_1.setLayout(new GridLayout(3,4));
		equipe_1.add(j1);
		equipe_1.add(j2);
		equipe_1.add(j3);
		equipe_1.add(j4);
		equipe_1.add(j5);
		equipe_1.add(j6);
		equipe_1.add(j7);
		equipe_1.add(j8);
		equipe_1.add(j9);
		equipe_1.add(j10);
		equipe_1.add(j11);
		equipe_1.add(jtest1);
		
	}
	
	public void Equipe_2() {
		equipe_2.setLayout(new GridLayout(3,4));
		equipe_2.add(j12);
		equipe_2.add(j13);
		equipe_2.add(j14);
		equipe_2.add(j15);
		equipe_2.add(j16);
		equipe_2.add(j17);
		equipe_2.add(j18);
		equipe_2.add(j19);
		equipe_2.add(j20);
		equipe_2.add(j21);
		equipe_2.add(j22);
		equipe_2.add(jtest2);
		
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