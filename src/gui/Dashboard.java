package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import data.Ball;
import data.Match;
import data.Team;
import delimitations.Corner;
import delimitations.Goal;
import delimitations.Sortie;
import delimitations.Surface;
import delimitations.Touche;

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
	
	private Team team1 ;
	private Team team2 ;
	private Ball ballon ;
	private Corner testcorner ;
	private Touche testtouche ;
	private Match match ;
	
	private boolean stop_action = false ;
	private boolean stop_action_shoot = false ;
	private boolean stop_action_touche = false ;
	
	private boolean goal = false ;
	private boolean begin = false;
	private boolean corner = false;
	private boolean touche = false;
	private boolean shoot = false;
	private boolean mi_temps = false ;
	private boolean intercepteur = false ;
	
	public Dashboard(Team team1, Team team2, Ball ballon, Corner testcorner, Touche testtouche, Match match) {
		this.team1 = team1 ;
		this.team2 = team2 ;
		this.ballon = ballon ;
		this.testcorner = testcorner ;
		this.testtouche = testtouche ;
		this.match = match ;
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
		
		g.setColor(Color.BLACK);
		
		g.drawLine(Goal.getGoalHautGaucheX(), Goal.getGoalHautGaucheY(), Goal.getGoalBasGaucheX(), Goal.getGoalBasGaucheY());
		g.drawLine(Goal.getGoalHautDroitX(), Goal.getGoalHautDroitY(), Goal.getGoalBasDroitX(), Goal.getGoalBasDroitY());
		/* Equipe bleu */

		
        // Attaquants

        g.setColor(Color.BLUE);

        g.drawRect(team1.getPlayers().get(10).getX(), team1.getPlayers().get(10).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(9).getX(), team1.getPlayers().get(9).getY(), 10, 10);

        g.fillRect(team1.getPlayers().get(10).getX(), team1.getPlayers().get(10).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(9).getX(), team1.getPlayers().get(9).getY(), 10, 10);

        // Milieux

        g.drawRect(team1.getPlayers().get(8).getX(), team1.getPlayers().get(8).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(7).getX(), team1.getPlayers().get(7).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(6).getX(), team1.getPlayers().get(6).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(5).getX(), team1.getPlayers().get(5).getY(), 10, 10);

        g.fillRect(team1.getPlayers().get(8).getX(), team1.getPlayers().get(8).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(7).getX(), team1.getPlayers().get(7).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(6).getX(), team1.getPlayers().get(6).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(5).getX(), team1.getPlayers().get(5).getY(), 10, 10);

        // Defenseurs

        g.drawRect(team1.getPlayers().get(4).getX(), team1.getPlayers().get(4).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(3).getX(), team1.getPlayers().get(3).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(2).getX(), team1.getPlayers().get(2).getY(), 10, 10);
        g.drawRect(team1.getPlayers().get(1).getX(), team1.getPlayers().get(1).getY(), 10, 10);

        g.fillRect(team1.getPlayers().get(4).getX(), team1.getPlayers().get(4).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(3).getX(), team1.getPlayers().get(3).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(2).getX(), team1.getPlayers().get(2).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(1).getX(), team1.getPlayers().get(1).getY(), 10, 10);
        // Gardien

        g.drawRect(team1.getPlayers().get(0).getX(), team1.getPlayers().get(0).getY(), 10, 10);
        g.fillRect(team1.getPlayers().get(0).getX(), team1.getPlayers().get(0).getY(), 10, 10);
        
        g.setColor(Color.WHITE);
        g.drawString(Integer.toString(team1.getPlayers().get(0).getNumber()), team1.getPlayers().get(0).getX()+1 , team1.getPlayers().get(0).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(1).getNumber()), team1.getPlayers().get(1).getX()+1 , team1.getPlayers().get(1).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(2).getNumber()), team1.getPlayers().get(2).getX()+1 , team1.getPlayers().get(2).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(3).getNumber()), team1.getPlayers().get(3).getX()+1 , team1.getPlayers().get(3).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(4).getNumber()), team1.getPlayers().get(4).getX()+1 , team1.getPlayers().get(4).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(5).getNumber()), team1.getPlayers().get(5).getX()+1 , team1.getPlayers().get(5).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(6).getNumber()), team1.getPlayers().get(6).getX()+1 , team1.getPlayers().get(6).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(7).getNumber()), team1.getPlayers().get(7).getX()+1 , team1.getPlayers().get(7).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(8).getNumber()), team1.getPlayers().get(8).getX()+1 , team1.getPlayers().get(8).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(9).getNumber()), team1.getPlayers().get(9).getX()+1 , team1.getPlayers().get(9).getY()+10);
        g.drawString(Integer.toString(team1.getPlayers().get(10).getNumber()), team1.getPlayers().get(10).getX()+1 , team1.getPlayers().get(10).getY()+10);
        

        /* Equipe rouge */

        // Attaquants

        g.setColor(Color.RED);

        g.drawRect(team2.getPlayers().get(10).getX(), team2.getPlayers().get(10).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(9).getX(), team2.getPlayers().get(9).getY(), 10, 10);

        g.fillRect(team2.getPlayers().get(10).getX(), team2.getPlayers().get(10).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(9).getX(), team2.getPlayers().get(9).getY(), 10, 10);

        // Milieux

        g.drawRect(team2.getPlayers().get(8).getX(), team2.getPlayers().get(8).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(7).getX(), team2.getPlayers().get(7).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(6).getX(), team2.getPlayers().get(6).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(5).getX(), team2.getPlayers().get(5).getY(), 10, 10);

        g.fillRect(team2.getPlayers().get(8).getX(), team2.getPlayers().get(8).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(7).getX(), team2.getPlayers().get(7).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(6).getX(), team2.getPlayers().get(6).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(5).getX(), team2.getPlayers().get(5).getY(), 10, 10);

        // Defenseurs

        g.drawRect(team2.getPlayers().get(4).getX(), team2.getPlayers().get(4).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(3).getX(), team2.getPlayers().get(3).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(2).getX(), team2.getPlayers().get(2).getY(), 10, 10);
        g.drawRect(team2.getPlayers().get(1).getX(), team2.getPlayers().get(1).getY(), 10, 10);

        g.fillRect(team2.getPlayers().get(4).getX(), team2.getPlayers().get(4).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(3).getX(), team2.getPlayers().get(3).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(2).getX(), team2.getPlayers().get(2).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(1).getX(), team2.getPlayers().get(1).getY(), 10, 10);
        
        // Gardien

        g.drawRect(team2.getPlayers().get(0).getX(), team2.getPlayers().get(0).getY(), 10, 10);
        g.fillRect(team2.getPlayers().get(0).getX(), team2.getPlayers().get(0).getY(), 10, 10);
        
        g.setColor(Color.BLACK);
		
		g.drawOval(ballon.getPositionx_Ball(), ballon.getPositiony_Ball(), 10, 10);
		g.fillOval(ballon.getPositionx_Ball(), ballon.getPositiony_Ball(), 10, 10);
		
		g.setColor(Color.WHITE);
		g.drawString(Integer.toString(team2.getPlayers().get(0).getNumber()), team2.getPlayers().get(0).getX()+1 , team2.getPlayers().get(0).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(1).getNumber()), team2.getPlayers().get(1).getX()+1 , team2.getPlayers().get(1).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(2).getNumber()), team2.getPlayers().get(2).getX()+1 , team2.getPlayers().get(2).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(3).getNumber()), team2.getPlayers().get(3).getX()+1 , team2.getPlayers().get(3).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(4).getNumber()), team2.getPlayers().get(4).getX()+1 , team2.getPlayers().get(4).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(5).getNumber()), team2.getPlayers().get(5).getX()+1 , team2.getPlayers().get(5).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(6).getNumber()), team2.getPlayers().get(6).getX()+1 , team2.getPlayers().get(6).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(7).getNumber()), team2.getPlayers().get(7).getX()+1 , team2.getPlayers().get(7).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(8).getNumber()), team2.getPlayers().get(8).getX()+1 , team2.getPlayers().get(8).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(9).getNumber()), team2.getPlayers().get(9).getX()+1 , team2.getPlayers().get(9).getY()+10);
	    g.drawString(Integer.toString(team2.getPlayers().get(10).getNumber()), team2.getPlayers().get(10).getX()+1 , team2.getPlayers().get(10).getY()+10);
	
	}


	public Team getTeam1() {
		return team1;
	}


	public void setTeam1(Team team1) {
		this.team1 = team1;
	}


	public Team getTeam2() {
		return team2;
	}


	public void setTeam2(Team team2) {
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


	public Match getMatch() {
		return match;
	}


	public void setMatch(Match match) {
		this.match = match;
	}


	public boolean isStop_action() {
		return stop_action;
	}


	public void setStop_action(boolean stop_action) {
		this.stop_action = stop_action;
	}
	
	public boolean isStop_action_shoot() {
		return stop_action_shoot;
	}


	public void setStop_action_shoot(boolean stop_action_shoot) {
		this.stop_action_shoot = stop_action_shoot;
	}

	public boolean isStop_action_touche() {
		return stop_action_touche;
	}


	public void setStop_action_touche(boolean stop_action_touche) {
		this.stop_action_touche = stop_action_touche;
	}


	public boolean isGoal() {
		return goal;
	}


	public void setGoal(boolean goal) {
		this.goal = goal;
	}


	public boolean isBegin() {
		return begin;
	}


	public void setBegin(boolean begin) {
		this.begin = begin;
	}


	public boolean isCorner() {
		return corner;
	}


	public void setCorner(boolean corner) {
		this.corner = corner;
	}


	public boolean isTouche() {
		return touche;
	}


	public void setTouche(boolean touche) {
		this.touche = touche;
	}


	public boolean isShoot() {
		return shoot;
	}


	public void setShoot(boolean shoot) {
		this.shoot = shoot;
	}


	public boolean isMi_temps() {
		return mi_temps;
	}


	public void setMi_temps(boolean mi_temps) {
		this.mi_temps = mi_temps;
	}


	public boolean isIntercepteur() {
		return intercepteur;
	}


	public void setIntercepteur(boolean intercepteur) {
		this.intercepteur = intercepteur;
	}
	
}