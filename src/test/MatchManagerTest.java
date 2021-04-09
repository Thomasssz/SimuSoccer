package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import data.Player;
import data.Team;
import gui.ChronometerGUI;
import process.MatchManager;

class MatchManagerTest {
	ChronometerGUI gui = new ChronometerGUI();
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private String color = "red";
	private String nameE = "e";
	Team team = new Team(nameE, team1, color);
	int res; 
	
	@Test
	void testPlayerBall() {
		team.createteams(team);
		MatchManager match = new MatchManager(gui);
		
		res = -1;
		if(match.PlayerBall(team) == res ) {
			fail("en dehors des bornes");
		}
		
		res = 11;
		if(match.PlayerBall(team) == res ) {
			fail("en dehors des bornes");
		}
	}

}
