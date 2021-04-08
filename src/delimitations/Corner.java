package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;
import gui.Dashboard;
import process.Passe;
import process.Shoot;

public class Corner {

	private boolean receveur_corner = false;

	private Player passeur = null ;
	private Player receveur = null ;

	private Passe testPass = new Passe();
	@SuppressWarnings("unused")
	private Shoot testShoot = new Shoot();
	
	@SuppressWarnings("unused")
	private Player tireur = null ;

	/*
	 * Cette classe simule un corner, on génere un attaquant aléatoire qu'on place
	 * au corner avec la balle. Ensuite les attaquant se placent dans la surface de
	 * réparation de manière aléatoire
	 */

	public void CornerHautGauche(Dashboard dash) {
		
		Ball ballon = dash.getBallon();

		ArrayList<Player> players1 = dash.getTeam1().getPlayers();
		ArrayList<Player> players2 = dash.getTeam2().getPlayers();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieHautGaucheX() + 5);
			ballon.setPositiony_Ball(Sortie.getSortieHautGaucheY() + 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player player_corner = players2.get(borne);
			
			passeur = player_corner ;
			
			passeur.setBall(true);

			player_corner.setX(Sortie.getSortieHautGaucheX());
			player_corner.setY(Sortie.getSortieHautGaucheY());

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

				players2.get(tirage_re).setX(placeX);
				players2.get(tirage_re).setY(placeY);

			}

