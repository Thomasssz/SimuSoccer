package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import data.Ball;
import data.Match;
import data.Player;
import delimitations.Corner;
import delimitations.Touche;
import gui.ChronometerGUI;
import gui.Dashboard;
import process.Endurance;

class EnduranceTest {

	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private static ArrayList<Player> team2 = new ArrayList<Player>();
	private Ball ballon = new Ball();
	
	private Corner cornertest = new Corner() ;
	private Touche touchetest = new Touche() ;
	private Match match = new Match();
	private Dashboard dash = new Dashboard(team1, team2, ballon,cornertest,touchetest,match);
	private ChronometerGUI gui = new ChronometerGUI("Simu soccer");
			
	@Test
	void testBaisse() {
		Endurance end = new Endurance();
		//assertEquals("Erreur", end.baisse(dash, gui), 91);
		
	}

}