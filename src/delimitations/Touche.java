package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;

public class Touche {

	/*Cette classe simule une touche, elle place un joueur aléatoire et la balle en l'endroit où la balle est sortie.
	 * Ensuite deux joueurs de son équipe se placent à coté de manière a recevoir la balle. */
	public void runTouche(int x, int y, Ball ball, ArrayList<Player> players) {

		ball.setPositionx_Ball(x);
		ball.setPositiony_Ball(y);

		Random tirage = new Random();
		int borne = 2;

		borne = tirage.nextInt(8);

		Player p = players.get(borne);

		p.setX(x + 5);
		p.setY(y + 5);

		
		for (int i = 0; i < 2; i++) {

			int borne2;

			do {

				Random tirage2 = new Random();
				borne2 = 2;

				borne2 = tirage2.nextInt(8);

			} while (borne2 != borne);

			Player p1 = players.get(borne2);

			p1.setX(x - 30);
			p1.setY(y + 30);
			
			

		}

		for (int i = 0; i <= players.size(); i++) {

			// x 75 et 195 y 165 et 458
			// x 195 et 813 y 165 et 458

			if (i != borne && i != 0) {

				Random corner_place1_x = new Random();
				int placeX = 80;

				placeX = corner_place1_x.nextInt(730);

				players.get(i).setX(placeX);

				Random corner_place1_y = new Random();
				int placeY = 60;

				placeY = corner_place1_y.nextInt(513);

				players.get(i).setY(placeY);

			}

		}

	}

}