			for (int i = 1; i < players2.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 75;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 75;

					players2.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players2.get(i).setY(place_other_y);

				} else {
					
					Player def_1 = players2.get(1) ;
					Player def_2 = players2.get(2) ;
					Player def_3 = players2.get(3) ;
					Player def_4 = players2.get(4) ;
					
					
					if (players2.get(i).equals(def_1) ) {
						
						players2.get(i).setX(450) ;
						players2.get(i).setY(100) ;
						
					} else if (players2.get(i).equals(def_2) ) {
						
						players2.get(i).setX(450) ;
						players2.get(i).setY(265) ;
						
					} else if (players2.get(i).equals(def_3) ) {
						
						players2.get(i).setX(450) ;
						players2.get(i).setY(365) ;
						
					} else if (players2.get(i).equals(def_4) ) {
						players2.get(i).setX(450) ;
						players2.get(i).setY(500) ;
					}
					
				}

			}
			
			for (int i = 1; i < players1.size(); i++) {

				if  (i <= 8) {

					Random corner_place_other_x = new Random();

					int place_other_x = 75;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 75;

					players1.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players1.get(i).setY(place_other_y);

				} else {
					
					int attack_x = 350 ;
					
					Random random_attack = new Random();
					
					int attack_y = random_attack.nextInt(293) ;
					attack_y += 165 ;
					
					players1.get(i).setX(attack_x);
					players1.get(i).setY(attack_y);
				}

			}

			if (tirage_re != borne) {

				receveur_corner = true;

			}

			receveur = players2.get(tirage_re);
		}
			
			testPass.pass(dash,passeur,receveur);		
	} 
		
	public void CornerHautDroite(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players1 = dash.getTeam1().getPlayers();
		ArrayList<Player> players2 = dash.getTeam2().getPlayers();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieHautDroiteX() - 10);
			ballon.setPositiony_Ball(Sortie.getSortieHautDroiteY() + 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player player_corner = players1.get(borne);
			
			passeur = player_corner ;
			passeur.setBall(true);

			player_corner.setX(Sortie.getSortieHautDroiteX() - 10);
			player_corner.setY(Sortie.getSortieHautDroiteY());

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

				players1.get(tirage_re).setX(placeX);
				players1.get(tirage_re).setY(placeY);

			}

			for (int i = 1; i < players1.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 685;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 685;

					players1.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players1.get(i).setY(place_other_y);

				} else {
					
					Player def_1 = players1.get(1) ;
					Player def_2 = players1.get(2) ;
					Player def_3 = players1.get(3) ;
					Player def_4 = players1.get(4) ;
					
					
					if (players1.get(i).equals(def_1) ) {
						
						players1.get(i).setX(430) ;
						players1.get(i).setY(100) ;
						
					} else if (players1.get(i).equals(def_2) ) {
						
						players1.get(i).setX(430) ;
						players1.get(i).setY(265) ;
						
					} else if (players1.get(i).equals(def_3) ) {
						
						players1.get(i).setX(430) ;
						players1.get(i).setY(365) ;
						
					} else if (players1.get(i).equals(def_4) ) {
						players1.get(i).setX(430) ;
						players1.get(i).setY(500) ;
					}
					
				}

			}
			
			for (int i = 1; i < players2.size(); i++) {

				// x 685 et 195 y 165 et 458 // x 195 et 813 y 165 et 458

				if (i <= 8) {

					Random corner_place_other_x = new Random();

					int place_other_x = 685;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 685;

					players2.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players2.get(i).setY(place_other_y);

				} else {
					
					int attack_x = 550 ;
					
					Random random_attack = new Random();
					
					int attack_y = random_attack.nextInt(293) ;
					attack_y += 165 ;
					
					players2.get(i).setX(attack_x);
					players2.get(i).setY(attack_y);
				}

			}

			if (tirage_re != borne) {
				receveur_corner = true;
			}

			receveur = players1.get(tirage_re);
		}

		testPass.pass(dash,passeur, receveur);
		
	}

	public void CornerBasGauche(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players2 = dash.getTeam2().getPlayers();
		ArrayList<Player> players1 = dash.getTeam1().getPlayers();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieBasGaucheX() + 5);
			ballon.setPositiony_Ball(Sortie.getSortieBasGaucheY() - 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player player_corner = players2.get(borne);
			
			passeur = player_corner ;
			passeur.setBall(true);

			player_corner.setX(Sortie.getSortieBasGaucheX() - 10);
			player_corner.setY(Sortie.getSortieBasGaucheY()) ;

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

				players2.get(tirage_re).setX(placeX);
				players2.get(tirage_re).setY(placeY);

			}

			for (int i = 1; i < players2.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 75;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 75;

					players2.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players2.get(i).setY(place_other_y);

				} else {
					
					Player def_1 = players2.get(1) ;
					Player def_2 = players2.get(2) ;
					Player def_3 = players2.get(3) ;
					Player def_4 = players2.get(4) ;
					
					
					if (players2.get(i).equals(def_1) ) {
						
						players2.get(i).setX(450) ;
						players2.get(i).setY(100) ;
						
					} else if (players2.get(i).equals(def_2) ) {
						
						players2.get(i).setX(450) ;
						players2.get(i).setY(265) ;
						
					} else if (players2.get(i).equals(def_3) ) {
						
						players2.get(i).setX(450) ;
						players2.get(i).setY(365) ;
						
					} else if (players2.get(i).equals(def_4) ) {
						players2.get(i).setX(450) ;
						players2.get(i).setY(500) ;
					}
					
				}

			}
			
			for (int i = 1; i < players1.size(); i++) {

				if  (i <= 8) {

					Random corner_place_other_x = new Random();

					int place_other_x = 75;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 75;

					players1.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players1.get(i).setY(place_other_y);

				} else {
					
					int attack_x = 350 ;
					
					Random random_attack = new Random();
					
					int attack_y = random_attack.nextInt(293) ;
					attack_y += 165 ;
					
					players1.get(i).setX(attack_x);
					players1.get(i).setY(attack_y);
				}

			}

			if (tirage_re != borne) {
				receveur_corner = true;
			}

			receveur = players2.get(tirage_re);
		}

		testPass.pass(dash,passeur, receveur);

	}

	public void CornerBasDroite(Dashboard dash) {

		Ball ballon = dash.getBallon();

		ArrayList<Player> players1 = dash.getTeam1().getPlayers();
		ArrayList<Player> players2 = dash.getTeam2().getPlayers();

		while (receveur_corner != true) {

			ballon.setPositionx_Ball(Sortie.getSortieBasDroiteX() - 5);
			ballon.setPositiony_Ball(Sortie.getSortieBasDroiteY() - 10);

			Random tirage = new Random();
			int borne = 6;

			borne = tirage.nextInt(5);

			borne += 5;

			Player player_corner = players1.get(borne);
			
			passeur = player_corner ;
			passeur.setBall(true);

			player_corner.setX(Sortie.getSortieBasDroiteX() - 10);
			player_corner.setY(Sortie.getSortieBasDroiteY());

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

				players1.get(tirage_re).setX(placeX);
				players1.get(tirage_re).setY(placeY);

			}

			for (int i = 1; i < players1.size(); i++) {

				// x 685 et 195 y 165 et 458 // x 195 et 813 y 165 et 458

				if ((i != borne) && (i != tirage_re) && (i >= 5)) {

					Random corner_place_other_x = new Random();

					int place_other_x = 685;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 685;

					players1.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players1.get(i).setY(place_other_y);

				}  else {
					
					Player def_1 = players1.get(1) ;
					Player def_2 = players1.get(2) ;
					Player def_3 = players1.get(3) ;
					Player def_4 = players1.get(4) ;
					
					
					if (players1.get(i).equals(def_1) ) {
						
						players1.get(i).setX(430) ;
						players1.get(i).setY(100) ;
						
					} else if (players1.get(i).equals(def_2) ) {
						
						players1.get(i).setX(430) ;
						players1.get(i).setY(265) ;
						
					} else if (players1.get(i).equals(def_3) ) {
						
						players1.get(i).setX(430) ;
						players1.get(i).setY(365) ;
						
					} else if (players1.get(i).equals(def_4) ) {
						players1.get(i).setX(430) ;
						players1.get(i).setY(500) ;
					}
					
				}

			}
			
			for (int i = 1; i < players2.size(); i++) {

				// x 685 et 195 y 165 et 458 // x 195 et 813 y 165 et 458

				if (i <= 8) {

					Random corner_place_other_x = new Random();

					int place_other_x = 685;

					place_other_x = corner_place_other_x.nextInt(118);

					place_other_x += 685;

					players2.get(i).setX(place_other_x);

					Random corner_place_other_y = new Random();

					int place_other_y = 165;

					place_other_y = corner_place_other_y.nextInt(293);

					place_other_y += 165;

					players2.get(i).setY(place_other_y);

				} else {
					
					int attack_x = 550 ;
					
					Random random_attack = new Random();
					
					int attack_y = random_attack.nextInt(293) ;
					attack_y += 165 ;
					
					players2.get(i).setX(attack_x);
					players2.get(i).setY(attack_y);
				}
			}

			if (tirage_re != borne) {
				receveur_corner = true;
			}

			receveur = players1.get(tirage_re);
		}

		testPass.pass(dash,passeur, receveur);
		
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

}
