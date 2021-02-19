package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;

public class Corner {

	public static void CornerHautGauche(Ball ballon, ArrayList<Player> players) {

		ballon.setPositionx_Ball(Sortie.getSortieHautGaucheX() + 5);
		ballon.setPositiony_Ball(Sortie.getSortieHautGaucheY() + 5);

		Random tirage = new Random();
		int borne = 6;

		borne = tirage.nextInt(5);

		borne += 5;

		Player p = players.get(borne);

		p.setX(Sortie.getSortieHautGaucheX());
		p.setY(Sortie.getSortieHautGaucheY());

	}

	public void CornerHautDroite(Ball ballon, ArrayList<Player> players) {

		ballon.setPositionx_Ball(Sortie.getSortieHautDroiteX() - 5);
		ballon.setPositiony_Ball(Sortie.getSortieHautGaucheY() + 5);

		Random tirage = new Random();
		int borne = 6;

		borne = tirage.nextInt(5);

		borne += 5;

		Player p = players.get(borne);

		p.setX(Sortie.getSortieHautDroiteX());
		p.setY(Sortie.getSortieHautDroiteY());

		for (int i = 0; i <= players.size(); i++) {

			// x 75 et 195 y 165 et 458
			// x 195 et 815 y 165 et 458

			if (i != borne && i >= 6) {

				Random corner_place1_x = new Random();
				int place = 75;

				place = corner_place1_x.nextInt(120);

				players.get(i);

			}

		}
	}

	public void CornerBasGauche(Ball ballon, ArrayList<Player> players) {

		ballon.setPositionx_Ball(Sortie.getSortieBasGaucheX() + 5);
		ballon.setPositiony_Ball(Sortie.getSortieBasGaucheY() - 5);

		Random tirage = new Random();
		int borne = 6;

		borne = tirage.nextInt(5);

		borne += 5;

		Player p = players.get(borne);

		p.setX(Sortie.getSortieBasGaucheX());
		p.setY(Sortie.getSortieBasGaucheY());

	}

	public void CornerBasDroite(Ball ballon, ArrayList<Player> players) {

		ballon.setPositionx_Ball(Sortie.getSortieBasDroiteX() - 5);
		ballon.setPositiony_Ball(Sortie.getSortieBasDroiteY() - 5);

		Random tirage = new Random();
		int borne = 6;

		borne = tirage.nextInt(5);

		borne += 5;

		Player p = players.get(borne);

		p.setX(Sortie.getSortieBasDroiteX());
		p.setY(Sortie.getSortieBasDroiteY());
	}

	public static void main(String[] args) {

		Ball ballon = new Ball(100, 200);

	}

}
