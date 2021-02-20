package test;

import java.util.ArrayList;

import data.Player;
import data.Team;

public class TestTeam {
	
	private static String nameTeam = "1" ;
	private static ArrayList<Player> team = new ArrayList <Player>();
	private static String color = "blue" ;
	
	

	public static void main(String[] args) {

		Team training = new Team (nameTeam,team,color);
		training.createteams(training);
		
		training.parcoursListPlayer(training.getPlayers()); //sera affiche if color = blue
		training.parcoursListPlayer(training.getPlayers()); // sera affiche if color = red
		
	}

}