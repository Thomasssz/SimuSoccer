package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chrono.Chronometer;
import chrono.CyclicCounter;

import data.Ball;
import data.Match;
import data.Player;
import data.Team;
import delimitations.Corner;
import delimitations.Touche;
import process.MatchManager;

/**
 * Main GUI class for chronometer.
 * 
 * @author Tianxiao.Liu@u-cergy.fr
 **/
public class ChronometerGUI extends JFrame implements Runnable {

	private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(1100, 800);
	private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(900, 650);

	private static Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);

	/**
	 * The normal speed is 1000, e.q. one refresh per second (1000 milliseconds).
	 */
	private static final int CHRONO_SPEED = 100;
	
	public static final int SIMULATION_CHRONO_SPEED = 1 ;

	private Ball ballon = new Ball();

	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private static ArrayList<Player> team2 = new ArrayList<Player>();
	
	private Corner cornertest = new Corner() ;
	private Touche touchetest = new Touche() ;
	private Match match = new Match();

	public Chronometer getChronometer() {
		return chronometer;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * The core functional part : the chronometer.
	 */
	private Chronometer chronometer = new Chronometer();

	private JButton startButton = new JButton("Start");
	private JButton CharacteristicsButton = new JButton("Characteristics");

	private JLabel scoreteam1Label = new JLabel("Blue 0");
	private JLabel scoreteam2Label = new JLabel("0 Red");

	private JLabel scoreteam1Value = new JLabel("");
	private JLabel scoreteam2Value = new JLabel("");

	private JLabel minuteLabel = new JLabel("Minute:");
	private JLabel secondLabel = new JLabel("Second:");

	private JLabel minuteValue = new JLabel("");
	private JLabel secondValue = new JLabel("");

	private JPanel control = new JPanel();

	/**
	 * The dashboard part is managed in a separate class.
	 */
	private Dashboard dashboard = new Dashboard(team1, team2, ballon,cornertest,touchetest,match);
	
	private MatchManager matchprocess = new MatchManager();

	/**
	 * This instance is used in the inner classes for different action listeners.
	 */
	private ChronometerGUI instance = this;

	/**
	 * Initial status of for the start button.
	 */
	private boolean stop = true;

	public ChronometerGUI(String title) {
		super(title);
		init();
	}

	private void init() {

		Team blue = new Team("1", team1, "blue");
		Team red = new Team("2", team2, "red");

		blue.createteams(blue);
		red.createteams(red);

		team1 = blue.getPlayers();
		team2 = red.getPlayers();
		
		

		updateValues();

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		scoreteam1Label.setFont(font);
		control.add(scoreteam1Label);
		scoreteam2Label.setFont(font);
		control.add(scoreteam2Label);

		scoreteam1Value.setFont(font);
		control.add(scoreteam1Value);
		scoreteam2Value.setFont(font);
		control.add(scoreteam2Value);

		control.setLayout(new FlowLayout(FlowLayout.CENTER));

		minuteLabel.setFont(font);
		control.add(minuteLabel);
		minuteValue.setFont(font);
		control.add(minuteValue);

		secondLabel.setFont(font);
		control.add(secondLabel);
		secondValue.setFont(font);
		control.add(secondValue);

		startButton.setFont(font);
		startButton.addActionListener(new StartStopAction());
		control.add(startButton);

		CharacteristicsButton.setFont(font);
		CharacteristicsButton.addActionListener(new CharacteristicsAction());
		control.add(CharacteristicsButton);

		contentPane.add(BorderLayout.NORTH, control);

		dashboard.setPreferredSize(IDEAL_DASHBOARD_DIMENSION);
		contentPane.add(BorderLayout.SOUTH, dashboard);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setPreferredSize(new Dimension(900, 500));
		setResizable(false);
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
		minuteValue.setText(minute.toString() + " ");

		CyclicCounter second = chronometer.getSecond();
		secondValue.setText(second.toString() + " ");

		// This part is for graphical time printing.

		// The dashboard needs to be reprinted when hour, minute or second values
		// change.

		matchprocess.matchProcess(dashboard);

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
				startButton.setText("Start");
			} else {
				stop = false;
				startButton.setText("Pause");
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
			
			 startButton.setText("Resume"); 
			// chronometer.init(); 
			// updateValues();
			 
		}

	}

	public static void main(String[] args) {
		new ChronometerGUI("Simu soccer");
	}

}
