package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;
import data.Team;
import gui.Dashboard;
import process.Passe;

public class Touche {

	private boolean touche_fini = false;

	private Player passeur_touche = null;
	private Player receveur = null;

	private Passe testPass = new Passe();

	/*
	 * Cette classe simule une touche, elle place un joueur aléatoire et la balle
	 * en l'endroit où la balle est sortie. Ensuite deux joueurs de son équipe se
	 * placent à coté de manière a recevoir la balle.
	 */

	public void runToucheHautGaucheBleu(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 1;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY += y;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 2;
			} else if (tirage_re == 2) {
				tirage_re = 5;
			} else if (tirage_re == 3) {
				tirage_re = 6;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 1; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 2) || (i == 5) || (i == 6)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y += y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheBasGaucheBleu(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 4;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY = y - placeY;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 3;
			} else if (tirage_re == 2) {
				tirage_re = 7;
			} else if (tirage_re == 3) {
				tirage_re = 8;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 3) || (i == 7) || (i == 8)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y = y- place_other_y ;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheHautMilieuBleu(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 5;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 95;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY += y;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(2);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 1;
			} else if (tirage_re == 2) {
				tirage_re = 6;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 1; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 1) || (i == 6)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 95;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y += y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheBasMilieuBleu(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 8;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 95;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY = y - placeY ;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(2);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 4;
			} else if (tirage_re == 2) {
				tirage_re = 7;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 4) || (i == 7)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 95;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y = y - place_other_y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheHautDroiteBleu(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 5;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 190;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY += y;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				// pas besoin de changer l'index du player
			} else if (tirage_re == 2) {
				tirage_re = 6;
			} else if (tirage_re == 3) {
				tirage_re = 9;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 1) || (i == 6) || (i == 9)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 190;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y += y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheBasDroiteBleu(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 8;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 190;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY = y - placeY;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 4;
			} else if (tirage_re == 2) {
				tirage_re = 7;
			} else if (tirage_re == 3) {
				tirage_re = 10;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 4) || (i == 7) || (i == 10)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 190;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y = y - place_other_y ;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}
	
	public void runToucheHautGaucheRouge(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 5;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 190;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY += y;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				// pas besoin de changer l'index du player
			} else if (tirage_re == 2) {
				tirage_re = 6;
			} else if (tirage_re == 3) {
				tirage_re = 9;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 1) || (i == 6) || (i == 9)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 190;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y += y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheBasGaucheRouge(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 8;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 190;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY = y - placeY;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 4;
			} else if (tirage_re == 2) {
				tirage_re = 7;
			} else if (tirage_re == 3) {
				tirage_re = 10;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 4) || (i == 7) || (i == 10)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 190;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y = y - place_other_y ;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheHautMilieuRouge(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 5;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 95;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY += y;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(2);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 1;
			} else if (tirage_re == 2) {
				tirage_re = 6;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 1; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 1) || (i == 6)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 95;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y += y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheBasMilieuRouge(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 8;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x - 95;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY = y - placeY ;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(2);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 4;
			} else if (tirage_re == 2) {
				tirage_re = 7;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 4) || (i == 7)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x - 95;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y = y - place_other_y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheHautDroiteRouge(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 1;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY += y;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 2;
			} else if (tirage_re == 2) {
				tirage_re = 5;
			} else if (tirage_re == 3) {
				tirage_re = 6;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 1; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 2) || (i == 5) || (i == 6)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y += y;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}

	public void runToucheBasDroiteRouge(Dashboard dash, int x, int y, Team players) {

		Ball ballon = dash.getBallon();

		while (touche_fini != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			int borne = 4;

			Player passeur = players.getPlayers().get(borne);

			passeur_touche = passeur;

			passeur.setX(x);
			passeur.setY(y);

			passeur.setBall(true);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();

			int placeX = touche_place1_x.nextInt(190);

			placeX += x;

			Random touche_place1_y = new Random();

			int placeY = touche_place1_y.nextInt(88);

			placeY = y - placeY;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();

			int tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 1;

			if (tirage_re == 1) {
				tirage_re = 3;
			} else if (tirage_re == 2) {
				tirage_re = 7;
			} else if (tirage_re == 3) {
				tirage_re = 8;
			}

			players.getPlayers().get(tirage_re).setX(placeX);
			players.getPlayers().get(tirage_re).setY(placeY);

			for (int i = 0; i < players.getPlayers().size(); i++) {

				if ((i != borne) && (i != tirage_re)) {

					if ((i == 3) || (i == 7) || (i == 8)) {

						Random touche_place_other_x = new Random();

						int place_other_x = touche_place_other_x.nextInt(190);

						place_other_x += x;

						Random touche_place_other_y = new Random();

						int place_other_y = touche_place_other_y.nextInt(88);

						place_other_y = y- place_other_y ;

						players.getPlayers().get(i).setX(place_other_x);
						players.getPlayers().get(i).setY(place_other_y);

					}

				}

			}

			if (tirage_re != borne) {

				touche_fini = true;

			}

			receveur = players.getPlayers().get(tirage_re);
		}

		testPass.pass(dash, passeur_touche, receveur);

	}
	
}