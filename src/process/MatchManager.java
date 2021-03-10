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
	private boolean mi_temps = false;

	private int first_choice_corner = 0;

	private Corner cornertest = null;
	private Touche touchetest = null;

	private Passe testpasse = new Passe();
	private Shoot testshoot = new Shoot();

	private int test_blue_shoot_x_position = 700;
	private int test_blue_shoot_y_position = 160;

	private int test_red_shoot_x_position = 200;
	private int test_red_shoot_y_position = 160;

	private Player tireur;
	private boolean shoot = false;

	private Match match = new Match();

	public void matchProcess(Dashboard dash) {
		
		begin = dash.isBegin();

		if (begin == false) {

			match = dash.getMatch();

			match.engagement(dash);

			dash.setBegin(true);
			
			

		}
		
		System.out.println("avant methode");

		closestPlayer(dash);
		
		System.out.println("apres methode");

		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc

		// doTestPrototype(dash);

		// doTestPasse(dash);
		// doCorner(dash);
		// doTouche(dash);

		// doTestBlueShoot(dash, 10);
		// doTestRedShoot(dash, 10);

	}

	public void doTestPrototype(Dashboard dash) {
		TestPrototype.testMovement(dash);
	}

	public void doTestPasse(Dashboard dash) {

		testpasse.testPass(dash);

	}

	public void doTestBlueShoot(Dashboard dash, int index_tireur) {

		shoot = dash.isShoot();

		if (shoot == false) {

			tireur = dash.getTeam1().get(index_tireur);

			tireur.setX(test_blue_shoot_x_position);
			tireur.setY(test_blue_shoot_y_position);

			dash.getBallon().setBallPositionxWithRedPlayer(tireur);
			dash.getBallon().setBallPositionyWithRedPlayer(tireur);

			dash.setShoot(true);

		}

		int aim_x = dash.getTeam2().get(0).getX() + 30;
		int aim_y = dash.getTeam2().get(0).getY() - 30;

		testshoot.testShootBlue(dash, index_tireur, aim_x, aim_y);

		if (dash.isGoal() == true) {
			match.redEngagement(dash);
		}

	}

	public void doTestRedShoot(Dashboard dash, int index_tireur) {

		shoot = dash.isShoot();

		if (shoot == false) {

			tireur = dash.getTeam2().get(index_tireur);

			tireur.setX(test_red_shoot_x_position);
			tireur.setY(test_red_shoot_y_position);

			dash.getBallon().setBallPositionxWithRedPlayer(tireur);
			dash.getBallon().setBallPositionyWithRedPlayer(tireur);

			dash.setShoot(true);

		}

		int aim_x = dash.getTeam1().get(0).getX() - 30;
		int aim_y = dash.getTeam1().get(0).getY() - 30;

		testshoot.testShootBlue(dash, index_tireur, aim_x, aim_y);

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

	public void doMiTemps(Dashboard dash) {
		mi_temps = dash.isMi_temps();
	}
	
	public int PlayerBall(ArrayList<Player> players1) {

		int res = 1 ;

		boolean stop = false;
		int i = 0 ;

		while ( i < players1.size() && (stop == false)) {

			if (players1.get(i).isBall() == true) {

				stop = true;
				res = i ;

			}
			
		}
		
		return res ;
		
	}

	public void closestPlayer(Dashboard dash) {
		
		System.out.println("debut methode");


		ArrayList<Player> players1 = dash.getTeam1();
		ArrayList<Player> players2 = dash.getTeam2();

		ArrayList<Player> ball_team = TeamBall(players1, players2); // équipe qui a la balle
		
		System.out.println("apres definition des arraylist");
		
		int index_player_ball = PlayerBall(ball_team);

		Player player = ball_team.get(index_player_ball); // joueur qui a la balle
		
		System.out.println("apres definition du player qui a la balle");

		// recuperer les coordonnées du joueur ayant la balle
		int player_x = player.getX();
		int player_y = player.getY();
		
		System.out.println("apres definition des coordonnes player qui a la balle");


		Player distance_min = ball_team.get(1);
		
		System.out.println("avant for");

		for (int i = 1; i < ball_team.size(); i++) {

			if (i != index_player_ball) {
				int x = ball_team.get(i).getX();
				int y = ball_team.get(i).getY();
				// calculer la disance entre le joueur ayant la balle et le joueur i
				float distance = (float) Math.sqrt(Math.pow(player_x - x, 2) + Math.pow(player_y - y, 2));
				System.out.println("playerBallX = "+ player_x + "playerBallY = " + player_y + "playerX = "+ x + "playerY = " + y +
				"Distance = "+distance);
				// a continuer calcul de distance

			}
		}

		// formule distance math.sqrt et math.pow

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

}
