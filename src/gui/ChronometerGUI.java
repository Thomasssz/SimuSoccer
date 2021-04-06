package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import chrono.Chronometer;
import chrono.CyclicCounter;

import data.Ball;
import data.Match;
import data.Player;
import data.Team;
import delimitations.Corner;
import delimitations.Touche;
import ihm.components.SportButton;
import ihm.components.SportLabel;
import process.Endurance;
import process.MatchManager;

/**
 * Main GUI class for chronometer.
 * 
 * @author Tianxiao.Liu@u-cergy.fr
 **/
public class ChronometerGUI extends JFrame implements Runnable {
	private Ball ballon = new Ball();
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private static ArrayList<Player> team2 = new ArrayList<Player>();
	private Corner cornertest = new Corner() ;
	private Touche touchetest = new Touche() ;
	private Match match = new Match();
	private Dashboard dashboard = new Dashboard(team1, team2, ballon,cornertest,touchetest,match);
	private MatchManager matchprocess = new MatchManager(this);
	private ChronometerGUI instance = this;
	
	private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(1800, 900);
	private static Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);
	private Dimension dim;
	
	private int CHRONO_SPEED = 100 ;
	public static final int SIMULATION_CHRONO_SPEED = 1 ;
	private static final long serialVersionUID = 1L;
	private Chronometer chronometer = new Chronometer();
	private boolean stop = true;
	
	public int getCHRONO_SPEED() {
		return CHRONO_SPEED;
	}
	public void setCHRONO_SPEED(int cHRONO_SPEED) {
		CHRONO_SPEED = cHRONO_SPEED;
	}
	public Chronometer getChronometer() {
		return chronometer;
	}
	
	SportButton startButton1,charButton ;
	
	private JRadioButton rdbtns0=new JRadioButton("speed 1 (x1)");
	private JRadioButton rdbtns1=new JRadioButton("speed 2 (x2)");
	private JRadioButton rdbtns2=new JRadioButton("speed 3 (x4)");
	private JRadioButton rdbtns3=new JRadioButton("speed 4 (x10)"); 
	
	SportLabel scoreteam1Label1,scoreteam1Value1,scoreteam2Label1,scoreteam2Value1,minuteLabel1,secondLabel1,minuteValue1,secondValue1,Temps,Acceleration,teamB,teamR;

	
	private JPanel endurance,score,temps,start_stop = new JPanel();
	

	private JPanel control,dashboardPanel,contentPane,start_acceleration,barre_energie,equipe_1,equipe_2 = new JPanel();

	public ChronometerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800,900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(28, 28, 28));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Team blue = new Team("1", team1, "blue");
		Team red = new Team("2", team2, "red");

		blue.createteams(blue);
		red.createteams(red);

		team1 = blue.getPlayers();
		team2 = red.getPlayers();
		
		
	
		dashboard.setPreferredSize(new Dimension(850,590));
		dashboard.setBounds(320,250,850,590);
		
		start_stop=new JPanel();
		start_stop.setPreferredSize(new Dimension(400,100));
		start_stop.setBounds(600,10,400,40);
		Start_stop();
		
		temps=new JPanel();
		temps.setPreferredSize(new Dimension(700,100));
		temps.setBounds(500,70,500,40);
		temps();
		
		start_acceleration=new JPanel();
		start_acceleration.setPreferredSize(new Dimension(1000,100));
		start_acceleration.setBounds(200,120,1000,50);
		Start_acceleration();
		
		score=new JPanel();
		score.setPreferredSize(new Dimension(600,80));
		score.setBounds(400,180,600,80);
		Score();
		
		
		
		barre_energie.setPreferredSize(new Dimension(490,865));
		barre_energie.setBounds(1250,20,490,865);
		
		contentPane.add(start_stop);
		contentPane.add(dashboard);
		contentPane.add(temps);
		contentPane.add(start_acceleration);
		contentPane.add(score);
		contentPane.add(barre_energie);
		setVisible(true);
	}
	
	public void temps() {
		temps.setLayout(new GridLayout(1,5));
		temps.setBackground(new Color(28, 28, 28));
		
		Temps=new SportLabel("Temps :");
		Temps.setBackground(new Color(28, 28, 28));
		
		minuteValue1 = new SportLabel("");
		secondValue1 = new SportLabel("");
		minuteValue1.setBackground(new Color(28, 28, 28));
		secondValue1.setBackground(new Color(28, 28, 28));
		minuteLabel1 = new SportLabel("Minute:");
		minuteLabel1.setBackground(new Color(28, 28, 28));
		secondLabel1 = new SportLabel("Second:");
		secondLabel1.setBackground(new Color(28, 28, 28));
		updateValues();
		temps.add(Temps);
		temps.add(minuteLabel1);
		temps.add(minuteValue1);
		temps.add(secondLabel1);
		temps.add(secondValue1);
		
		}
	
	public void Start_acceleration() {
		start_acceleration.setLayout(new GridLayout(1,5));
		start_acceleration.setBackground(new Color(28, 28, 28));
		
		Acceleration= new SportLabel("Acceleration :");
		Acceleration.setBackground(new Color(28, 28, 28));
		
		rdbtns0.setFont(font);
		rdbtns0.setForeground(Color.white);
		rdbtns0.setBackground(new Color(28, 28, 28));
		rdbtns0.addActionListener(new SpeedAction0());
		
		rdbtns1.setFont(font);
		rdbtns1.setForeground(Color.white);
		rdbtns1.addActionListener(new SpeedAction1());
		rdbtns1.setBackground(new Color(28, 28, 28));
		
		rdbtns2.setFont(font);
		rdbtns2.setForeground(Color.white);
		rdbtns2.addActionListener(new SpeedAction2());
		rdbtns2.setBackground(new Color(28, 28, 28));
		
		rdbtns3.setFont(font);
		rdbtns3.setForeground(Color.white);
		rdbtns3.addActionListener(new SpeedAction3());
		rdbtns3.setBackground(new Color(28, 28, 28));

		start_acceleration.add(Acceleration);
		start_acceleration.add(rdbtns0);
		start_acceleration.add(rdbtns1);
		start_acceleration.add(rdbtns2);
		start_acceleration.add(rdbtns3);
	}
	
	public void Start_stop() {
		
		start_stop.setLayout(new GridLayout(1,2));
		start_stop.setBackground(new Color(28, 28, 28));
		
		startButton1 = new SportButton("Start");
		startButton1.setBackground(new Color(28, 28, 28));
		startButton1.addActionListener(new StartStopAction());
		
		charButton = new SportButton("Characteristics");
		charButton.setBackground(new Color(28, 28, 28));
		charButton.addActionListener(new CharacteristicsAction());
		
		start_stop.add(startButton1);
		start_stop.add(charButton);
		}
	
	public void Score() {
		score.setLayout(new GridLayout(2,2));
		score.setBackground(new Color(28, 28, 28));
		scoreteam1Label1 = new SportLabel("Blue");
		scoreteam1Label1.setBackground(new Color(28, 28, 28));
		scoreteam2Label1 = new SportLabel("Red");
		scoreteam2Label1.setBackground(new Color(28, 28, 28));

		 scoreteam1Value1 = new SportLabel("");
		 scoreteam1Value1.setBackground(new Color(28, 28, 28));
		 scoreteam2Value1 = new SportLabel("");
		 scoreteam2Value1.setBackground(new Color(28, 28, 28));
		 
		 score.add(scoreteam1Label1);
		 
		 score.add(scoreteam1Value1);
		 score.add(scoreteam2Label1);
		 score.add(scoreteam2Value1);
		
		 
	}


	private void updateValues() {

		// this part is for textual score printing.

		/*
		 * Match scoreteam1 = match.getScore();
		 * scoreteam1Value.setText(scoreteam1.toString() + " ");
		 * 
		 * Match scoreteam2 = match.getScore();
		 * scoreteam2Value.setText(scoreteam2.toString() + " ");
		 */

		// This part is for textual time printing.

		CyclicCounter minute = chronometer.getMinute();
		minuteValue1.setText(minute.toString() + " ");

		CyclicCounter second = chronometer.getSecond();
		secondValue1.setText(second.toString() + " ");

		// This part is for graphical time printing.

		// The dashboard needs to be reprinted when hour, minute or second values
		matchprocess.matchProcess(dashboard,this);
		dashboard.repaint();
	}

	/**
	 * Defines what to do for each time unit (by default 1 second) : it increments
	 * the chronometer
	 */
	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(CHRONO_SPEED);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			chronometer.increment();

			// Ensure that the chronometer is not stopped during the iteration.
			if (!stop) {
				updateValues();
				CronoUnitTime();
			}
		}

	}
	
	public static void CronoUnitTime() {
        try {
            Thread.sleep(SIMULATION_CHRONO_SPEED);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stop) {
				stop = true;
				startButton1.setText("Start");
			} else {
				stop = false;
				startButton1.setText("Pause");
				Thread chronoThread = new Thread(instance);
				chronoThread.start();
			}
		}
	}

	private class CharacteristicsAction implements ActionListener { 

		@Override
		public void actionPerformed(ActionEvent e) {
			stop = true;
			Feature Characteristics_window = new Feature(team1,team2);
			
			charButton.setText("Resume"); 
			// chronometer.init(); 
			// updateValues();
			 
		}

	}
	
	private class SpeedAction0 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			setCHRONO_SPEED(100);
		}
		
		
	}
	
	private class SpeedAction1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			setCHRONO_SPEED(50);
		}
		
		
	}
	
	private class SpeedAction2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			setCHRONO_SPEED(25);
		}
		
		
	}
	
	private class SpeedAction3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			setCHRONO_SPEED(10);
		}
		
		
	}

	
public String toStringB() {
		
		String result = "Energie equipe bleu : \n \n";
			for(int i = 0; i < team1.size(); i++) { 
	    			result += "Joueur " + team1.get(i).getNumber() + " = " + team1.get(i).getEnergie() + "% \n";
	    	}
			return result;
		}
	
	public String toStringR0() {
		Endurance end=new Endurance();
		//end.baisse(dashboard, instance);
		int ji=0;
		String result = "Joueur " + team2.get(ji).getNumber() + ":"+ team2.get(ji).getEnergie() + "";
		return result;
		}

	/*public static void main(String[] args) {
		new ChronometerGUI();
	}*/

}