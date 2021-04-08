package process;

import java.util.ArrayList;
import java.util.Random;

import data.Match;
import data.Player;
import data.Team;
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
	private int first_choice_touche = 0;

	private boolean goal = false;

	private Corner cornertest = new Corner();
	private Touche touchetest = new Touche();

	private Passe testpasse = new Passe();
	private Shoot testshoot = new Shoot();

	private Player receveur1 = null;
	private Player receveur2 = null;
	private Player receveur3 = null;

	private int aim_x = 0;
	private int aim_y = 0;

	private int touche_x = 0;
	private int touche_y = 0;

	private Move testmove = new Move();
	private Player player_ball = null;

	private Team players1 = null;
	private Team players2 = null;
	private Team ball_team = null;

	private Player tireur = null;

	private Player passeur = null;
	private Player receveur = null;

	private int proba = 200;

	private Match match = new Match();
	@SuppressWarnings("unused")
	private ChronometerGUI chronometergui;

	public MatchManager(ChronometerGUI chronometergui) {
		this.chronometergui = chronometergui;
	}

	public void matchProcess(Dashboard dash, ChronometerGUI chronometergui) {

		/*
		 * System.out.println("\n\n"); System.out.println("Etat du stop_action = " +
		 * dash.isStop_action()); System.out.println("Etat du stop_action_shoot = " +
		 * dash.isStop_action_shoot()); System.out.println("Etat du shoot = " +
		 * dash.isShoot()); System.out.println("Etat du corner = " + dash.isCorner());
		 * System.out.println("Etat du goal = " + dash.isGoal());
		 * System.out.println("Etat de la proba = " + proba);
		 * System.out.println("\n\n");
		 */

		begin = dash.isBegin();

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		if (begin == false) {

			// Temps(players1, players2);
			match = dash.getMatch();

			match.engagement(dash);

			dash.setBegin(true);

		}

		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc
		
		 doSimulation(dash);

		// doCorner(dash);

		// doTouche(dash);

		// doBlueShoot(dash);
		// doRedShoot(dash);

		// doMiTemps(dash,chronometergui);

		// doMove(dash);
		// doPass(dash);
	}

	public void doSimulation(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		System.out.println("Test TeamBall de Match Manager");
		
		ball_team = TeamBall(players1, players2);

		int index_player_ball = PlayerBall(ball_team);

		player_ball = ball_team.getPlayers().get(index_player_ball);

		

			if (blueShotSituation(player_ball) == true) {
				dash.setStop_action(false);
				dash.setShoot(false);

				shoot(dash);
			} else {
				doPass(dash);
			}

		

			if (redShotSituation(player_ball) == true) {
				dash.setStop_action(false);
				dash.setShoot(false);

				doRedShoot(dash);
			} else {
				doPass(dash);
			}
		}
	

	public void doMove(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_player_ball = PlayerBall(ball_team);

		player_ball = ball_team.getPlayers().get(index_player_ball);

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

		passeur = ball_team.getPlayers().get(index_passeur);

		if (receveur1 == null && receveur2 == null && receveur3 == null) {

			receveur1 = closestPlayer(dash, Player.position.DEFENSE);
			receveur2 = closestPlayer(dash, Player.position.MIDDLE);
			receveur3 = closestPlayer(dash, Player.position.ATTACK);

			Random rand = new Random();

			int choix_receveur = rand.nextInt(3);

			choix_receveur += 1;

			if (choix_receveur == 1) {
				receveur = receveur1;
			} else if (choix_receveur == 2) {
				receveur = receveur2;
			} else if (choix_receveur == 3) {
				receveur = receveur3;
			}

		}

		if (dash.isStop_action() == false) {

			testpasse.pass(dash, passeur, receveur);

		} else {

			dash.setStop_action(false);

			int index_new_passeur = PlayerBall(ball_team);

			passeur = ball_team.getPlayers().get(index_new_passeur);

			receveur1 = closestPlayer(dash, Player.position.DEFENSE);
			receveur2 = closestPlayer(dash, Player.position.MIDDLE);
			receveur3 = closestPlayer(dash, Player.position.ATTACK);

			Random rand = new Random();

			int choix_receveur = rand.nextInt(3);

			choix_receveur += 1;

			if (choix_receveur == 1) {
				receveur = receveur1;
			} else if (choix_receveur == 2) {
				receveur = receveur2;
			} else if (choix_receveur == 3) {
				receveur = receveur3;
			}

			testpasse.pass(dash, passeur, receveur);
			doMove(dash);

		}

	}

	public void doMiTemps(Dashboard dash, ChronometerGUI chronometergui) {
		MiTemps middle = new MiTemps();
		middle.middletime(chronometergui, dash);

	}

	public void doBlueShoot(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_tireur = PlayerBall(ball_team);

		player_ball = ball_team.getPlayers().get(index_tireur);

		shoot = dash.isShoot();

		if (shoot == false) {

			tireur = dash.getTeam1().getPlayers().get(index_tireur);

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

				int x_gardien = dash.getTeam2().getPlayers().get(0).getX();
				int y_gardien = dash.getTeam2().getPlayers().get(0).getY();

				testshoot.ShootBlue(dash, index_tireur, x_gardien, y_gardien, goal);
			}

		} else {
			testshoot.ShootBlue(dash, index_tireur, aim_x, aim_y, goal);
		}

		if (dash.isGoal() == true) {
			match.redEngagement(dash, player_ball);
		}

	}

	public void doRedShoot(Dashboard dash) {

		players1 = dash.getTeam1();
		players2 = dash.getTeam2();

		ball_team = TeamBall(players1, players2);

		int index_tireur = PlayerBall(ball_team);

		player_ball = ball_team.getPlayers().get(index_tireur);

		shoot = dash.isShoot();

		if (shoot == false) {

			tireur = dash.getTeam2().getPlayers().get(index_tireur);

			aim_x = 50;

			Random tir = new Random();

			aim_y = tir.nextInt(293);

			aim_y += 165;

			dash.setShoot(true);

		}

		if ((aim_y <= 375) && (aim_y > 250)) {

			System.out.println("tir cadre ");

			if (proba == 200) {
				goal = probabilite_succes(tireur.getShoot());
			}

			if (goal == true) {

				System.out.println("but");
				testshoot.ShootRed(dash, index_tireur, aim_x, aim_y, goal);

			} else {

				int x_gardien = dash.getTeam1().getPlayers().get(0).getX();
				int y_gardien = dash.getTeam1().getPlayers().get(0).getY();
				System.out.println("tir sur gardien");

				testshoot.ShootRed(dash, index_tireur, x_gardien, y_gardien, goal);
			}

		} else {
			System.out.println("tir non cadre");
			testshoot.ShootRed(dash, index_tireur, aim_x, aim_y, goal);
		}

		if (dash.isGoal() == true) {
			System.out.println("Engagement blue apres le but des rouges ");
			match.blueEngagement(dash, player_ball);
		}

	}
	
	public void shoot(Dashboard dash) {
		Team team1 = dash.getTeam1();
		Team team2 = dash.getTeam2();
		
		ball_team = TeamBall(team1, team2);
		
		switch(ball_team.getColor()) {
		case "blue" : doBlueShoot(dash);
		case "red" : doRedShoot(dash);
		}
		
		System.out.println("44");
			
		}
	public void doCorner(Dashboard dash) {

		System.out.println("on rentre dans le doCorner");

		corner = dash.isCorner();

		if (corner == false) {

			System.out.println("on fait les corner");

			cornertest = dash.getTestcorner();

			if (first_choice_corner == 0) {

				Random rand = new Random();
				int choix_corner = rand.nextInt(4);

				choix_corner += 1; // le tirage se fait entre 1 et 4

				first_choice_corner = choix_corner;

			}

			if (first_choice_corner == 1) {

				cornertest.CornerHautGauche(dash);

				if ((dash.isStop_action() == true) && (dash.isStop_action_shoot() == false)) {
					System.out.println("on est dans la situation ou on fait le tir ");
					doRedShoot(dash);
				}

			} else if (first_choice_corner == 2) {

				cornertest.CornerHautDroite(dash);

				if ((dash.isStop_action() == true) && (dash.isStop_action_shoot() == false)) {
					System.out.println("on est dans la situation ou on fait le tir ");
					doBlueShoot(dash);
				}

			} else if (first_choice_corner == 3) {

				cornertest.CornerBasGauche(dash);

				if ((dash.isStop_action() == true) && (dash.isStop_action_shoot() == false)) {
					System.out.println("on est dans la situation ou on fait le tir ");
					doRedShoot(dash);
				}

			} else if (first_choice_corner == 4) {

				cornertest.CornerBasDroite(dash);

				if ((dash.isStop_action() == true) && (dash.isStop_action_shoot() == false)) {
					System.out.println("on est dans la situation ou on fait le tir ");
					doBlueShoot(dash);
				}

			}

		} else {
			System.out.println("\n\nAucune action du corner\n\n");
			// doSimulation(dash);
		}

		if (dash.isStop_action_shoot() == true) {

			dash.setCorner(true);

		}
	}

	public void doTouche(Dashboard dash) {

		touche = dash.isTouche();

		if (touche == false) {

			touchetest = dash.getTesttouche();

			players1 = dash.getTeam1();
			players2 = dash.getTeam2();

			ball_team = TeamBall(players1, players2);

			if (first_choice_touche == 0) {

				Random rand = new Random();
				int choix_touche = rand.nextInt(6);

				choix_touche += 1; // le tirage se fait entre 1 et 6

				first_choice_touche = choix_touche;

				Random tx = new Random();

				touche_x = tx.nextInt(738);

				touche_x += 75;

				Random ty = new Random();

				int to_y = ty.nextInt(2);

				to_y += 1;

				if (to_y == 1) {
					touche_y = Sortie.getSortieHautGaucheY();
				} else if (to_y == 2) {
					touche_y = Sortie.getSortieBasGaucheY();
				}

			}

			// partie gauche 75 à 321 partie milieu de 321 à 567 partie droite de 567 à 813

			System.out.println("touche_x = " + touche_x);
			System.out.println("touche_y = " + touche_y);

			if ((touche_x <= 321) && (touche_y == Sortie.getSortieHautGaucheY())) {

				System.out.println("Touche Haut Gauche");

				if (ball_team.equals(players1)) {
					touchetest.runToucheHautGaucheBleu(dash, touche_x, touche_y, ball_team);
				} else if (ball_team.equals(players2)) {
					touchetest.runToucheHautGaucheRouge(dash, touche_x, touche_y, ball_team);
				}

				if ((dash.isStop_action() == true) && (dash.isStop_action_touche()) == false) {
					// doBlueShoot(dash);
				}

			} else if ((touche_x > 321) && (touche_x < 567) && (touche_y == Sortie.getSortieHautGaucheY())) {

				System.out.println("Touche Haut Milieu");

				if (ball_team.equals(players1)) {
					touchetest.runToucheHautMilieuBleu(dash, touche_x, touche_y, ball_team);
				} else if (ball_team.equals(players2)) {
					touchetest.runToucheHautMilieuRouge(dash, touche_x, touche_y, ball_team);
				}

				if ((dash.isStop_action() == true) && (dash.isStop_action_touche()) == false) {
					// doBlueShoot(dash);
				}

			} else if ((touche_x >= 567) && (touche_y == Sortie.getSortieHautGaucheY())) {

				System.out.println("Touche Haut Droite");

				if (ball_team.equals(players1)) {
					touchetest.runToucheHautDroiteBleu(dash, touche_x, touche_y, ball_team);
				} else if (ball_team.equals(players2)) {
					touchetest.runToucheHautDroiteRouge(dash, touche_x, touche_y, ball_team);
				}

				if ((dash.isStop_action() == true) && (dash.isStop_action_touche()) == false) {
					// doBlueShoot(dash);
				}

			} else if ((touche_x <= 321) && (touche_y == Sortie.getSortieBasGaucheY())) {

				System.out.println("Touche Bas Gauche");

				if (ball_team.equals(players1)) {
					touchetest.runToucheBasGaucheBleu(dash, touche_x, touche_y, ball_team);
				} else if (ball_team.equals(players2)) {
					touchetest.runToucheBasGaucheRouge(dash, touche_x, touche_y, ball_team);
				}

				if ((dash.isStop_action() == true) && (dash.isStop_action_touche()) == false) {
					// doBlueShoot(dash);
				}

			} else if ((touche_x > 321) && (touche_x < 567) && (touche_y == Sortie.getSortieBasGaucheY())) {

				System.out.println("Touche Bas Milieu");

				if (ball_team.equals(players1)) {
					touchetest.runToucheBasMilieuBleu(dash, touche_x, touche_y, ball_team);
				} else if (ball_team.equals(players2)) {
					touchetest.runToucheBasMilieuRouge(dash, touche_x, touche_y, ball_team);
				}

				if ((dash.isStop_action() == true) && (dash.isStop_action_touche()) == false) {
					// doBlueShoot(dash);
				}

			} else if ((touche_x >= 567) && (touche_y == Sortie.getSortieBasGaucheY())) {

				System.out.println("Touche Bas Droite");

				if (ball_team.equals(players1)) {
					touchetest.runToucheBasDroiteBleu(dash, touche_x, touche_y, ball_team);
				} else if (ball_team.equals(players2)) {
					touchetest.runToucheBasDroiteRouge(dash, touche_x, touche_y, ball_team);
				}

				if ((dash.isStop_action() == true) && (dash.isStop_action_touche()) == false) {
					// doBlueShoot(dash);
				}

			}

		} else {
			System.out.println("\n\nAucune action de la touche\n\n");
			// doSimulation(dash);
		}

		if (dash.isStop_action_touche() == true) {

			dash.setTouche(true);

		}

	}

	public int PlayerBall(Team players1) {

		int res = 12;

		boolean stop = false;
		int i = 0;

		while (i < players1.getPlayers().size() && (stop == false)) {

			if (players1.getPlayers().get(i).isBall() == true) {

				stop = true;
				res = i;

			}
			i++;

		}

		return res;

	}

	public Player closestPlayer(Dashboard dash, Player.position poste) {

		Team players1 = dash.getTeam1();
		Team players2 = dash.getTeam2();

		Team ball_team = TeamBall(players1, players2); // équipe qui a la balle

		int index_player_ball = PlayerBall(ball_team);

		Player player = ball_team.getPlayers().get(index_player_ball); // joueur qui a la balle

		// recuperer les coordonnées du joueur ayant la balle
		@SuppressWarnings("unused")
		int player_x = player.getX();
		@SuppressWarnings("unused")
		int player_y = player.getY();

		/*
		 * Player player_min = ball_team.getPlayers().get(1);
		 * 
		 * float distance_min = 800 ;
		 * 
		 * if ( !(player.equals(player_min)) ) {
		 * 
		 * distance_min = (float) Math.sqrt(Math.pow(player_x - player_min.getX(), 2) +
		 * Math.pow(player_y - player_min.getY(), 2));
		 * 
		 * }
		 * 
		 * for (int i = 1; i < ball_team.size(); i++) {
		 * 
		 * if (i != index_player_ball && ball_team.getPlayers().get(i).getPosition().equals(poste)) {
		 * int x = ball_team.getPlayers().get(i).getX(); int y = ball_team.getPlayers().get(i).getY();
		 * 
		 * float distance = (float) Math.sqrt(Math.pow(player_x - x, 2) +
		 * Math.pow(player_y - y, 2));
		 * 
		 * if (distance < distance_min) { player_min = ball_team.getPlayers().get(i); }
		 * 
		 * } }
		 * 
		 * return player_min; }
		 */

		Player player_min = null;

		if (poste.equals(Player.position.ATTACK)) {

			boolean passeur = false;

			while (passeur == false) {

				Random rec = new Random();
				int receveur = rec.nextInt(2);
				receveur += 1;

				if (receveur == 1) {
					player_min = ball_team.getPlayers().get(9);
				} else if (receveur == 2) {
					player_min = ball_team.getPlayers().get(10);
				}

				if (!(player_min.equals(player))) {
					passeur = true;
				}
			}

		} else if (poste.equals(Player.position.MIDDLE)) {

			boolean passeur = false;

			while (passeur == false) {

				Random rec = new Random();
				int receveur = rec.nextInt(4);
				receveur += 1;

				if (receveur == 1) {
					player_min = ball_team.getPlayers().get(5);
				} else if (receveur == 2) {
					player_min = ball_team.getPlayers().get(6);
				} else if (receveur == 3) {
					player_min = ball_team.getPlayers().get(7);
				} else if (receveur == 4) {
					player_min = ball_team.getPlayers().get(8);
				}

				if (!(player_min.equals(player))) {
					passeur = true;
				}
			}

		} else if (poste.equals(Player.position.DEFENSE)) {

			boolean passeur = false;

			while (passeur == false) {

				Random rec = new Random();
				int receveur = rec.nextInt(4);
				receveur += 1;

				if (receveur == 1) {
					player_min = ball_team.getPlayers().get(1);
				} else if (receveur == 2) {
					player_min = ball_team.getPlayers().get(2);
				} else if (receveur == 3) {
					player_min = ball_team.getPlayers().get(3);
				} else if (receveur == 4) {
					player_min = ball_team.getPlayers().get(4);
				}

				if (!(player_min.equals(player))) {
					passeur = true;
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

		System.out.println("dans methode proba = " + proba);
		System.out.println("chance = " + chance);

		if (proba <= chance) {
			return true;
		} else {
			return false;
		}
	}

	public Team TeamBall(Team players1, Team players2) {

		int i = 0;

		boolean stop = false;

		while (i < players1.getPlayers().size() && (stop == false)) {

			if (players1.getPlayers().get(i).isBall() == true) {

				System.out.println("Blue got the BALL");
				stop = true;
				return players1;

			}

			if (players2.getPlayers().get(i).isBall() == true) {

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

	public void Temps(ArrayList<Player> players1, ArrayList<Player> players2) {

		Random prob = new Random();
		proba = prob.nextInt(2);

		boolean stop = false;
		int i = 0;

		if (proba == 0) {
			System.out.println("Soleil");
			while (i < players1.size() && (stop == false)) {

				if (players1.get(i).getPlayer_temps() == Player.temps.SOLEIL) {
					players1.get(i).setDefense(players1.get(i).getDefense() + 5);
					players1.get(i).setEndurance(players1.get(i).getEndurance() + 5);
					players1.get(i).setDribbles(players1.get(i).getDribbles() + 5);
					players1.get(i).setShoot(players1.get(i).getShoot() + 5);
					players1.get(i).setSpeed(players1.get(i).getSpeed() + 5);
					players1.get(i).setPass(players1.get(i).getPass() + 5);

				} else {
					players1.get(i).setDefense(players1.get(i).getDefense() - 5);
					players1.get(i).setEndurance(players1.get(i).getEndurance() - 5);
					players1.get(i).setDribbles(players1.get(i).getDribbles() - 5);
					players1.get(i).setShoot(players1.get(i).getShoot() - 5);
					players1.get(i).setSpeed(players1.get(i).getSpeed() - 5);
					players1.get(i).setPass(players1.get(i).getPass() - 5);

				}
				stop = true;
			}
			stop = false;
			while (i < players2.size() && (stop == false)) {

				if (players2.get(i).getPlayer_temps() == Player.temps.SOLEIL) {
					players2.get(i).setDefense(players2.get(i).getDefense() + 5);
					players2.get(i).setEndurance(players2.get(i).getEndurance() + 5);
					players2.get(i).setDribbles(players2.get(i).getDribbles() + 5);
					players2.get(i).setShoot(players2.get(i).getShoot() + 5);
					players2.get(i).setSpeed(players2.get(i).getSpeed() + 5);
					players2.get(i).setPass(players2.get(i).getPass() + 5);

				} else {
					players2.get(i).setDefense(players2.get(i).getDefense() - 5);
					players2.get(i).setEndurance(players2.get(i).getEndurance() - 5);
					players2.get(i).setDribbles(players2.get(i).getDribbles() - 5);
					players2.get(i).setShoot(players2.get(i).getShoot() - 5);
					players2.get(i).setSpeed(players2.get(i).getSpeed() - 5);
					players2.get(i).setPass(players2.get(i).getPass() - 5);

				}
				stop = true;
			}
		} else if (proba == 1) {
			System.out.println("Neige");
			while (i < players1.size() && (stop == false)) {

				if (players1.get(i).getPlayer_temps() == Player.temps.NEIGE) {
					players1.get(i).setDefense(players1.get(i).getDefense() + 5);
					players1.get(i).setEndurance(players1.get(i).getEndurance() + 5);
					players1.get(i).setDribbles(players1.get(i).getDribbles() + 5);
					players1.get(i).setShoot(players1.get(i).getShoot() + 5);
					players1.get(i).setSpeed(players1.get(i).getSpeed() + 5);
					players1.get(i).setPass(players1.get(i).getPass() + 5);

				} else {
					players1.get(i).setDefense(players1.get(i).getDefense() - 5);
					players1.get(i).setEndurance(players1.get(i).getEndurance() - 5);
					players1.get(i).setDribbles(players1.get(i).getDribbles() - 5);
					players1.get(i).setShoot(players1.get(i).getShoot() - 5);
					players1.get(i).setSpeed(players1.get(i).getSpeed() - 5);
					players1.get(i).setPass(players1.get(i).getPass() - 5);

				}
				stop = true;
			}
			stop = false;
			while (i < players2.size() && (stop == false)) {

				if (players2.get(i).getPlayer_temps() == Player.temps.NEIGE) {
					players2.get(i).setDefense(players2.get(i).getDefense() + 5);
					players2.get(i).setEndurance(players2.get(i).getEndurance() + 5);
					players2.get(i).setDribbles(players2.get(i).getDribbles() + 5);
					players2.get(i).setShoot(players2.get(i).getShoot() + 5);
					players2.get(i).setSpeed(players2.get(i).getSpeed() + 5);
					players2.get(i).setPass(players2.get(i).getPass() + 5);

				} else {
					players2.get(i).setDefense(players2.get(i).getDefense() - 5);
					players2.get(i).setEndurance(players2.get(i).getEndurance() - 5);
					players2.get(i).setDribbles(players2.get(i).getDribbles() - 5);
					players2.get(i).setShoot(players2.get(i).getShoot() - 5);
					players2.get(i).setSpeed(players2.get(i).getSpeed() - 5);
					players2.get(i).setPass(players2.get(i).getPass() - 5);

				}
			}
			stop = true;
		}

		else if (proba == 2) {
			System.out.println("Pluie");
			while (i < players1.size() && (stop == false)) {

				if (players1.get(i).getPlayer_temps() == Player.temps.PLUIE) {
					players1.get(i).setDefense(players1.get(i).getDefense() + 5);
					players1.get(i).setEndurance(players1.get(i).getEndurance() + 5);
					players1.get(i).setDribbles(players1.get(i).getDribbles() + 5);
					players1.get(i).setShoot(players1.get(i).getShoot() + 5);
					players1.get(i).setSpeed(players1.get(i).getSpeed() + 5);
					players1.get(i).setPass(players1.get(i).getPass() + 5);

				} else {
					players1.get(i).setDefense(players1.get(i).getDefense() - 5);
					players1.get(i).setEndurance(players1.get(i).getEndurance() - 5);
					players1.get(i).setDribbles(players1.get(i).getDribbles() - 5);
					players1.get(i).setShoot(players1.get(i).getShoot() - 5);
					players1.get(i).setSpeed(players1.get(i).getSpeed() - 5);
					players1.get(i).setPass(players1.get(i).getPass() - 5);

				}
				stop = true;
			}
			stop = false;
			while (i < players2.size() && (stop == false)) {

				if (players2.get(i).getPlayer_temps() == Player.temps.PLUIE) {
					players2.get(i).setDefense(players2.get(i).getDefense() + 5);
					players2.get(i).setEndurance(players2.get(i).getEndurance() + 5);
					players2.get(i).setDribbles(players2.get(i).getDribbles() + 5);
					players2.get(i).setShoot(players2.get(i).getShoot() + 5);
					players2.get(i).setSpeed(players2.get(i).getSpeed() + 5);
					players2.get(i).setPass(players2.get(i).getPass() + 5);

				} else {
					players2.get(i).setDefense(players2.get(i).getDefense() - 5);
					players2.get(i).setEndurance(players2.get(i).getEndurance() - 5);
					players2.get(i).setDribbles(players2.get(i).getDribbles() - 5);
					players2.get(i).setShoot(players2.get(i).getShoot() - 5);
					players2.get(i).setSpeed(players2.get(i).getSpeed() - 5);
					players2.get(i).setPass(players2.get(i).getPass() - 5);

				}
				stop = true;
			}
		}
	}

}
