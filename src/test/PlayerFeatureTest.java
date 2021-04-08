package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import data.Player;
import data.Team;
import gui.Player1;

class PlayerFeatureTest {
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private String color = "red";
	private String nameE = "e";
	Team team = new Team(nameE, team1, color);
	private String name;
	
	@Test
	void testEnergie() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		String nom = "12";
		int result = 100;
		if(player.Energie(nom)!= result) {
			fail("nom mal indiqué");
		}
		/*for(int i=1; i<23; i++) {
			name = Integer.toString(i);
			if(name == null) {
				fail("aucun nom n'a été donné");
			}
			if(name == "0") {
				fail("en dehors des bornes");
			}
			if(name == "23") {
				fail("en dehors des borne");
			}*/
	}
	
	/*@Test
	void testEndurance() {
		fail("Not yet implemented");
	}
	
	@Test
	void testDefense() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSpeed() {
		fail("Not yet implemented");
	}
	
	@Test
	void testShoot() {
		fail("Not yet implemented");
	}
	
	@Test
	void testDribbles() {
		fail("Not yet implemented");
	}*/

}
