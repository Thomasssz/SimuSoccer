package process;

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
	private boolean mi_temps = false ;

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
		
		begin = dash.isBegin() ;

		if (begin == false) {

			match = dash.getMatch();

			match.engagement(dash);
			
			dash.setBegin(true);

		}

		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc

		//doTestPrototype(dash);

		//doTestPasse(dash);
		//doCorner(dash);
		doTouche(dash);

		
		//doTestBlueShoot(dash, 10);
		//doTestRedShoot(dash, 10);

	}

	public void doTestPrototype(Dashboard dash) {
		TestPrototype.testMovement(dash);
	}

	public void doTestPasse(Dashboard dash) {

		testpasse.testPass(dash);

	}

	public void doTestBlueShoot(Dashboard dash, int index_tireur) {
		
		shoot = dash.isShoot() ;

		if (shoot == false) {

			tireur = dash.getTeam1().get(index_tireur);

			tireur.setX(test_blue_shoot_x_position);
			tireur.setY(test_blue_shoot_y_position);

			dash.getBallon().setBallPositionxWithRedPlayer(tireur);
			dash.getBallon().setBallPositionyWithRedPlayer(tireur);

			dash.setShoot(true);

		}
		
		int aim_x = dash.getTeam2().get(0).getX() +30 ;
		int aim_y = dash.getTeam2().get(0).getY() -30 ;

		testshoot.testShootBlue(dash, index_tireur,aim_x,aim_y);
		
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
		
		int aim_x = dash.getTeam1().get(0).getX() - 30 ;
		int aim_y = dash.getTeam1().get(0).getY() - 30 ;

		testshoot.testShootBlue(dash, index_tireur,aim_x,aim_y);
		
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
	
	public void doMiTemps (Dashboard dash) {
		mi_temps = dash.isMi_temps();
	}


}
