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
	String nom;
	int result;
	
	@Test
	void testEnergie() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		nom = "12";
		result = team1.get(0).getEnergie();
		if(player.Energie(nom)!= result) {
			fail("nom mal indiqué");
		}
		nom = "22";
		result = team1.get(10).getEnergie();
		if(player.Energie(nom)!= result) {
			fail("nom mal indiqué");
		}
		
	}
	
	@Test
	void testEndurance() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		nom = "12";
		result = team1.get(0).getEndurance();
		if(player.Endurance(nom)!= result) {
			fail("nom mal indiqué");
		}
		nom = "22";
		result = team1.get(10).getEndurance();
		if(player.Endurance(nom)!= result) {
			fail("nom mal indiqué");
		}
	}
	
	@Test
	void testDefense() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		nom = "12";
		result = team1.get(0).getDefense();
		if(player.Defense(nom)!= result) {
			fail("nom mal indiqué");
		}
		nom = "22";
		result = team1.get(10).getDefense();
		if(player.Defense(nom)!= result) {
			fail("nom mal indiqué");
		}
	}
	
	@Test
	void testSpeed() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		nom = "12";
		result = team1.get(0).getSpeed();
		if(player.Speed(nom)!= result) {
			fail("nom mal indiqué");
		}
		nom = "22";
		result = team1.get(10).getSpeed();
		if(player.Speed(nom)!= result) {
			fail("nom mal indiqué");
		}
	}
	
	@Test
	void testShoot() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		nom = "12";
		result = team1.get(0).getShoot();
		if(player.Shoot(nom)!= result) {
			fail("nom mal indiqué");
		}
		nom = "22";
		result = team1.get(10).getShoot();
		if(player.Shoot(nom)!= result) {
			fail("nom mal indiqué");
		}
	}
	
	@Test
	void testDribbles() {
		team.createteams(team);
		Player1 player = new Player1(team1,name);
		nom = "12";
		result = team1.get(0).getDribbles();
		if(player.Dribbles(nom)!= result) {
			fail("nom mal indiqué");
		}
		nom = "22";
		result = team1.get(10).getDribbles();
		if(player.Dribbles(nom)!= result) {
			fail("nom mal indiqué");
		}
	}

}

