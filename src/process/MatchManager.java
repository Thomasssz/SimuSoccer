package process;

import java.util.ArrayList;
import java.util.Random;

import data.Match;
import data.Player;
import delimitations.Corner;
import delimitations.Sortie;
import delimitations.Touche;
import gui.Dashboard;
import test.TestPrototype;

public class MatchManager {

	private boolean begin = false;
	private boolean corner = false;
	private boolean touche = false;

	private int first_choice_corner = 0;

	private boolean goal = false;

	private Corner cornertest = null;
	private Touche touchetest = null;

	private Passe testpasse = new Passe();
	private Shoot testshoot = new Shoot();

	private ArrayList<Player> players1 = null;
	private ArrayList<Player> players2 = null;
	private ArrayList<Player> ball_team = null;

	private Player tireur;
	private boolean shoot = false;

	private int aim_x = 0;
	private int aim_y = 0;

	private Player passeur = null;
	private Player receveur = null;

	private int proba = 200;

	private Match match = new Match();

	public void matchProcess(Dashboard dash) {

		begin = dash.isBegin();

		if (begin == false) {

			match = dash.getMatch();

			match.engagement(dash);

			dash.setBegin(true);

		}

		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc

		// doTestPrototype(dash);

		// doCorner(dash);
		// doTouche(dash);

		// doBlueShoot(dash);
		// doRedShoot(dash);
		
		doPass(dash, passeur, receveur);

	}

	public void doTestPrototype(Dashboard dash) {
		TestPrototype.testMovement(dash);
	}

	public void doPass(Dashboard dash, Player passeur, Player receveur) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_passeur = PlayerBall(ball_team);

		passeur = ball_team.get(index_passeur);

		receveur = closestPlayer(dash);

