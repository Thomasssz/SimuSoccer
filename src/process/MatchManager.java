package process;

import java.util.ArrayList;
import java.util.Random;
import java.util.LinkedList;

import data.Match;
import data.Player;
import delimitations.Corner;
import delimitations.Sortie;
import delimitations.Touche;
import gui.ChronometerGUI;
import gui.Dashboard;

public class MatchManager {

	private boolean begin = false;
	private boolean corner = false;
	private boolean touche = false;
	private boolean shoot = false;

	private int first_choice_corner = 0;

	private boolean goal = false;

	private Corner cornertest = null;
	private Touche touchetest = null;

	private Passe testpasse = new Passe();
	private Shoot testshoot = new Shoot();

	private Player receveur1 = null;
	private Player receveur2 = null;
	private Player receveur3 = null;

	private int aim_x = 0;
	private int aim_y = 0;

	private Move testmove = new Move();
	private Player player_ball = null;

	private ArrayList<Player> players1 = null;
	private ArrayList<Player> players2 = null;
	private ArrayList<Player> ball_team = null;

	private Player tireur = null;

	private Player passeur = null;
	private Player receveur = null;

	private int proba = 200;

	private Match match = new Match();
	private ChronometerGUI chronometergui;
	
	private static Player.temps PL=Enum.valueOf(Player.temps.class, "PLUIE");
	private static Player.temps NE=Enum.valueOf(Player.temps.class, "NEIGE");
	private static Player.temps SO=Enum.valueOf(Player.temps.class, "SOLEIL");

	public MatchManager(ChronometerGUI chronometergui) {
		this.chronometergui = chronometergui;
	}

	public void matchProcess(Dashboard dash, ChronometerGUI chronometergui) {
		
		
		begin = dash.isBegin();
		players1 = dash.getTeam1();
		players2 = dash.getTeam2();
		

		if (begin == false) {
			Temps(players1, players2);
			match = dash.getMatch();

			match.engagement(dash);

			dash.setBegin(true);
			

		}

		
		
		
		ball_team = TeamBall(players1, players2);

		int index_player_ball = PlayerBall(ball_team);

		player_ball = ball_team.get(index_player_ball);
		if (ball_team.equals(players1)) {
			
			if (blueShotSituation(player_ball) == true) {
				dash.setStop_action(false);
				dash.setShoot(false);

				doBlueShoot(dash);
			} else {
				doPass(dash);
			}

		} else if (ball_team.equals(players2)) {
			
			if (redShotSituation(player_ball) == true) {
				dash.setStop_action(false);
				dash.setShoot(false);

				doRedShoot(dash);
			} else {
				doPass(dash);
			}
		}

		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc

		// doCorner(dash);
		// doTouche(dash);

		// doBlueShoot(dash);
		// doRedShoot(dash);

		// doMiTemps(dash,chronometergui);

		// doMove(dash);
		// doPass(dash, passeur, receveur);
			}

	public void doMove(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_player_ball = PlayerBall(ball_team);

		player_ball = ball_team.get(index_player_ball);

		if (ball_team.equals(players1)) {
			testmove.Movement(dash, "blue", player_ball);

		} else if (ball_team.equals(players2)) {
			testmove.Movement(dash, "red", player_ball);
		}
	}

	public void doPass(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_passeur = PlayerBall(ball_team);

		passeur = ball_team.get(index_passeur);

		if (receveur1 == null && receveur2 == null && receveur3 == null) {

			receveur1 = closestPlayer(dash, Player.position.DEFENSE);
			receveur2 = closestPlayer(dash, Player.position.MIDDLE);
			receveur3 = closestPlayer(dash, Player.position.ATTACK);

			Random rand = new Random();

			int choix_receveur = rand.nextInt(3);

			if (choix_receveur == 0) {
				receveur = receveur1;

				/*
				 * if (passeur.getPosition().equals(Player.position.ATTACK) &&
				 * receveur.getPosition().equals(Player.position.MIDDLE)) {
				 * 
				 * }
				 */

			} else if (choix_receveur == 1) {
				receveur = receveur2;
			} else if (choix_receveur == 2) {
				receveur = receveur3;
			}

		}

		if (dash.isStop_action() == false) {

			testpasse.pass(dash, passeur, receveur);

		} else {

			dash.setStop_action(false);

			int index_new_passeur = PlayerBall(ball_team);

			passeur = ball_team.get(index_new_passeur);

			receveur1 = closestPlayer(dash, Player.position.DEFENSE);
			receveur2 = closestPlayer(dash, Player.position.MIDDLE);
			receveur3 = closestPlayer(dash, Player.position.ATTACK);

			Random rand = new Random();

			int choix_receveur = rand.nextInt(3);

			if (choix_receveur == 0) {
				receveur = receveur1;
			} else if (choix_receveur == 1) {
				receveur = receveur2;
			} else if (choix_receveur == 2) {
				receveur = receveur3;
			}

			testpasse.pass(dash, passeur, receveur);
			doMove(dash);

		}

	}

