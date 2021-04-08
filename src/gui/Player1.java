package gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Player;
import ihm.components.SportLabel;

@SuppressWarnings("serial")
public class Player1 extends JFrame {
	
	private String name;
	private JPanel defense2,dribbles2,speed2,shoot2,energie2,endurance2= new JPanel();
	private SportLabel label,defense,shoot,speed,dribbles,defense1,dribbles1,shoot1,speed1,energie1,endurance1,energie,endurance;
	
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private JPanel contentPane=new JPanel();
	
	public Player1(ArrayList<Player> player_team, String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400,600);
		setTitle("Player");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(28, 28, 28));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		label = new SportLabel("Numero Maillot : "+ name+"");
		label.setBackground(new Color(28, 28, 28));
		label.setBounds(100,10,200,40);
		team1 = player_team ;
		
		defense2=new JPanel();
		defense2.setPreferredSize(new Dimension(350,60));
		defense2.setBackground(new Color(28, 28, 28));
		defense2.setBounds(25,60,350,60);
		Defense1(name);
		
		dribbles2=new JPanel();
		dribbles2.setPreferredSize(new Dimension(350,60));
		dribbles2.setBackground(new Color(28, 28, 28));
		dribbles2.setBounds(25,130,350,60);
		Dribbles1(name);
		
		shoot2=new JPanel();
		shoot2.setPreferredSize(new Dimension(350,60));
		shoot2.setBackground(new Color(28, 28, 28));
		shoot2.setBounds(25,200,350,60);
		Shoot1(name);
		
		speed2=new JPanel();
		speed2.setPreferredSize(new Dimension(350,60));
		speed2.setBackground(new Color(28, 28, 28));
		speed2.setBounds(25,270,350,60);
		Speed1(name);
		
		energie2=new JPanel();
		energie2.setPreferredSize(new Dimension(350,60));
		energie2.setBackground(new Color(28, 28, 28));
		energie2.setBounds(25,340,350,60);
		Energie1(name);
		
		endurance2=new JPanel();
		endurance2.setPreferredSize(new Dimension(350,60));
		endurance2.setBackground(new Color(28, 28, 28));
		endurance2.setBounds(25,410,350,60);
		Endurance1(name);
		
		  
		contentPane.add(label);
		contentPane.add(defense2);
		contentPane.add(dribbles2);
		contentPane.add(shoot2);
		contentPane.add(speed2);
		contentPane.add(endurance2);
		contentPane.add(energie2);
		setVisible(true);
	} 
	
	public void  Defense1(String name) {
		defense2.setLayout(new GridLayout(1,2));
		defense = new SportLabel("Defense : ");
		defense.setBackground(new Color(28, 28, 28));
		
		defense1 = new SportLabel(""+String.valueOf(Defense(name))+"");
		defense1.setBackground(new Color(28, 28, 28));
		defense2.add(defense);
		defense2.add(defense1);
		
	}
	
	public void  Dribbles1(String name) {
		dribbles2.setLayout(new GridLayout(1,2));
		dribbles= new SportLabel("Dribbles : ");
		dribbles.setBackground(new Color(28, 28, 28));
		
		dribbles1 = new SportLabel(""+String.valueOf(Dribbles(name))+"");
		dribbles1.setBackground(new Color(28, 28, 28));
		dribbles2.add(dribbles);
		dribbles2.add(dribbles1);
		
	}
	
	public void Shoot1(String name) {
		shoot2.setLayout(new GridLayout(1,2));
		shoot= new SportLabel("Shoot : ");
		shoot.setBackground(new Color(28, 28, 28));
		
		shoot1 = new SportLabel(""+String.valueOf(Shoot(name))+"");
		shoot1.setBackground(new Color(28, 28, 28));
		shoot2.add(shoot);
		shoot2.add(shoot1);
	}
	
	public void Speed1(String name) {
		speed2.setLayout(new GridLayout(1,2));
		speed= new SportLabel("Speed : ");
		speed.setBackground(new Color(28, 28, 28));
		
		speed1 = new SportLabel(""+String.valueOf(Speed(name))+"");
		speed1.setBackground(new Color(28, 28, 28));
		speed2.add(speed);
		speed2.add(speed1);
	}
	
	public void Energie1(String name) {
		energie2.setLayout(new GridLayout(1,2));
		energie= new SportLabel("Energie : ");
		energie.setBackground(new Color(28, 28, 28));
		
		energie1 = new SportLabel(""+String.valueOf(Energie(name))+"");
		energie1.setBackground(new Color(28, 28, 28));
		energie2.add(energie);
		energie2.add(energie1);
	}
	
	public void Endurance1(String name) {
		endurance2.setLayout(new GridLayout(1,2));
		endurance= new SportLabel("Endurance : ");
		endurance.setBackground(new Color(28, 28, 28));
		
		endurance1 = new SportLabel(""+String.valueOf(Endurance(name))+"");
		endurance1.setBackground(new Color(28, 28, 28));
		endurance2.add(endurance);
		endurance2.add(endurance1);
	}
	
	public int Energie(String name) {
		int result = 0;
			for(int i = 0; i < team1.size(); i++) { 
	    		if(team1.get(i).getName().equals(name)) {
	    			result = team1.get(i).getEnergie();
	    		}
	    	}
			return result;
		}

	public int Endurance(String name) {
	
	int result = 0;
		for(int i = 0; i < team1.size(); i++) { 
    		if(team1.get(i).getName().equals(name)) {
    			result = team1.get(i).getEndurance();
    		}
    	}
		return result;
	}
	
	
	public int Defense(String name) {
		
		int result = 0;
			for(int i = 0; i < team1.size(); i++) { 
	    		if(team1.get(i).getName().equals(name)) {
	    			result = team1.get(i).getDefense();
	    		}
	    	}
			return result;
		}
	
	public int Speed(String name) {
		
		int result = 0;
			for(int i = 0; i < team1.size(); i++) { 
	    		if(team1.get(i).getName().equals(name)) {
	    			result = team1.get(i).getSpeed();
	    		}
	    	}
			return result;
		}
	
	public int Shoot(String name) {
		
		int result=0;
			for(int i = 0; i < team1.size(); i++) { 
				System.out.println("ok1");
	    		if(team1.get(i).getName().equals(name)) {
	    			System.out.println("ok");
	    			return result = team1.get(i).getShoot();
	    			
	    		}
	    	}
			return result;
			
		}

	public int Dribbles(String name) {
	
	int result = 0;
		for(int i = 0; i < team1.size(); i++) { 
    		if(team1.get(i).getName().equals(name)) {
    			result += team1.get(i).getDribbles();
    		}
    	}
		return result;
	}
	

}