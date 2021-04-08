package test;

import java.util.ArrayList;

import data.Player;
import gui.Dashboard;

public class TestPrototype {
	
	private static ArrayList<Player> team1 = new ArrayList <Player>();
	private static ArrayList<Player> team2 = new ArrayList <Player>();

	public static void testMovement(Dashboard dash) {
		
		team1 = dash.getTeam1().getPlayers();
		team2 = dash.getTeam2().getPlayers();
		
		for (int i = 1 ; i <= 10 ; i++) {
			team1.get(i).setX(team1.get(i).getX() +10 );
		}
		
		for (int i = 1 ; i <= 10 ; i++) {
			team2.get(i).setX(team2.get(i).getX() -10 );
		}


	}

}
