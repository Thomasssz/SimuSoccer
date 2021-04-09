package data;

import java.util.ArrayList;
import java.util.Random;

import gui.Dashboard;

public class Match {
	
	//initialisation
	private static int default_x_gardien_bleu = 90;
	private static int default_y_gardien_bleu = 305;

	private static int default_x_defenseur1_bleu = 200;
	private static int default_y_defenseur1_bleu = 100;

	private static int default_x_defenseur2_bleu = 200;
	private static int default_y_defenseur2_bleu = 265;

	private static int default_x_defenseur3_bleu = 200;
	private static int default_y_defenseur3_bleu = 350;

	private static int default_x_defenseur4_bleu = 200;
	private static int default_y_defenseur4_bleu = 500;

	private static int default_x_milieu1_bleu = 270;
	private static int default_y_milieu1_bleu = 100;

	private static int default_x_milieu2_bleu = 270;
	private static int default_y_milieu2_bleu = 265;

	private static int default_x_milieu3_bleu = 270;
	private static int default_y_milieu3_bleu = 350;

	private static int default_x_milieu4_bleu = 270;
	private static int default_y_milieu4_bleu = 500;

	private static int default_x_attaquant1_bleu = 360;
	private static int default_y_attaquant1_bleu = 260;

	private static int default_x_attaquant2_bleu = 360;
	private static int default_y_attaquant2_bleu = 350;

	private static int default_x_gardien_rouge = 790;
	private static int default_y_gardien_rouge = 305;

	private static int default_x_defenseur1_rouge = 690;
	private static int default_y_defenseur1_rouge = 100;

	private static int default_x_defenseur2_rouge = 690;
	private static int default_y_defenseur2_rouge = 265;

	private static int default_x_defenseur3_rouge = 690;
	private static int default_y_defenseur3_rouge = 350;

	private static int default_x_defenseur4_rouge = 690;
	private static int default_y_defenseur4_rouge = 500;

	private static int default_x_milieu1_rouge = 620;
	private static int default_y_milieu1_rouge = 100;

	private static int default_x_milieu2_rouge = 620;
	private static int default_y_milieu2_rouge = 265;

	private static int default_x_milieu3_rouge = 620;
	private static int default_y_milieu3_rouge = 350;

	private static int default_x_milieu4_rouge = 620;
	private static int default_y_milieu4_rouge = 500;

	private static int default_x_attaquant1_rouge = 530;
	private static int default_y_attaquant1_rouge = 265;

	private static int default_x_attaquant2_rouge = 530;
	private static int default_y_attaquant2_rouge = 350;

	public static ArrayList<Player> players1 = new ArrayList<>();
	public static ArrayList<Player> players2 = new ArrayList<>();

	private Team team1 = new Team("team1", players1, "blue");
	private Team team2 = new Team("team2", players2, "red");
	private static int scoreteam1;
	private static int scoreteam2;
	private int time_match = 90;

	private Ball ball = new Ball(250, 150);

	public Team getTeam1() {
		return team1;
	}

	public Match() {
		super();
	}

	//getter et setter
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public static int getScoreteam1() {
		return scoreteam1;
	}
	
	public static void incrementScore1() {
		scoreteam1 += 1;
	}

	public static void incrementScore2() {
		scoreteam2 += 1;
	}


	public static int getScoreteam2() {
		return scoreteam2;
	}

	public static void setScoreteam2(int scoreteam2) {
		Match.scoreteam2 = scoreteam2;
	}
	
