package test;

import java.util.ArrayList;

import data.Ball;
import data.Match;
import data.Player;
import data.Team;
import delimitations.Corner;
import delimitations.Touche;
import gui.ChronometerGUI;
import gui.Dashboard;
import process.Endurance;

public class TestTeam {
	
	/*private static String nameTeam = "1" ;
	private static ArrayList<Player> team = new ArrayList <Player>();
	private static String color = "blue" ;*/
	
	
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private static ArrayList<Player> team2 = new ArrayList<Player>();
	private static Ball ballon = new Ball();
	
	private static Corner cornertest = new Corner() ;
	private static Touche touchetest = new Touche() ;
	private static Match match = new Match();
	private static Dashboard dash = new Dashboard(team1, team2, ballon,cornertest,touchetest,match);
	private static ChronometerGUI gui = new ChronometerGUI();
	
	

	public static void main(String[] args) {

		/*Team training = new Team (nameTeam,team,color);
		training.createteams(training);
		
		training.parcoursListPlayer(training.getPlayers()); //sera affiche if color = blue
		training.parcoursListPlayer(training.getPlayers()); // sera affiche if color = red*/
		
		Endurance endurance = new Endurance();
		endurance.baisse(dash, gui);
		
	}

}