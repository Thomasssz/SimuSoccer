package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;
import gui.Dashboard;
import process.Passe;

public class Corner {

	private boolean receveur_corner = false;

	private Player receveur;

	Passe testPass = new Passe();

	/*
	 * Cette classe simule un corner, on génere un attaquant aléatoire qu'on place
	 * au corner avec la balle. Ensuite les attaquant se placent dans la surface de
	 * réparation de manière aléatoire
	 */

	public void CornerHautGauche(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players = dash.getTeam2();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieHautGaucheX() + 5);
			ballon.setPositiony_Ball(Sortie.getSortieHautGaucheY() + 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player p = players.get(borne);

			p.setX(Sortie.getSortieHautGaucheX());
			p.setY(Sortie.getSortieHautGaucheY());

			// Tirage de la position de la balle

			Random corner_place1_x = new Random();
			int placeX = 75;

			placeX = corner_place1_x.nextInt(118);

			placeX += 75;

			Random corner_place1_y = new Random();
			int placeY = 165;

			placeY = corner_place1_y.nextInt(293);

			placeY += 165;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();
			int tirage_re = 6;

			tirage_re = tirage_receveur.nextInt(5);

			tirage_re += 5;

			if (tirage_re != borne) {

				players.get(tirage_re).setX(placeX);
				players.get(tirage_re).setY(placeY);

			}

			for (int i = 0; i < players.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 75;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 75;

					players.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players.get(i).setY(place_other_y);

				}

			}

			if (tirage_re != borne) {

				receveur_corner = true;

			}

			receveur = players.get(tirage_re);
		}

		testPass.pass(dash, receveur);

	}

	public void CornerHautDroite(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players = dash.getTeam1();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieHautDroiteX() - 10);
			ballon.setPositiony_Ball(Sortie.getSortieHautDroiteY() + 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player p = players.get(borne);

			p.setX(Sortie.getSortieHautDroiteX() - 10);
			p.setY(Sortie.getSortieHautDroiteY());

			// Tirage de la position de la balle

			Random corner_place1_x = new Random();
			int placeX = 685;

			placeX = corner_place1_x.nextInt(118);

			placeX += 685;

			Random corner_place1_y = new Random();
			int placeY = 165;

			placeY = corner_place1_y.nextInt(293);

			placeY += 165;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();
			int tirage_re = 6;

			tirage_re = tirage_receveur.nextInt(5);

			tirage_re += 5;

			if (tirage_re != borne) {

				players.get(tirage_re).setX(placeX);
				players.get(tirage_re).setY(placeY);

			}

			for (int i = 0; i < players.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 685;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 685;

					players.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players.get(i).setY(place_other_y);

				}

			}

			if (tirage_re != borne) {
				receveur_corner = true;
			}

			receveur = players.get(tirage_re);
		}

		testPass.pass(dash, receveur);

	}

	public void CornerBasGauche(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players = dash.getTeam2();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieBasGaucheX() + 5);
			ballon.setPositiony_Ball(Sortie.getSortieBasGaucheY() - 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player p = players.get(borne);

			p.setX(Sortie.getSortieBasGaucheX());
			p.setY(Sortie.getSortieBasGaucheY());

			// Tirage de la position de la balle

			Random corner_place1_x = new Random();
			int placeX = 75;

			placeX = corner_place1_x.nextInt(118);

			placeX += 75;

			Random corner_place1_y = new Random();
			int placeY = 165;

			placeY = corner_place1_y.nextInt(293);

			placeY += 165;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();
			int tirage_re = 6;

			tirage_re = tirage_receveur.nextInt(5);

			tirage_re += 5;

			if (tirage_re != borne) {

				players.get(tirage_re).setX(placeX);
				players.get(tirage_re).setY(placeY);

			}

			for (int i = 0; i < players.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 75;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 75;

					players.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players.get(i).setY(place_other_y);

				}

			}

			if (tirage_re != borne) {
				receveur_corner = true;
			}

			receveur = players.get(tirage_re);
		}

		testPass.pass(dash, receveur);

	}

	public void CornerBasDroite(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players = dash.getTeam1();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieBasDroiteX() - 5);
			ballon.setPositiony_Ball(Sortie.getSortieBasDroiteY() - 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player p = players.get(borne);

			p.setX(Sortie.getSortieBasDroiteX());
			p.setY(Sortie.getSortieBasDroiteY());

			Random corner_place1_x = new Random();
			int placeX = 685;

			placeX = corner_place1_x.nextInt(118);

			placeX += 685;

			Random corner_place1_y = new Random();
			int placeY = 165;

			placeY = corner_place1_y.nextInt(293);

			placeY += 165;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();
			int tirage_re = 6;

			tirage_re = tirage_receveur.nextInt(5);

			tirage_re += 5;

			if (tirage_re != borne) {

				players.get(tirage_re).setX(placeX);
				players.get(tirage_re).setY(placeY);

			}

			for (int i = 0; i < players.size(); i++) {

				// x 685 et 195 y 165 et 458 // x 195 et 813 y 165 et 458

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 685;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 685;

					players.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players.get(i).setY(place_other_y);

				}

			}

			if (tirage_re != borne) {
				receveur_corner = true;
			}

			receveur = players.get(tirage_re);
		}

		testPass.pass(dash, receveur);

	}

	public Player getReceveur() {
		return receveur;
	}

	public void setReceveur(Player receveur) {
		this.receveur = receveur;
	}

	public Passe getTestPass() {
		return testPass;
	}

	public void setTestPass(Passe testPass) {
		this.testPass = testPass;
	}

	public boolean isReceveur_corner() {
		return receveur_corner;
	}

	public void setReceveur_corner(boolean receveur_corner) {
		this.receveur_corner = receveur_corner;
	}

	public Corner() {
		super();
	}

	public static void main(String[] args) {

	}

}