	public void doMiTemps(Dashboard dash, ChronometerGUI chronometergui) {
		// mi_temps = dash.isMi_temps();
		MiTemps middle = new MiTemps();
		middle.middletime(chronometergui, dash);

	}

	public void doBlueShoot(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_tireur = PlayerBall(ball_team);

		player_ball = ball_team.get(index_tireur);

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
			match.redEngagement(dash, player_ball);
		}

		dash.setStop_action(false);

	}

	public void doRedShoot(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_tireur = PlayerBall(ball_team);

		player_ball = ball_team.get(index_tireur);

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
			match.blueEngagement(dash, player_ball);
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

	public Player closestPlayer(Dashboard dash, Player.position poste) {

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

			if (i != index_player_ball && ball_team.get(i).getPosition().equals(poste)) {
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

		Random prob = new Random();
		proba = prob.nextInt(100);

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

				System.out.println("Blue got the BALL");
				stop = true;
				return players1;

			}

			if (players2.get(i).isBall() == true) {

				System.out.println("Red got the BALL");
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
	
	public void Temps (ArrayList<Player> players1, ArrayList<Player> players2) {
		
		Random prob = new Random();
		proba = prob.nextInt(2);
	
		boolean stop=false;
		int i=0;
		
		if (proba==0) {
			System.out.println("Soleil");
		while (i < players1.size() && (stop == false)) {

			if (players1.get(i).getPlayer_temps() == SO) {
				players1.get(i).setDefense(players1.get(i).getDefense()+5);
				players1.get(i).setEndurance(players1.get(i).getEndurance()+5);
				players1.get(i).setDribbles(players1.get(i).getDribbles()+5);
				players1.get(i).setShoot(players1.get(i).getShoot()+5);
				players1.get(i).setSpeed(players1.get(i).getSpeed()+5);
				players1.get(i).setPass(players1.get(i).getPass()+5);

			}
			else {
				players1.get(i).setDefense(players1.get(i).getDefense()-5);
				players1.get(i).setEndurance(players1.get(i).getEndurance()-5);
				players1.get(i).setDribbles(players1.get(i).getDribbles()-5);
				players1.get(i).setShoot(players1.get(i).getShoot()-5);
				players1.get(i).setSpeed(players1.get(i).getSpeed()-5);
				players1.get(i).setPass(players1.get(i).getPass()-5);

			}
			stop=true;
		}
		stop=false;
		while (i < players2.size() && (stop == false)) {

			if (players2.get(i).getPlayer_temps() == SO) {
				players2.get(i).setDefense(players2.get(i).getDefense()+5);
				players2.get(i).setEndurance(players2.get(i).getEndurance()+5);
				players2.get(i).setDribbles(players2.get(i).getDribbles()+5);
				players2.get(i).setShoot(players2.get(i).getShoot()+5);
				players2.get(i).setSpeed(players2.get(i).getSpeed()+5);
				players2.get(i).setPass(players2.get(i).getPass()+5);

			}
			else {
				players2.get(i).setDefense(players2.get(i).getDefense()-5);
				players2.get(i).setEndurance(players2.get(i).getEndurance()-5);
				players2.get(i).setDribbles(players2.get(i).getDribbles()-5);
				players2.get(i).setShoot(players2.get(i).getShoot()-5);
				players2.get(i).setSpeed(players2.get(i).getSpeed()-5);
				players2.get(i).setPass(players2.get(i).getPass()-5);

			}
			stop=true;
		}
	}
		else if (proba==1) {
			System.out.println("Neige");
			while (i < players1.size() && (stop == false)) {
				
				if (players1.get(i).getPlayer_temps() == NE) {
					players1.get(i).setDefense(players1.get(i).getDefense()+5);
					players1.get(i).setEndurance(players1.get(i).getEndurance()+5);
					players1.get(i).setDribbles(players1.get(i).getDribbles()+5);
					players1.get(i).setShoot(players1.get(i).getShoot()+5);
					players1.get(i).setSpeed(players1.get(i).getSpeed()+5);
					players1.get(i).setPass(players1.get(i).getPass()+5);

				}
				else {
					players1.get(i).setDefense(players1.get(i).getDefense()-5);
					players1.get(i).setEndurance(players1.get(i).getEndurance()-5);
					players1.get(i).setDribbles(players1.get(i).getDribbles()-5);
					players1.get(i).setShoot(players1.get(i).getShoot()-5);
					players1.get(i).setSpeed(players1.get(i).getSpeed()-5);
					players1.get(i).setPass(players1.get(i).getPass()-5);

				}
				stop=true;
			}
			stop=false;
			while (i < players2.size() && (stop == false)) {

				if (players2.get(i).getPlayer_temps() == NE) {
					players2.get(i).setDefense(players2.get(i).getDefense()+5);
					players2.get(i).setEndurance(players2.get(i).getEndurance()+5);
					players2.get(i).setDribbles(players2.get(i).getDribbles()+5);
					players2.get(i).setShoot(players2.get(i).getShoot()+5);
					players2.get(i).setSpeed(players2.get(i).getSpeed()+5);
					players2.get(i).setPass(players2.get(i).getPass()+5);

				}
				else {
					players2.get(i).setDefense(players2.get(i).getDefense()-5);
					players2.get(i).setEndurance(players2.get(i).getEndurance()-5);
					players2.get(i).setDribbles(players2.get(i).getDribbles()-5);
					players2.get(i).setShoot(players2.get(i).getShoot()-5);
					players2.get(i).setSpeed(players2.get(i).getSpeed()-5);
					players2.get(i).setPass(players2.get(i).getPass()-5);

				}
			}
			stop=true;
		}
		
		else if (proba==2) {
			System.out.println("Pluie");
			while (i < players1.size() && (stop == false)) {

				if (players1.get(i).getPlayer_temps() == PL) {
					players1.get(i).setDefense(players1.get(i).getDefense()+5);
					players1.get(i).setEndurance(players1.get(i).getEndurance()+5);
					players1.get(i).setDribbles(players1.get(i).getDribbles()+5);
					players1.get(i).setShoot(players1.get(i).getShoot()+5);
					players1.get(i).setSpeed(players1.get(i).getSpeed()+5);
					players1.get(i).setPass(players1.get(i).getPass()+5);

				}
				else {
					players1.get(i).setDefense(players1.get(i).getDefense()-5);
					players1.get(i).setEndurance(players1.get(i).getEndurance()-5);
					players1.get(i).setDribbles(players1.get(i).getDribbles()-5);
					players1.get(i).setShoot(players1.get(i).getShoot()-5);
					players1.get(i).setSpeed(players1.get(i).getSpeed()-5);
					players1.get(i).setPass(players1.get(i).getPass()-5);

				}
				stop=true;
			}
			stop=false;
			while (i < players2.size() && (stop == false)) {

				if (players2.get(i).getPlayer_temps() == PL) {
					players2.get(i).setDefense(players2.get(i).getDefense()+5);
					players2.get(i).setEndurance(players2.get(i).getEndurance()+5);
					players2.get(i).setDribbles(players2.get(i).getDribbles()+5);
					players2.get(i).setShoot(players2.get(i).getShoot()+5);
					players2.get(i).setSpeed(players2.get(i).getSpeed()+5);
					players2.get(i).setPass(players2.get(i).getPass()+5);

				}
				else {
					players2.get(i).setDefense(players2.get(i).getDefense()-5);
					players2.get(i).setEndurance(players2.get(i).getEndurance()-5);
					players2.get(i).setDribbles(players2.get(i).getDribbles()-5);
					players2.get(i).setShoot(players2.get(i).getShoot()-5);
					players2.get(i).setSpeed(players2.get(i).getSpeed()-5);
					players2.get(i).setPass(players2.get(i).getPass()-5);

				}
				stop=true;
			}
		}
	}
	
	
	
	
	}


	
	
