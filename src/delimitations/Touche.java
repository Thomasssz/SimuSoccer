package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;
import gui.Dashboard;
import process.Passe;

public class Touche {
	
	private boolean receveur_touche = false ;
	
	private Player receveur;
	
	Passe testPass = new Passe();

	/*Cette classe simule une touche, elle place un joueur aléatoire et la balle en l'endroit où la balle est sortie.
	 * Ensuite deux joueurs de son équipe se placent à coté de manière a recevoir la balle. */
	
	public void runTouche(int x, int y, Dashboard dash) {
		
		Ball ballon = dash.getBallon() ;
		ArrayList<Player> players = dash.getTeam1() ;
		
		while (receveur_touche != true) {

			ballon.setPositionx_Ball(x);
			ballon.setPositiony_Ball(y);

			Random tirage = new Random();
			int borne = 6 ;

			borne = tirage.nextInt(3);

			borne += 5;
			
			System.out.println(borne);

			Player passeur = players.get(borne);

			passeur.setX(x);
			passeur.setY(y-2);

			// Tirage de la position de la balle

			Random touche_place1_x = new Random();
			
			int placeX = Sortie.getSortieHautGaucheX()+250 ; 

			placeX = touche_place1_x.nextInt(190);

			placeX += Sortie.getSortieHautGaucheX()+250 ;
			
			

			Random touche_place1_y = new Random();
			
			int placeY = Sortie.getSortieHautGaucheY()+2;

			placeY = touche_place1_y.nextInt(88);

			placeY += Sortie.getSortieHautGaucheY()+2;

			// Tirage joueur qui va recevoir la balle

			Random tirage_receveur = new Random();
			int tirage_re = 6;

			tirage_re = tirage_receveur.nextInt(3);

			tirage_re += 5;

			if (tirage_re != borne) {

				players.get(tirage_re).setX(placeX);
				players.get(tirage_re).setY(placeY);

			}

			for (int i = 0; i < players.size(); i++) {

				if ((i != borne) && (i != tirage_re) && (i >= 5) && (i < 9) ) {

					Random touche_place_other_x = new Random();

					int place_other_x = Sortie.getSortieHautGaucheX()+250;

					place_other_x = touche_place_other_x.nextInt(190);

					place_other_x += Sortie.getSortieHautGaucheX()+250;

					players.get(i).setX(place_other_x);
					
					

					Random touche_place_other_y = new Random();

					int place_other_y = Sortie.getSortieHautGaucheY()+2;

					place_other_y = touche_place_other_y.nextInt(88);

					place_other_y += Sortie.getSortieHautGaucheY()+2;

					players.get(i).setY(place_other_y);
					
					System.out.println(i + " Place a X = " + players.get(i).getX() ) ;
					System.out.println(i + " Place a Y = " + players.get(i).getY() ) ;

				}

			}

			if (tirage_re != borne) {

				receveur_touche = true;

			}

			receveur = players.get(tirage_re);
		}
		
		 testPass.pass(dash,receveur);
		
	}

}
