package data;

import java.util.ArrayList;

public class Team {
	public String nameTeam;

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ArrayList<Player> players = new ArrayList<>();
	public String color;

	public Team(String nameTeam, ArrayList<Player> players, String color) {
		super();
		this.nameTeam = nameTeam;
		this.players = players;
		this.color = color;
	}
}
