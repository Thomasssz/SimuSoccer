package test;

import data.Player;
import data.Team;

public class TestTeam {

	public static void main(String[] args) {

		//TestTeam test = new TestTeam();

		Team.createteams();
		String result = "";
		for (Player player : Team.players1) {
			result += player.toString() + "\n";
		}
		
		System.out.println(result);
		
	

	}

}