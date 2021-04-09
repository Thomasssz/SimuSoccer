package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Match;
import ihm.components.SportButton;
import ihm.components.SportLabel;

@SuppressWarnings("serial")
public class Score extends JFrame {
	private Match match = new Match();
	private SportLabel scoreteam1Label1,scoreteam2Label1,scoreteam1Value1,scoreteam2Value1=new SportLabel("");
	private SportButton retour;
	private JPanel contentPane=new JPanel();
	
	public Score(Dashboard dash) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1400, 80, 300,400);
		setTitle("Score");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(28, 28, 28));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		retour=new SportButton("Return to the game");
		retour.setBackground(new Color(28, 28, 28));
		retour.setBounds(40,10,200,50);
		retour.addActionListener(new Retour());
		
		scoreteam1Label1 = new SportLabel("Blue");
		scoreteam1Label1.setBackground(new Color(28, 28, 28));
		scoreteam1Label1.setBounds(50,100,50,50);
		
		scoreteam2Label1 = new SportLabel("Red");
		scoreteam2Label1.setBackground(new Color(28, 28, 28));
		scoreteam2Label1.setBounds(50,200,50,50);
		
		 scoreteam1Value1 = new SportLabel(""+dash.getMatch().getScoreteam1()+"");
		 System.out.println(match.getScoreteam1());
		 scoreteam1Value1.setBackground(new Color(28, 28, 28));
		 scoreteam1Value1.setBounds(140,100,50,50);
		 
		 scoreteam2Value1 = new SportLabel(""+dash.getMatch().getScoreteam2()+"");
		 System.out.println(match.getScoreteam2());
		 scoreteam2Value1.setBackground(new Color(28, 28, 28));
		 scoreteam2Value1.setBounds(140,200,50,50);
		 
		 contentPane.add(retour);
		 contentPane.add(scoreteam1Label1);
		 contentPane.add(scoreteam1Value1);
		 contentPane.add(scoreteam2Label1);
		 contentPane.add(scoreteam2Value1);
		 setVisible(true);
		 
	}


	private class Retour implements ActionListener { 
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			 
		}

	}
	}

