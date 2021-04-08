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
public class Energie extends JPanel {
	
	private static ArrayList<Player> players1 = new ArrayList<Player>();
	private static ArrayList<Player> players2 = new ArrayList<Player>();
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	
	private JPanel contentPane,equipe_1,equipe_2=new JPanel();
	private SportLabel equipe1,equipe2,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j21,j20,j22=new SportLabel("");

	public Energie(ArrayList<Player>player1,ArrayList<Player>player2) {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 600,650);
		//setTitle("Energie of the players");
		//this.contentPane = new JPanel();
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBackground(new Color(28, 28, 28));
		//setContentPane(contentPane);
		this.setLayout(null);
		
		players1 = player1 ;
		players2 = player2; 
		
		equipe1=new SportLabel("Energie Equipe 1");
		equipe1.setBackground(new Color(28, 28, 28));
		equipe1.setPreferredSize(new Dimension(250,30));
		equipe1.setBounds(150,0,250,30);
		
		equipe_1=new JPanel();
		equipe_1.setPreferredSize(new Dimension(550,250));
		equipe_1.setBackground(new Color(28, 28, 28));
		equipe_1.setBounds(25,40,550,250);
		Equipe_1();
		
		equipe2=new SportLabel("Energie Equipe 2");
		equipe2.setBackground(new Color(28, 28, 28));
		equipe2.setPreferredSize(new Dimension(250,30));
		equipe2.setBounds(150,300,250,30);
		
		equipe_2=new JPanel();
		equipe_2.setPreferredSize(new Dimension(550,250));
		equipe_2.setBackground(new Color(28, 28, 28));
		equipe_2.setBounds(25,340,550,250);
		Equipe_2();
		
		this.add(equipe1);
		this.add(equipe_1);
		this.add(equipe2);
		this.add(equipe_2);

		setVisible(true);
		
		}
	
	public void Equipe_1() {
		System.out.println("array: "+players1);
		equipe_1.setLayout(new GridLayout(11,1));
		int test=10;
		j1=new SportLabel("Name: "+Name(0)+" "+"energie: "+Energie(0)+"");
		j1.setBackground(new Color(28, 28, 28));
		j2=new SportLabel("Name: "+Name(1)+" "+"energie: "+Energie(1)+"");
		j2.setBackground(new Color(28, 28, 28));
		j3=new SportLabel("Name: "+Name(2)+" "+"energie: "+Energie(2)+"");
		j3.setBackground(new Color(28, 28, 28));
		j4=new SportLabel("Name: "+Name(3)+" "+"energie: "+Energie(3)+"");
		j4.setBackground(new Color(28, 28, 28));
		j5=new SportLabel("Name: "+Name(4)+" "+"energie: "+Energie(4)+"");
		j5.setBackground(new Color(28, 28, 28));
		j6=new SportLabel("Name: "+Name(5)+" "+"energie: "+Energie(5)+"");
		j6.setBackground(new Color(28, 28, 28));
		j7=new SportLabel("Name: "+Name(6)+" "+"energie: "+Energie(6)+"");
		j7.setBackground(new Color(28, 28, 28));
		j8=new SportLabel("Name: "+Name(7)+" "+"energie: "+Energie(7)+"");
		j8.setBackground(new Color(28, 28, 28));
		j9=new SportLabel("Name: "+Name(8)+" "+"energie: "+Energie(8)+"");
		j9.setBackground(new Color(28, 28, 28));
		j10=new SportLabel("Name: "+Name(9)+" "+"energie: "+Energie(9)+"");
		j10.setBackground(new Color(28, 28, 28));
		j11=new SportLabel("Name: "+Name(9)+" "+"energie: "+Energie(9)+"");
		j11.setBackground(new Color(28, 28, 28));
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
	}
	
	public void Equipe_2() {
		equipe_2.setLayout(new GridLayout(11,1));
		int test=10;
		j12=new SportLabel("Name: "+Name2(0)+" "+"energie: "+Energie2(0)+"");
		j12.setBackground(new Color(28, 28, 28));
		j13=new SportLabel("Name: "+Name2(1)+" "+"energie: "+Energie2(1)+"");
		j13.setBackground(new Color(28, 28, 28));
		j14=new SportLabel("Name: "+Name2(2)+" "+"energie: "+Energie2(2)+"");
		j14.setBackground(new Color(28, 28, 28));
		j15=new SportLabel("Name: "+Name2(3)+" "+"energie: "+Energie2(3)+"");
		j15.setBackground(new Color(28, 28, 28));
		j16=new SportLabel("Name: "+Name2(4)+" "+"energie: "+Energie2(4)+"");
		j16.setBackground(new Color(28, 28, 28));
		j17=new SportLabel("Name: "+Name2(5)+" "+"energie: "+Energie2(5)+"");
		j17.setBackground(new Color(28, 28, 28));
		j18=new SportLabel("Name: "+Name2(6)+" "+"energie: "+Energie2(6)+"");
		j18.setBackground(new Color(28, 28, 28));
		j19=new SportLabel("Name: "+Name2(7)+" "+"energie: "+Energie2(7)+"");
		j19.setBackground(new Color(28, 28, 28));
		j20=new SportLabel("Name: "+Name2(8)+" "+"energie: "+Energie2(8)+"");
		j20.setBackground(new Color(28, 28, 28));
		j21=new SportLabel("Name: "+Name2(9)+" "+"energie: "+Energie2(9)+"");
		j21.setBackground(new Color(28, 28, 28));
		j22=new SportLabel("Name: "+Name2(10)+" "+"energie: "+Energie2(10)+"");
		j22.setBackground(new Color(28, 28, 28));
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
	}
	
	
	
	public int Energie(int i) {
		return players1.get(i).getEnergie();
	}
	
	public int Energie2(int i) {
		return players2.get(i).getEnergie();
	}
	
	public String Name(int i) {
		return players1.get(i).getName();
	}
	
	public String Name2(int i) {
		return players2.get(i).getName();
	}
		
}