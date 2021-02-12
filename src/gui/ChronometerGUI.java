package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chrono.Chronometer;
import chrono.CyclicCounter;
import data.Match;

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

	private static final int CHRONO_SPEED1 = 10;
	
	private static final int CHRONO_SPEED2 = 1;	


	private JRadioButton fiveButton=new JRadioButton("five");
	private JRadioButton tenButton=new JRadioButton("ten");


	public Chronometer getChronometer() {
		return chronometer;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * The core functional part : the chronometer.
	 */
	private Chronometer chronometer = new Chronometer();

	private JButton startButton = new JButton(" Start ");
	//private JButton clearButton = new JButton(" Clear ");
	
	private JLabel scoreteam1Label = new JLabel("Team1");
    private JLabel scoreteam2Label = new JLabel("Team2");

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
	private Dashboard dashboard = new Dashboard();

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
		
		fiveButton.setFont(font);
		fiveButton.addActionListener(new SpeedAction1());
		control.add(fiveButton);
		
		tenButton.setFont(font);
		tenButton.addActionListener(new SpeedAction2());
		control.add(tenButton);

		/*clearButton.setFont(font);
		clearButton.addActionListener(new ClearAction());
		control.add(clearButton);*/

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
		
		/* Match scoreteam1 = match.getScore();
		scoreteam1Value.setText(scoreteam1.toString() + " ");
		
		Match scoreteam2 = match.getScore();
		scoreteam2Value.setText(scoreteam2.toString() + " "); */
		
		// This part is for textual time printing.
	
		CyclicCounter minute = chronometer.getMinute();
		minuteValue.setText(minute.toString() + " ");

		CyclicCounter second = chronometer.getSecond();
		secondValue.setText(second.toString() + " ");

		// This part is for graphical time printing.
		
		/*dashboard.setDefault_x_attaquant1_bleu(dashboard.getDefault_x_attaquant1_bleu()+10);
		dashboard.setDefault_x_attaquant2_bleu(dashboard.getDefault_x_attaquant2_bleu()+10);
		
		dashboard.setDefault_x_milieu1_bleu(dashboard.getDefault_x_milieu1_bleu()+10);
		dashboard.setDefault_x_milieu2_bleu(dashboard.getDefault_x_milieu2_bleu()+10);
		dashboard.setDefault_x_milieu3_bleu(dashboard.getDefault_x_milieu3_bleu()+10);
		dashboard.setDefault_x_milieu4_bleu(dashboard.getDefault_x_milieu4_bleu()+10);
		
		dashboard.setDefault_x_defenseur1_bleu(dashboard.getDefault_x_defenseur1_bleu()+10);
		dashboard.setDefault_x_defenseur2_bleu(dashboard.getDefault_x_defenseur2_bleu()+10);
		dashboard.setDefault_x_defenseur3_bleu(dashboard.getDefault_x_defenseur3_bleu()+10);
		dashboard.setDefault_x_defenseur4_bleu(dashboard.getDefault_x_defenseur4_bleu()+10);
		
		dashboard.setDefault_x_attaquant1_rouge(dashboard.getDefault_x_attaquant1_rouge()-10);
		dashboard.setDefault_x_attaquant2_rouge(dashboard.getDefault_x_attaquant2_rouge()-10);
		
		dashboard.setDefault_x_milieu1_rouge(dashboard.getDefault_x_milieu1_rouge()-10);
		dashboard.setDefault_x_milieu2_rouge(dashboard.getDefault_x_milieu2_rouge()-10);
		dashboard.setDefault_x_milieu3_rouge(dashboard.getDefault_x_milieu3_rouge()-10);
		dashboard.setDefault_x_milieu4_rouge(dashboard.getDefault_x_milieu4_rouge()-10);
		
		dashboard.setDefault_x_defenseur1_rouge(dashboard.getDefault_x_defenseur1_rouge()-10);
		dashboard.setDefault_x_defenseur2_rouge(dashboard.getDefault_x_defenseur2_rouge()-10);
		dashboard.setDefault_x_defenseur3_rouge(dashboard.getDefault_x_defenseur3_rouge()-10);
		dashboard.setDefault_x_defenseur4_rouge(dashboard.getDefault_x_defenseur4_rouge()-10);

		// The dashboard needs to be reprinted when hour, minute or second values change.*/
		dashboard.repaint();
	}

	/**
	 * Defines what to do for each time unit (by default 1 second) : it increments the chronometer
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
				ChangePlayers(chronometer);
			}
		}
	}

	public void ChangePlayers(Chronometer chrono) {
	
		CyclicCounter minute = chronometer.getMinute();
		MiddleTime middletime =new MiddleTime();
		boolean middle=middletime.middletime(minute);
		if(middle==true) {
	Team.createteams();
	Team.players2.get(10).setX(Team.players1.get(10).getX());
        Team.players2.get(9).setX(Team.players1.get(9).getX());
        Team.players2.get(8).setX(Team.players1.get(8).getX());
        Team.players2.get(7).setX(Team.players1.get(7).getX());
        Team.players2.get(6).setX(Team.players1.get(6).getX());
        Team.players2.get(5).setX(Team.players1.get(5).getX());
        Team.players2.get(4).setX(Team.players1.get(4).getX());
        Team.players2.get(3).setX(Team.players1.get(3).getX());
        Team.players2.get(2).setX(Team.players1.get(2).getX());
        Team.players2.get(1).setX(Team.players1.get(1).getX());
        Team.players2.get(0).setX(Team.players1.get(0).getX());
        Team.players1.get(10).setX(Team.players2.get(10).getX());
        Team.players1.get(9).setX(Team.players2.get(9).getX());
        Team.players1.get(8).setX(Team.players2.get(8).getX());
        Team.players1.get(7).setX(Team.players2.get(7).getX());
        Team.players1.get(6).setX(Team.players2.get(6).getX());
        Team.players1.get(5).setX(Team.players2.get(5).getX());
        Team.players1.get(4).setX(Team.players2.get(4).getX());
        Team.players1.get(3).setX(Team.players2.get(3).getX());
        Team.players1.get(2).setX(Team.players2.get(2).getX());
        Team.players1.get(1).setX(Team.players2.get(1).getX());
        Team.players1.get(0).setX(Team.players2.get(0).getX());
		}
	}
	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stop) {
				stop = true;
				startButton.setText(" Start ");
			} else {
				stop = false;
				startButton.setText(" Pause ");
				Thread chronoThread = new Thread(instance);
				chronoThread.start();
				Match.engagement();
			}
		}
	}

	private class ClearAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			stop = true;
			startButton.setText(" Start ");
			chronometer.init();
			updateValues();
		}

	}

	public static void main(String[] args) {
		new ChronometerGUI("Simu soccer");
	}

}