	public static void setScroreteam1(int scoreteam1) {
		Match.scoreteam1 = scoreteam1;
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

	public void engagement(Dashboard dash) {

		Random random = new Random();
		int nb;
		nb = random.nextInt(2);

		// si le nombre aleatoire genere 1, ce sera l'equipe bleu qui engagera

		if (nb == 1) {

			dash.getTeam1().getPlayers().get(10).setX(430);
			dash.getTeam1().getPlayers().get(10).setY(300);
			dash.getTeam1().getPlayers().get(9).setX(430);
			dash.getTeam1().getPlayers().get(9).setY(330);
			dash.getTeam1().getPlayers().get(10).setBall(true);

			dash.getBallon().setBallPositionxWithBluePlayer(dash.getTeam1().getPlayers().get(10));
			dash.getBallon().setBallPositionyWithBluePlayer(dash.getTeam1().getPlayers().get(10));

		} else {

			dash.getTeam2().getPlayers().get(10).setX(450);
			dash.getTeam2().getPlayers().get(10).setY(300);
			dash.getTeam2().getPlayers().get(9).setX(450);
			dash.getTeam2().getPlayers().get(9).setY(330);
			dash.getTeam2().getPlayers().get(10).setBall(true);

			dash.getBallon().setBallPositionxWithRedPlayer(dash.getTeam2().getPlayers().get(10));
			dash.getBallon().setBallPositionxWithBluePlayer(dash.getTeam2().getPlayers().get(10));

		}

		dash.setGoal(false);
		dash.setShoot(false);

	}

	public void blueEngagement(Dashboard dash, Player player_ball) {
		
		player_ball.setBall(false);
		
		dash.getTeam1().getPlayers().get(0).setX(default_x_gardien_bleu);
		dash.getTeam1().getPlayers().get(0).setY(default_y_gardien_bleu);
		
		dash.getTeam1().getPlayers().get(1).setX(default_x_defenseur1_bleu);
		dash.getTeam1().getPlayers().get(1).setY(default_y_defenseur1_bleu);
		dash.getTeam1().getPlayers().get(2).setX(default_x_defenseur2_bleu);
		dash.getTeam1().getPlayers().get(2).setY(default_y_defenseur2_bleu);
		dash.getTeam1().getPlayers().get(3).setX(default_x_defenseur3_bleu);
		dash.getTeam1().getPlayers().get(3).setY(default_y_defenseur3_bleu);
		dash.getTeam1().getPlayers().get(4).setX(default_x_defenseur4_bleu);
		dash.getTeam1().getPlayers().get(4).setY(default_y_defenseur4_bleu);
		
		dash.getTeam1().getPlayers().get(5).setX(default_x_milieu1_bleu);
		dash.getTeam1().getPlayers().get(5).setY(default_y_milieu1_bleu);
		dash.getTeam1().getPlayers().get(6).setX(default_x_milieu2_bleu);
		dash.getTeam1().getPlayers().get(6).setY(default_y_milieu2_bleu);
		dash.getTeam1().getPlayers().get(7).setX(default_x_milieu3_bleu);
		dash.getTeam1().getPlayers().get(7).setY(default_y_milieu3_bleu);
		dash.getTeam1().getPlayers().get(8).setX(default_x_milieu4_bleu);
		dash.getTeam1().getPlayers().get(8).setY(default_y_milieu4_bleu);
		
		dash.getTeam2().getPlayers().get(0).setX(default_x_gardien_rouge);
		dash.getTeam2().getPlayers().get(0).setY(default_y_gardien_rouge);
		
		dash.getTeam2().getPlayers().get(1).setX(default_x_defenseur1_rouge);
		dash.getTeam2().getPlayers().get(1).setY(default_y_defenseur1_rouge);
		dash.getTeam2().getPlayers().get(2).setX(default_x_defenseur2_rouge);
		dash.getTeam2().getPlayers().get(2).setY(default_y_defenseur2_rouge);
		dash.getTeam2().getPlayers().get(3).setX(default_x_defenseur3_rouge);
		dash.getTeam2().getPlayers().get(3).setY(default_y_defenseur3_rouge);
		dash.getTeam2().getPlayers().get(4).setX(default_x_defenseur4_rouge);
		dash.getTeam2().getPlayers().get(4).setY(default_y_defenseur4_rouge);
		
		dash.getTeam2().getPlayers().get(5).setX(default_x_milieu1_rouge);
		dash.getTeam2().getPlayers().get(5).setY(default_y_milieu1_rouge);
		dash.getTeam2().getPlayers().get(6).setX(default_x_milieu2_rouge);
		dash.getTeam2().getPlayers().get(6).setY(default_y_milieu2_rouge);
		dash.getTeam2().getPlayers().get(7).setX(default_x_milieu3_rouge);
		dash.getTeam2().getPlayers().get(7).setY(default_y_milieu3_rouge);
		dash.getTeam2().getPlayers().get(8).setX(default_x_milieu4_rouge);
		dash.getTeam2().getPlayers().get(8).setY(default_y_milieu4_rouge);
		
		dash.getTeam2().getPlayers().get(9).setX(default_x_attaquant1_rouge);
		dash.getTeam2().getPlayers().get(10).setX(default_x_attaquant2_rouge);
		dash.getTeam2().getPlayers().get(9).setY(default_y_attaquant1_rouge);
		dash.getTeam2().getPlayers().get(10).setY(default_y_attaquant2_rouge);
		

		dash.getTeam1().getPlayers().get(9).setX(430);
		dash.getTeam1().getPlayers().get(9).setY(330);
		dash.getTeam1().getPlayers().get(10).setX(430);
		dash.getTeam1().getPlayers().get(10).setY(300);
		
		dash.getTeam1().getPlayers().get(10).setBall(true);   

		dash.getBallon().setBallPositionxWithBluePlayer(dash.getTeam1().getPlayers().get(10));
		dash.getBallon().setBallPositionxWithBluePlayer(dash.getTeam1().getPlayers().get(10));
		
		dash.setGoal(false);
		dash.setStop_action(false);
		dash.setStop_action_shoot(false);
	}

	public void redEngagement(Dashboard dash, Player player_ball) {
		
		player_ball.setBall(false);
		
		System.out.println("red engagement");
		
		dash.getTeam1().getPlayers().get(0).setX(default_x_gardien_bleu);
		dash.getTeam1().getPlayers().get(0).setY(default_y_gardien_bleu);
		
		dash.getTeam1().getPlayers().get(1).setX(default_x_defenseur1_bleu);
		dash.getTeam1().getPlayers().get(1).setY(default_y_defenseur1_bleu);
		dash.getTeam1().getPlayers().get(2).setX(default_x_defenseur2_bleu);
		dash.getTeam1().getPlayers().get(2).setY(default_y_defenseur2_bleu);
		dash.getTeam1().getPlayers().get(3).setX(default_x_defenseur3_bleu);
		dash.getTeam1().getPlayers().get(3).setY(default_y_defenseur3_bleu);
		dash.getTeam1().getPlayers().get(4).setX(default_x_defenseur4_bleu);
		dash.getTeam1().getPlayers().get(4).setY(default_y_defenseur4_bleu);
		
		dash.getTeam1().getPlayers().get(5).setX(default_x_milieu1_bleu);
		dash.getTeam1().getPlayers().get(5).setY(default_y_milieu1_bleu);
		dash.getTeam1().getPlayers().get(6).setX(default_x_milieu2_bleu);
		dash.getTeam1().getPlayers().get(6).setY(default_y_milieu2_bleu);
		dash.getTeam1().getPlayers().get(7).setX(default_x_milieu3_bleu);
		dash.getTeam1().getPlayers().get(7).setY(default_y_milieu3_bleu);
		dash.getTeam1().getPlayers().get(8).setX(default_x_milieu4_bleu);
		dash.getTeam1().getPlayers().get(8).setY(default_y_milieu4_bleu);
		
		dash.getTeam1().getPlayers().get(9).setX(default_x_attaquant1_bleu);
		dash.getTeam1().getPlayers().get(10).setX(default_x_attaquant2_bleu);
		dash.getTeam1().getPlayers().get(9).setY(default_y_attaquant1_bleu);
		dash.getTeam1().getPlayers().get(10).setY(default_y_attaquant2_bleu);
		
		dash.getTeam2().getPlayers().get(0).setX(default_x_gardien_rouge);
		dash.getTeam2().getPlayers().get(0).setY(default_y_gardien_rouge);
		
		dash.getTeam2().getPlayers().get(1).setX(default_x_defenseur1_rouge);
		dash.getTeam2().getPlayers().get(1).setY(default_y_defenseur1_rouge);
		dash.getTeam2().getPlayers().get(2).setX(default_x_defenseur2_rouge);
		dash.getTeam2().getPlayers().get(2).setY(default_y_defenseur2_rouge);
		dash.getTeam2().getPlayers().get(3).setX(default_x_defenseur3_rouge);
		dash.getTeam2().getPlayers().get(3).setY(default_y_defenseur3_rouge);
		dash.getTeam2().getPlayers().get(4).setX(default_x_defenseur4_rouge);
		dash.getTeam2().getPlayers().get(4).setY(default_y_defenseur4_rouge);
		
		dash.getTeam2().getPlayers().get(5).setX(default_x_milieu1_rouge);
		dash.getTeam2().getPlayers().get(5).setY(default_y_milieu1_rouge);
		dash.getTeam2().getPlayers().get(6).setX(default_x_milieu2_rouge);
		dash.getTeam2().getPlayers().get(6).setY(default_y_milieu2_rouge);
		dash.getTeam2().getPlayers().get(7).setX(default_x_milieu3_rouge);
		dash.getTeam2().getPlayers().get(7).setY(default_y_milieu3_rouge);
		dash.getTeam2().getPlayers().get(8).setX(default_x_milieu4_rouge);
		dash.getTeam2().getPlayers().get(8).setY(default_y_milieu4_rouge);
		
		dash.getTeam2().getPlayers().get(10).setX(450);
		dash.getTeam2().getPlayers().get(10).setY(300);
		dash.getTeam2().getPlayers().get(9).setX(450);
		dash.getTeam2().getPlayers().get(9).setY(330);
		
		dash.getTeam2().getPlayers().get(10).setBall(true);

		dash.getBallon().setBallPositionxWithRedPlayer(dash.getTeam2().getPlayers().get(10));
		dash.getBallon().setBallPositionxWithRedPlayer(dash.getTeam2().getPlayers().get(10));

		dash.setGoal(false);
		dash.setStop_action(false);
		dash.setStop_action_shoot(false);
	}
}
