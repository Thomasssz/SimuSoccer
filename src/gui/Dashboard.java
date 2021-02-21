package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import data.Ball;
import data.Player;
import delimitations.Corner;
import delimitations.Sortie;
import delimitations.Surface;
import delimitations.Touche;
import process.MatchManager;

/**
 * This class manages the dashboard (minute, second) of chronometer GUI.
 * 
 * This class is only responsible of graphical result printing.
 * 
 * There is no algorithmic processing in this class.
 * 
 * @author simu soccer
 * 
 */
public class Dashboard extends JPanel {
	
	private ArrayList<Player> team1 ;
	private ArrayList<Player> team2 ;
	private Ball ballon ;
	private Corner testcorner ;
	private Touche testtouche ;
	
	private boolean stop_action = false ;
	
	public Dashboard(ArrayList<Player> team1, ArrayList<Player> team2, Ball ballon, Corner testcorner, Touche testtouche) {
		this.team1 = team1 ;
		this.team2 = team2 ;
		this.ballon = ballon ;
		this.testcorner = testcorner ;
		this.testtouche = testtouche ;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * Hour, minute and second have their initial positions.
	 */

	private ImageIcon icon = new ImageIcon("src/img/stade.jpg");
	Image pitch = icon.getImage();


	/**
	 * Defines what to do when the repaint() method is called.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(pitch, 20, 20, 850, 590, null);

		g.setColor(Color.PINK);
		
		g.drawLine(Sortie.getSortieHautGaucheX(), Sortie.getSortieHautGaucheY(), Sortie.getSortieHautDroiteX(), Sortie.getSortieHautDroiteY());
		g.drawLine(Sortie.getSortieHautGaucheX(), Sortie.getSortieHautGaucheY(), Sortie.getSortieBasGaucheX(), Sortie.getSortieBasGaucheY());
		g.drawLine(Sortie.getSortieBasDroiteX(), Sortie.getSortieBasDroiteY(), Sortie.getSortieHautDroiteX(), Sortie.getSortieHautDroiteY());
		g.drawLine(Sortie.getSortieBasGaucheX(), Sortie.getSortieBasGaucheY(), Sortie.getSortieBasDroiteX(), Sortie.getSortieBasDroiteY());
		
		g.setColor(Color.CYAN);
		
		g.drawLine(Surface.getSurfacegaucheHautGaucheX(), Surface.getSurfacegaucheHautGaucheY(), Surface.getSurfacegaucheHautDroiteX(), Surface.getSurfacegaucheHautDroiteY());
		g.drawLine(Surface.getSurfacegaucheHautGaucheX(), Surface.getSurfacegaucheHautGaucheY(), Surface.getSurfacegaucheBasGaucheX(), Surface.getSurfacegaucheBasGaucheY());
		g.drawLine(Surface.getSurfacegaucheBasDroiteX(), Surface.getSurfacegaucheBasDroiteY(), Surface.getSurfacegaucheHautDroiteX(), Surface.getSurfacegaucheHautDroiteY());
		g.drawLine(Surface.getSurfacegaucheBasGaucheX(), Surface.getSurfacegaucheBasGaucheY(), Surface.getSurfacegaucheBasDroiteX(), Surface.getSurfacegaucheBasDroiteY());
		
		g.drawLine(Surface.getSurfacedroiteHautGaucheX(), Surface.getSurfacedroiteHautGaucheY(), Surface.getSurfacedroiteHautDroiteX(), Surface.getSurfacedroiteHautDroiteY());
		g.drawLine(Surface.getSurfacedroiteHautGaucheX(), Surface.getSurfacedroiteHautGaucheY(), Surface.getSurfacedroiteBasGaucheX(), Surface.getSurfacedroiteBasGaucheY());
		g.drawLine(Surface.getSurfacedroiteBasDroiteX(), Surface.getSurfacedroiteBasDroiteY(), Surface.getSurfacedroiteHautDroiteX(), Surface.getSurfacedroiteHautDroiteY());
		g.drawLine(Surface.getSurfacedroiteBasGaucheX(), Surface.getSurfacedroiteBasGaucheY(), Surface.getSurfacedroiteBasDroiteX(), Surface.getSurfacedroiteBasDroiteY());
		
		g.setColor(Color.ORANGE);
		
		g.drawLine(Sortie.getSortieHautGaucheX()+250, Sortie.getSortieHautGaucheY()+2, Sortie.getSortieHautGaucheX()+450, Sortie.getSortieHautDroiteY()+2);
		g.drawLine(Sortie.getSortieHautGaucheX()+250, Sortie.getSortieHautGaucheY()+2, Sortie.getSortieHautGaucheX()+250, Sortie.getSortieHautDroiteY()+100);
		g.drawLine(Sortie.getSortieHautGaucheX()+250, Sortie.getSortieHautGaucheY()+100, Sortie.getSortieHautGaucheX()+450, Sortie.getSortieHautDroiteY()+100);
		g.drawLine(Sortie.getSortieHautGaucheX()+450, Sortie.getSortieHautGaucheY()+2, Sortie.getSortieHautGaucheX()+450, Sortie.getSortieHautDroiteY()+100);

		/* Equipe bleu */

		
        // Attaquants

        g.setColor(Color.BLUE);

        g.drawRect(team1.get(10).getX(), team1.get(10).getY(), 10, 10);
        g.drawRect(team1.get(9).getX(), team1.get(9).getY(), 10, 10);

        g.fillRect(team1.get(10).getX(), team1.get(10).getY(), 10, 10);
        g.fillRect(team1.get(9).getX(), team1.get(9).getY(), 10, 10);

        // Milieux

        g.drawRect(team1.get(8).getX(), team1.get(8).getY(), 10, 10);
        g.drawRect(team1.get(7).getX(), team1.get(7).getY(), 10, 10);
        g.drawRect(team1.get(6).getX(), team1.get(6).getY(), 10, 10);
        g.drawRect(team1.get(5).getX(), team1.get(5).getY(), 10, 10);

        g.fillRect(team1.get(8).getX(), team1.get(8).getY(), 10, 10);
        g.fillRect(team1.get(7).getX(), team1.get(7).getY(), 10, 10);
        g.fillRect(team1.get(6).getX(), team1.get(6).getY(), 10, 10);
        g.fillRect(team1.get(5).getX(), team1.get(5).getY(), 10, 10);

        // Defenseurs

        g.drawRect(team1.get(4).getX(), team1.get(4).getY(), 10, 10);
        g.drawRect(team1.get(3).getX(), team1.get(3).getY(), 10, 10);
        g.drawRect(team1.get(2).getX(), team1.get(2).getY(), 10, 10);
        g.drawRect(team1.get(1).getX(), team1.get(1).getY(), 10, 10);

        g.fillRect(team1.get(4).getX(), team1.get(4).getY(), 10, 10);
        g.fillRect(team1.get(3).getX(), team1.get(3).getY(), 10, 10);
        g.fillRect(team1.get(2).getX(), team1.get(2).getY(), 10, 10);
        g.fillRect(team1.get(1).getX(), team1.get(1).getY(), 10, 10);
        // Gardien

        g.drawRect(team1.get(0).getX(), team1.get(0).getY(), 10, 10);
        g.fillRect(team1.get(0).getX(), team1.get(0).getY(), 10, 10);

        /* Equipe rouge */

        // Attaquants

        g.setColor(Color.RED);

        g.drawRect(team2.get(10).getX(), team2.get(10).getY(), 10, 10);
        g.drawRect(team2.get(9).getX(), team2.get(9).getY(), 10, 10);

        g.fillRect(team2.get(10).getX(), team2.get(10).getY(), 10, 10);
        g.fillRect(team2.get(9).getX(), team2.get(9).getY(), 10, 10);

        // Milieux

        g.drawRect(team2.get(8).getX(), team2.get(8).getY(), 10, 10);
        g.drawRect(team2.get(7).getX(), team2.get(7).getY(), 10, 10);
        g.drawRect(team2.get(6).getX(), team2.get(6).getY(), 10, 10);
        g.drawRect(team2.get(5).getX(), team2.get(5).getY(), 10, 10);

        g.fillRect(team2.get(8).getX(), team2.get(8).getY(), 10, 10);
        g.fillRect(team2.get(7).getX(), team2.get(7).getY(), 10, 10);
        g.fillRect(team2.get(6).getX(), team2.get(6).getY(), 10, 10);
        g.fillRect(team2.get(5).getX(), team2.get(5).getY(), 10, 10);

        // Defenseurs

        g.drawRect(team2.get(4).getX(), team2.get(4).getY(), 10, 10);
        g.drawRect(team2.get(3).getX(), team2.get(3).getY(), 10, 10);
        g.drawRect(team2.get(2).getX(), team2.get(2).getY(), 10, 10);
        g.drawRect(team2.get(1).getX(), team2.get(1).getY(), 10, 10);

        g.fillRect(team2.get(4).getX(), team2.get(4).getY(), 10, 10);
        g.fillRect(team2.get(3).getX(), team2.get(3).getY(), 10, 10);
        g.fillRect(team2.get(2).getX(), team2.get(2).getY(), 10, 10);
        g.fillRect(team2.get(1).getX(), team2.get(1).getY(), 10, 10);
        
        // Gardien

        g.drawRect(team2.get(0).getX(), team2.get(0).getY(), 10, 10);
        g.fillRect(team2.get(0).getX(), team2.get(0).getY(), 10, 10);
        
        g.setColor(Color.BLACK);
		
		g.drawOval(ballon.getPositionx_Ball(), ballon.getPositiony_Ball(), 10, 10);
		g.fillOval(ballon.getPositionx_Ball(), ballon.getPositiony_Ball(), 10, 10);
	
	}


	public ArrayList<Player> getTeam1() {
		return team1;
	}


	public void setTeam1(ArrayList<Player> team1) {
		this.team1 = team1;
	}


	public ArrayList<Player> getTeam2() {
		return team2;
	}


	public void setTeam2(ArrayList<Player> team2) {
		this.team2 = team2;
	}
	
	public Ball getBallon() {
		return ballon;
	}


	public void setBallon(Ball ballon) {
		this.ballon = ballon;
	}


	public Corner getTestcorner() {
		return testcorner;
	}


	public void setTestcorner(Corner testcorner) {
		this.testcorner = testcorner;
	}
	
	public Touche getTesttouche() {
		return testtouche;
	}


	public void setTesttouche(Touche testtouche) {
		this.testtouche = testtouche;
	}


	public boolean isStop_action() {
		return stop_action;
	}


	public void setStop_action(boolean stop_action) {
		this.stop_action = stop_action;
	}
	
	
}

