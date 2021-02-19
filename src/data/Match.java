package data;

import java.util.ArrayList;
import java.util.Random;

public class Match {

	public static ArrayList<Player> players1 = new ArrayList<>();
	public static ArrayList<Player> players2 = new ArrayList<>();

	private Team team1 = new Team("team1", players1, "blue");
	private Team team2 = new Team("team2", players2, "red");
	private int scoreteam1;
	private int scoreteam2;
	private int time_match = 90;

	private Ball ball = new Ball(250,150);

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

	public int getScoreteam1() {
		return scoreteam1;
	}

	public void setScoreteam1(int scoreteam1) {
		this.scoreteam1 = scoreteam1;
	}

	public int getScoreteam2() {
		return scoreteam2;
	}

	public void setScoreteam2(int scoreteam2) {
		this.scoreteam2 = scoreteam2;
	}

	public int getTime_match() {
		return time_match;
	}

	public void setTime_match(int time_match) {
		this.time_match = time_match;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public static void engagement() {

		Random random = new Random();
		int nb;
		nb = random.nextInt(2);
		Team.createteams();
		// si le nombre aléatoire génère 1, ce sera l'équipe bleu qui engagera
		if (nb == 1) {
			Team.players2.get(10).setX(440);
			Team.players2.get(10).setY(305);
			Team.players2.get(9).setX(440);
			Team.players2.get(9).setY(325);
			Team.players2.get(10).setBall(true);
		} else {
			Team.players1.get(10).setX(440);
			Team.players1.get(10).setY(305);
			Team.players1.get(9).setX(440);
			Team.players1.get(9).setY(325);
			Team.players1.get(10).setBall(true);
		}

	}
}
