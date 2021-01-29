package chrono;

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
	private static final int CHRONO_SPEED = 1000;

	private static final long serialVersionUID = 1L;

	/**
	 * The core functional part : the chronometer.
	 */
	private Chronometer chronometer = new Chronometer();

	private JButton startButton = new JButton(" Start ");
	private JButton clearButton = new JButton(" Clear ");

	private JLabel hourLabel = new JLabel("Hour:");
	private JLabel minuteLabel = new JLabel("Minute:");
	private JLabel secondLabel = new JLabel("Second:");

	private JLabel hourValue = new JLabel("");
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

		control.setLayout(new FlowLayout(FlowLayout.CENTER));
		hourLabel.setFont(font);
		control.add(hourLabel);
		hourValue.setFont(font);
		control.add(hourValue);

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

		clearButton.setFont(font);
		clearButton.addActionListener(new ClearAction());
		control.add(clearButton);

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
		// This part is for textual time printing.
		CyclicCounter hour = chronometer.getHour();
		hourValue.setText(hour.toString() + " ");

		CyclicCounter minute = chronometer.getMinute();
		minuteValue.setText(minute.toString() + " ");

		CyclicCounter second = chronometer.getSecond();
		secondValue.setText(second.toString() + " ");

		// This part is for graphical time printing.
		
		dashboard.setDefault_x_attaquant1_bleu(dashboard.getDefault_x_attaquant1_bleu()+10);
		dashboard.setDefault_x_attaquant2_bleu(dashboard.getDefault_x_attaquant2_bleu()+10);
		
		dashboard.setDefault_x_milieu1_bleu(dashboard.getDefault_x_milieu1_bleu()+10);
		dashboard.setDefault_x_milieu2_bleu(dashboard.getDefault_x_milieu2_bleu()+10);
		dashboard.setDefault_x_milieu3_bleu(dashboard.getDefault_x_milieu3_bleu()+10);
		dashboard.setDefault_x_milieu4_bleu(dashboard.getDefault_x_milieu4_bleu()+10);
		
		dashboard.setDefault_x_defenseur1_bleu(dashboard.getDefault_x_defenseur1_bleu()+10);
		dashboard.setDefault_x_defenseur2_bleu(dashboard.getDefault_x_defenseur2_bleu()+10);
		dashboard.setDefault_x_defenseur3_bleu(dashboard.getDefault_x_defenseur3_bleu()+10);
		dashboard.setDefault_x_defenseur4_bleu(dashboard.getDefault_x_defenseur4_bleu()+10);
		
		dashboard.setDefault_x_attaquant1_rouge(dashboard.getDefault_x_attaquant1_rouge()+10);
		dashboard.setDefault_x_attaquant2_rouge(dashboard.getDefault_x_attaquant2_rouge()+10);
		
		dashboard.setDefault_x_milieu1_rouge(dashboard.getDefault_x_milieu1_rouge()+10);
		dashboard.setDefault_x_milieu2_rouge(dashboard.getDefault_x_milieu2_rouge()+10);
		dashboard.setDefault_x_milieu3_rouge(dashboard.getDefault_x_milieu3_rouge()+10);
		dashboard.setDefault_x_milieu4_rouge(dashboard.getDefault_x_milieu4_rouge()+10);
		
		dashboard.setDefault_x_defenseur1_rouge(dashboard.getDefault_x_defenseur1_rouge()+10);
		dashboard.setDefault_x_defenseur2_rouge(dashboard.getDefault_x_defenseur2_rouge()+10);
		dashboard.setDefault_x_defenseur3_rouge(dashboard.getDefault_x_defenseur3_rouge()+10);
		dashboard.setDefault_x_defenseur4_rouge(dashboard.getDefault_x_defenseur4_rouge()+10);

		// The dashboard needs to be reprinted when hour, minute or second values change.
		dashboard.repaint();
	}

	private double calculateRadian(float value) {
		return ((-value / 30) * Math.PI) + (Math.PI / 2);
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
			}
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
		new ChronometerGUI("Chronometer");
	}

}