		if (dash.isStop_action() == false) {

			testpasse.pass(dash, passeur, receveur);
			
		} else {
			dash.setStop_action(false);

			ball_team = TeamBall(players1, players2);

			int index_new_passeur = PlayerBall(ball_team);

			passeur = ball_team.get(index_new_passeur);
			receveur = closestPlayer(dash);
			testpasse.pass(dash, passeur, receveur);
		}

	}

	public void doBlueShoot(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_tireur = PlayerBall(ball_team);

		shoot = dash.isShoot();

		if (shoot == false) {

			tireur = dash.getTeam1().get(index_tireur);

			aim_x = 830;

			Random tir = new Random();

			aim_y = tir.nextInt(293);

			aim_y += 165;

			dash.setShoot(true);

		}

		if ((aim_y <= 375) && (aim_y > 250)) {

			if (proba == 200) {
				goal = probabilite_succes(tireur.getShoot());
			}

			if (goal == true) {

				testshoot.ShootBlue(dash, index_tireur, aim_x, aim_y, goal);

			} else {

				int x_gardien = dash.getTeam2().get(0).getX();
				int y_gardien = dash.getTeam2().get(0).getY();

				testshoot.ShootBlue(dash, index_tireur, x_gardien, y_gardien, goal);
			}

		} else {
			testshoot.ShootBlue(dash, index_tireur, aim_x, aim_y, goal);
		}

		if (dash.isGoal() == true) {
			match.redEngagement(dash);
		}

	}

	public void doRedShoot(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_tireur = PlayerBall(ball_team);

		shoot = dash.isShoot();

		if (shoot == false) {

			tireur = dash.getTeam2().get(index_tireur);

			aim_x = 50;

			Random tir = new Random();

			aim_y = tir.nextInt(293);

			aim_y += 165;

			dash.setShoot(true);

		}

		if ((aim_y <= 375) && (aim_y > 250)) {

			if (proba == 200) {
				goal = probabilite_succes(tireur.getShoot());
			}

			if (goal == true) {

				testshoot.ShootRed(dash, index_tireur, aim_x, aim_y, goal);

			} else {

				int x_gardien = dash.getTeam1().get(0).getX();
				int y_gardien = dash.getTeam1().get(0).getY();

				testshoot.ShootRed(dash, index_tireur, x_gardien, y_gardien, goal);
			}

		} else {
			testshoot.ShootRed(dash, index_tireur, aim_x, aim_y, goal);
		}

		if (dash.isGoal() == true) {
			match.blueEngagement(dash);
		}

	}

	public void doCorner(Dashboard dash) {

		corner = dash.isCorner();

		if (corner == false) {

			cornertest = dash.getTestcorner();

			if (first_choice_corner == 0) {

				Random rand = new Random();
				int choix_corner = rand.nextInt(4);

				choix_corner += 1;

				first_choice_corner = choix_corner;

			}

			if (first_choice_corner == 1) {

				cornertest.CornerHautGauche(dash);

			} else if (first_choice_corner == 2) {

				cornertest.CornerHautDroite(dash);

			} else if (first_choice_corner == 3) {

				cornertest.CornerBasGauche(dash);

			} else if (first_choice_corner == 4) {

				cornertest.CornerBasDroite(dash);

			}

			if (dash.isStop_action() == true) {

				dash.setCorner(true);

			}

		}
	}

	public void doTouche(Dashboard dash) {

		touche = dash.isTouche();

		if (touche == false) {

			touchetest = dash.getTesttouche();

			touchetest.runTouche(Sortie.getSortieHautGaucheX() + 350, Sortie.getSortieHautGaucheY(), dash);

			if (dash.isStop_action() == true) {

				dash.setTouche(true);

			}

		}

	}

	public int PlayerBall(ArrayList<Player> players1) {

		int res = 12;

		boolean stop = false;
		int i = 0;

		while (i < players1.size() && (stop == false)) {

			if (players1.get(i).isBall() == true) {

				stop = true;
				res = i;

			}
			i++;

		}

		return res;

	}

	public Player closestPlayer(Dashboard dash) {

		ArrayList<Player> players1 = dash.getTeam1();
		ArrayList<Player> players2 = dash.getTeam2();

		ArrayList<Player> ball_team = TeamBall(players1, players2); // équipe qui a la balle

		int index_player_ball = PlayerBall(ball_team);

		Player player = ball_team.get(index_player_ball); // joueur qui a la balle

		// recuperer les coordonnées du joueur ayant la balle
		int player_x = player.getX();
		int player_y = player.getY();

		Player player_min = ball_team.get(1);

		float distance_min = (float) Math
				.sqrt(Math.pow(player_x - player_min.getX(), 2) + Math.pow(player_y - player_min.getY(), 2));

		for (int i = 1; i < ball_team.size(); i++) {

			if (i != index_player_ball) {
				int x = ball_team.get(i).getX();
				int y = ball_team.get(i).getY();

				float distance = (float) Math.sqrt(Math.pow(player_x - x, 2) + Math.pow(player_y - y, 2));

				if (distance < distance_min) {
					player_min = ball_team.get(i);
				}

			}
		}

		return player_min;
	}

	// probabililté qu'un tir soit un but
	/*
	 * public boolean probabilite_succes(int chance) { int proba ; do { proba =
	 * (int) Math.random(); } while (proba >= 0 && proba < 100); if (proba <=
	 * chance) { System.out.println("proba = " + proba); return true; } else {
	 * System.out.println("proba = " + proba); return false; } }
	 */

	public boolean probabilite_succes(int chance) {

		System.out.println("chance = " + chance);

		Random prob = new Random();
		proba = prob.nextInt(100);

		System.out.println("proba = " + proba);

		if (proba <= chance) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Player> TeamBall(ArrayList<Player> players1, ArrayList<Player> players2) {

		int i = 0;

		boolean stop = false;

		while (i < players1.size() && (stop == false)) {

			if (players1.get(i).isBall() == true) {

				stop = true;
				return players1;

			}

			if (players2.get(i).isBall() == true) {

				stop = true;
				return players2;
			}

			i++;

		}

		return null;

	}

	public boolean blueShotSituation(Player tireur) {

		int x_tireur = tireur.getX();
		int y_tireur = tireur.getY();

		if (((x_tireur > 710) && (x_tireur <= 798)) && ((y_tireur > 180) && (y_tireur <= 443))) { // 695, 813, 165, 458
																									// (+- 15 chacun)
			return true;
		} else {
			return false;
		}
	}

	public boolean redShotSituation(Player tireur) {

		int x_tireur = tireur.getX();
		int y_tireur = tireur.getY();

		if (((x_tireur > 90) && (x_tireur <= 180)) && ((y_tireur > 180) && (y_tireur <= 443))) { // 75 , 195 , 165 , 458
																									// (+- 15 chacun)
			return true;
		} else {
			return false;
		}
	}

}
